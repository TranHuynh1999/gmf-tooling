/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.gmf.internal.xpand.ast;

import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.internal.xpand.BuiltinMetaModel;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.EvaluationException;
import org.eclipse.gmf.internal.xpand.expression.ast.Expression;
import org.eclipse.gmf.internal.xpand.expression.ast.Identifier;
import org.eclipse.gmf.internal.xpand.model.XpandExecutionContext;

/**
 * @author Sven Efftinge
 */
public class FileStatement extends Statement {

    private final Expression fileName;

    private final Statement[] body;

    private final Identifier mode;

    public FileStatement(final int start, final int end, final int line, final int startOffset, final int endOffset, final Expression fileName,
            final Statement[] body, final Identifier mode) {
        super(start, end, line, startOffset, endOffset);
        this.fileName = fileName;
        this.body = body;
        this.mode = mode;
    }

    public Statement[] getBody() {
        return body;
    }

    public Expression getTargetFileName() {
        return fileName;
    }

    public Identifier getMode() {
        return mode;
    }

    public void analyze(final XpandExecutionContext ctx, final Set<AnalysationIssue> issues) {
        final EClassifier result = getTargetFileName().analyze(ctx, issues);
        if (!BuiltinMetaModel.isAssignableFrom(EcorePackage.eINSTANCE.getEString(), result)) {
            issues.add(new AnalysationIssue(AnalysationIssue.Type.INCOMPATIBLE_TYPES, "String expected!",
                    getTargetFileName()));
        }
        for (Statement element : body) {
            element.analyze(ctx, issues);
        }
    }

    @Override
    public void evaluateInternal(final XpandExecutionContext ctx) {
        final Object result = getTargetFileName().evaluate(ctx);
        if (result == null) {
			throw new EvaluationException("Nullevaluation", getTargetFileName());
		}
        final String fileName = result.toString();
        String modeVal = null;
        if (mode != null) {
            modeVal = mode.getValue();
        }
        ctx.getOutput().openFile(fileName, modeVal);
        for (Statement element : body) {
            element.evaluate(ctx);
        }
        ctx.getOutput().closeFile();
    }
}
