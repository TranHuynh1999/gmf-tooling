package org.eclipse.gmf.tests.samples;

import org.eclipse.gmf.tests.setup.RuntimeBasedGeneratorConfiguration;


public class PinsSampleTest extends BaseSampleTest {

	public static final String GIT_GMFGEN_PATH = "platform:/plugin/org.eclipse.gmf.tooling.examples.pins/model/pins.gmfgen";
	
	public PinsSampleTest(String name) {
		this(name, new RuntimeBasedGeneratorConfiguration());
	}

	public PinsSampleTest(String name, RuntimeBasedGeneratorConfiguration genConfig) {
		super(name, genConfig);
	}
	
	@Override
	protected String getRelativeGMFGENPath() {
		return GIT_GMFGEN_PATH;
	}
}
