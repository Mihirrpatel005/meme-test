package com.comcast.csv.meme_test;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringParsingProblemTest {

	@Test
	public void testIsAddressValid() {

		StringParsingProblem spt = new StringParsingProblem();
		assertEquals(true, spt.isAddressValid("25w873 Apple St."));

	}

	@Test
	public void testGetDistanceFromCityCenter() {

		StringParsingProblem spt = new StringParsingProblem();
		assertEquals(25, spt.getDistanceFromCityCenter("25w873 Apple St."));

	}

}
