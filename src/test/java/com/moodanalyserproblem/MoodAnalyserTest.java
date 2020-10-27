package com.moodanalyserproblem;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import com.customexp.MoodAnalysisException;

public class MoodAnalyserTest {

	static MoodAnalyser mood;

	@Test
	public void testAnalyseAbilityMethod_thenAssertionHappy() {
		mood = new MoodAnalyser("I am in Happy Mood");
		try {
			assertEquals("HAPPY", MoodAnalyser.analyseability());
		} catch (MoodAnalysisException e) {
		}
	}

	@Test
	public void testAnalyseAbilityMethod_thenAssertionSad() {
		mood = new MoodAnalyser("I am in Sad Mood");
		try {
			assertEquals("SAD", MoodAnalyser.analyseability());
		} catch (MoodAnalysisException e) {
		}
	}	
		
	@Test
	public void testgivenNullMoodShouldReturnHaappy_thenAssertionHappy() {
		mood = new MoodAnalyser(null);
		try {
			assertEquals("HAPPY", MoodAnalyser.analyseability());
		} catch (MoodAnalysisException e) {
		}
	}
	
	@Test
	public void testgivenNullMoodShouldThrowMoodAnalysis_thenAssertionHappy() {
		mood = new MoodAnalyser(null);
		try {
			MoodAnalyser.analyseability();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals("Please enter proper message",e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testgivenEmptyMoodShouldThrowMoodAnalysis_thenAssertionHappy() {
		mood = new MoodAnalyser(" ");
		try {
			MoodAnalyser.analyseability();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals("Please enter other than empty message",e.getMessage());
			e.printStackTrace();
		}
	}
}
