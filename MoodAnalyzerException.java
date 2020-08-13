package com.moodanalyzerproblem;

public class MoodAnalyzerException extends RuntimeException {

    // Initializing Exception Type
    ExceptionType type;

    /**
     * Enum for the Exception Types
     */
    enum ExceptionType {
        NULL, EMPTY
    }

    /**
     * Constructor for Custom Exception
     * @param type
     * @param exceptionMessage
     */
    public MoodAnalyzerException(ExceptionType type,String exceptionMessage) {
        super(exceptionMessage);
        this.type = type;
    }
}
