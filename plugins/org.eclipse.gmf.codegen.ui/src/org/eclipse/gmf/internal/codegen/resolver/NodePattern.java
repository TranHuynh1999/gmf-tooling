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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

public class NodePattern extends TypePattern {

	public NodePattern(EClass type, EAttribute[] labels) {
		super(type, labels);
	}
}
