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

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Vocabulary {

	private Set words = new HashSet();

	public void add(String[] words) {
		for (int i = 0; i < words.length; i++) {
			if (words[i] != null) {
				this.words.add(words[i].toLowerCase());
			}
		}
	}

	public void add(String word) {
		if (word != null) {
			words.add(word.toLowerCase());
		}
	}

	public boolean containsWords(String s) {
		s = s.toLowerCase();
		for (Iterator it = words.iterator(); it.hasNext();) {
			String word = (String) it.next();
			if (s.indexOf(word) >= 0) {
				return true;
			}
		}
		return false;
	}
}
