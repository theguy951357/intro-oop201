package edu.unca.csci201;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LightbulbTest {
	Lightbulb myLightbulb;

	@Before
	public void createLightbulb() {
		myLightbulb = new Lightbulb();
	}

	@Test
	public void testLightbulbState() {

		boolean isOn = myLightbulb.getState();
		boolean alive = myLightbulb.checkLife();

		assertTrue("Lightbulb is on when it should be off", isOn == false);
		assertTrue("Lightbulb should have 0 lumens when it is off", myLightbulb.getLumens() == 0);

		myLightbulb.toggle();

		isOn = myLightbulb.getState();

		assertTrue("Lightbulb is off when it should be on", isOn == true);
		assertTrue("Lightbulb should start at 700 lumenswhen it first turns on", myLightbulb.getLumens() == 700);

		myLightbulb.toggle();

		isOn = myLightbulb.getState();

		assertTrue("Lightbulb is on when it should be off", isOn == false);
		assertTrue("Lightbulb should have 0 lumens when it is off", myLightbulb.getLumens() == 0);
		assertTrue("lightBulb should not be broken.", myLightbulb.checkLife() == true);

		myLightbulb.toggle();

		isOn = myLightbulb.getState();

		assertTrue("Lightbulb is off when it should be on", isOn == true);
		assertTrue("Lightbulb should have 699 lumens", myLightbulb.getLumens() == 699);

		for (int i = 0; i < 1400; i++) {
			myLightbulb.toggle();

		}

		myLightbulb.checkLife();

		assertTrue("lightbulb should be broken", myLightbulb.checkLife() == false);

		assertTrue("lumens can not be less than 0", myLightbulb.getLumens() == 0);

	}

}
