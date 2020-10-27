package com.moodanalyserproblem;

public class MoodAnalyser {

	String message;

	public MoodAnalyser() {
		super();
	}

	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}

	public String analyseability() {
		try {
			if (message.contains("Sad"))
				return "SAD";
			return "HAPPY";
		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}
}

