/**
 * Copyright (c) 2008 Borland Software Corp.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alexander Shatalin (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.xpand.migration;

import org.eclipse.emf.ecore.EClassifier;

public class TypeSelectExpressionTrace extends ExpressionAnalyzeTrace {

	private EClassifier targetType;

	public TypeSelectExpressionTrace(EClassifier result, EClassifier targetType) {
		super(result);
		this.targetType = targetType;
	}

	public EClassifier getTargetType() {
		return targetType;
	}

	public boolean isValid() {
		return getResultType() != null;
	}

}
