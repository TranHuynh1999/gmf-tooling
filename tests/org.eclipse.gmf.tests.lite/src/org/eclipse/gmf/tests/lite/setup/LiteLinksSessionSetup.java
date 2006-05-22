/**
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.tests.lite.setup;

import org.eclipse.gmf.tests.lite.gen.LiteGeneratorConfiguration;
import org.eclipse.gmf.tests.setup.GeneratorConfiguration;
import org.eclipse.gmf.tests.setup.LinksSessionSetup;


public class LiteLinksSessionSetup extends LinksSessionSetup {
	public static LinksSessionSetup getInstance() {
		if (factoryClosed) {
			return null;
		}
		return new LiteLinksSessionSetup();
	}

	protected GeneratorConfiguration createGeneratorConfiguration() {
		return new LiteGeneratorConfiguration();
	}
}
