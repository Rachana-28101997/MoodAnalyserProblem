package com.moodanalyserproblem;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyserTest {

	static MoodAnalyser mood;

	@BeforeClass
	public static void createMoodAnalyserObj() {
		mood = new MoodAnalyser();
	}
	
	@AfterClass
	public static void nullObj() {
		mood = null;
	}

	@Test
	public void testAnalyseAbilityMethod_thenAssertionHappy() {
		assertEquals("HAPPY", mood.analyseability("I am in Happy Mood"));
	}

	@Test
	public void testAnalyseAbilityMethod_thenAssertionSad() {
		assertEquals("SAD", mood.analyseability("I am in Sad Mood"));
	}
}