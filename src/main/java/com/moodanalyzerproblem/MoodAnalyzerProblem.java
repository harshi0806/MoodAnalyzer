package com.moodanalyzerproblem;

public class MoodAnalyzerProblem {
    private final String message;

    // Parameterized Constructor
    public MoodAnalyzerProblem(String message) {
        this.message = message;
    }

    /**
     * Method To Analyze Mood
     * @return Mood
     * if NULL returns Happy Mood
     * if EMPTY returns Empty Mood
     */
    public String analyzeMood() {
        try {
            // If message is Empty throwing Custom Exception
            if (message.length() == 0) {
                throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.EMPTY, "Empty Mood");
            }

            return message.contains("Sad") ? "SAD" : "HAPPY";

        } catch (NullPointerException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.NULL, "Happy");
        }
    }
}

