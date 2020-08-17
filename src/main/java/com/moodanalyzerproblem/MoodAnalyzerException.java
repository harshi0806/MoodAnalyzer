package com.moodanalyzerproblem;

public class MoodAnalyzerException extends RuntimeException {
    ExceptionType type;

    /** Enum used for fixed set of possible values
     *  Fixed values : NULL, EMPTY
     */
    enum ExceptionType {
        NULL, EMPTY
    }

    /**
     * Constructor for Custom Exception
     * @param type NULL, EMPTY
     * @param exceptionMessage Happy, Empty Mood
     */
    public MoodAnalyzerException(ExceptionType type,String exceptionMessage) {
        super(exceptionMessage);
        this.type = type;
    }
}
