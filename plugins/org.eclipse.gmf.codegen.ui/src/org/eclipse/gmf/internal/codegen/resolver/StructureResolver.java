/*
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    dstadnik - initial API and implementation
 */
package org.eclipse.gmf.internal.codegen.resolver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

public class StructureResolver {

	private Vocabulary nodeVocabulary;

	private Vocabulary linkVocabulary;

	private Vocabulary linkSourceVocabulary;

	private Vocabulary linkTargetVocabulary;

	public StructureResolver() {
		nodeVocabulary = new Vocabulary();
		nodeVocabulary.add(new String[] { "node", "item" });
		linkVocabulary = new Vocabulary();
		linkVocabulary.add(new String[] { "link", "connection", "relation", "dependency", "flow" });
		linkSourceVocabulary = new Vocabulary();
		linkSourceVocabulary.add(new String[] { "source", "src", "from" });
		linkTargetVocabulary = new Vocabulary();
		linkTargetVocabulary.add(new String[] { "destination", "dst", "dest", "to" });
	}

	protected boolean guessNode(EClass type) {
		return nodeVocabulary.containsWords(type.getName());
	}

	protected boolean guessLink(EClass type) {
		return linkVocabulary.containsWords(type.getName());
	}

	protected EReference guessLinkSource(EReference[] refs) {
		for (int i = 0; i < refs.length; i++) {
			if (linkSourceVocabulary.containsWords(refs[i].getName())) {
				return refs[i];
			}
		}
		return null;
	}

	protected EReference guessLinkTarget(EReference[] refs) {
		for (int i = 0; i < refs.length; i++) {
			if (linkTargetVocabulary.containsWords(refs[i].getName())) {
				return refs[i];
			}
		}
		return null;
	}

	public TypePattern resolve(EClass type) {
		EAttribute[] labels = getLabels(type);
		EReference[] refs = getEAllNonContainments(type, true);
		if (refs.length < 2 || guessNode(type)) {
			return new NodePattern(type, labels);
		}
		EReference source = guessLinkSource(refs);
		EReference target = guessLinkTarget(refs);
		if (source == null) {
			source = target == refs[0] ? refs[1] : refs[0];
		}
		if (target == null) {
			target = source == refs[1] ? refs[0] : refs[1];
		}
		return new TypeLinkPattern(type, labels, source, target);
	}

	protected EAttribute[] getLabels(EClass type) {
		List attrs = new ArrayList();
		for (Iterator it = type.getEAllAttributes().iterator(); it.hasNext();) {
			EAttribute attr = (EAttribute) it.next();
			attrs.add(attr);
		}
		return (EAttribute[]) attrs.toArray(new EAttribute[attrs.size()]);
	}

	protected EReference[] getEAllNonContainments(EClass type, boolean excludeSelf) {
		List refs = new ArrayList();
		for (Iterator it = type.getEAllReferences().iterator(); it.hasNext();) {
			EReference ref = (EReference) it.next();
			if (excludeSelf && ref.getEReferenceType().isSuperTypeOf(type)) {
				continue;
			}
			if (!ref.isContainment() && !ref.isMany()) {
				refs.add(ref);
			}
		}
		return (EReference[]) refs.toArray(new EReference[refs.size()]);
	}
}
