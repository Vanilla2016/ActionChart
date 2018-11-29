package com.gamebooks.lonewolf.combat;

import junit.framework.TestCase;

public class CombatUtilsTest extends TestCase {

	public final void testGetRandomNumber() {
		for (int i = 0; i < 100; i++)
			assertTrue(Integer.class.isInstance(CombatUtils.getRandomNumber()));
		    
		
	}

}
