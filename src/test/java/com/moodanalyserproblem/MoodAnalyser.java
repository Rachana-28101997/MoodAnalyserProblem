package com.moodanalyserproblem;

import com.customexp.MoodAnalysisException;

public class MoodAnalyser {

	static String message;

	public MoodAnalyser() {
		super();
	}

	@SuppressWarnings("static-access")
	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}

	public static String analyseability() throws MoodAnalysisException {
		try {
			if (message.contains("Sad"))
				return "SAD";
		} catch (NullPointerException e) {
			if(message == null) {
				throw new MoodAnalysisException("Please enter proper message");
			}
			if(message.trim() == "") {
				throw new MoodAnalysisException("Please enter other than empty message");
			}
		}
		return "HAPPY";
	}
}