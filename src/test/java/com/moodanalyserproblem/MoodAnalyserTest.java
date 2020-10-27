package com.moodanalyserproblem;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyserTest {

	static MoodAnalyser mood;

	@Test
	public void testAnalyseAbilityMethod_thenAssertionHappy() {
		mood = new MoodAnalyser("I am in Happy Mood");
		assertEquals("HAPPY", mood.analyseability());
	}

	@Test
	public void testAnalyseAbilityMethod_thenAssertionSad() {
		mood = new MoodAnalyser("I am in Sad Mood");
		assertEquals("SAD", mood.analyseability());
	}
}
