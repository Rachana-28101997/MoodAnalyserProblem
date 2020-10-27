package com.moodanalyserproblem;

	public class MoodAnalyser {

		public String analyseability(String message) {
			if (message.contains("Sad"))
				return "SAD";
			return "HAPPY";
		}
	}


