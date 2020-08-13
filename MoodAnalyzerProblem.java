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
     * if null returns Happy
     */
    public String analyzeMood() {
        try {
            return message.contains("Sad") ? "SAD" : "HAPPY";
        } catch (NullPointerException e) {
            return "Happy";
        }
    }
}

