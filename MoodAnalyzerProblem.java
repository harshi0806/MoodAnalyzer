package com.moodanalyzerproblem;

public class MoodAnalyzerProblem {
    private String message;

    // Default Constructor
    public MoodAnalyzerProblem() {
    }

    // Parameterized Constructor
    public MoodAnalyzerProblem(String message) {
        this.message = message;
    }

    /**
     * Method To Analyze Mood
     * @return Mood
     * Refactored: Removed message parameter
     */
    public String analyzeMood() {
        return message.contains("Sad") ? "SAD" : "HAPPY";
    }
}

