package com.moodanalyzerproblem;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerProblemTest {
    private String mood;
    private MoodAnalyzerProblem checkMood;

    //Function checking when mood is Sad
    @Test
    public void givenMood_whenSad_shouldReturnSad() {
        checkMood = new MoodAnalyzerProblem("I am in Sad Mood");
        mood = checkMood.analyzeMood();
        Assert.assertEquals("SAD", mood);
    }

    //Function checking when mood is Happy
    @Test
    public void givenMood_whenHappy_shouldReturnHappy() {
        checkMood = new MoodAnalyzerProblem("I am in Happy Mood");
        mood = checkMood.analyzeMood();
        Assert.assertEquals("HAPPY", mood);
    }

    //Function checking when mood is any mood
    @Test
    public void givenMood_whenAnyMood_shouldReturnHappy() {
        checkMood = new MoodAnalyzerProblem("I am in ANY mood");
         mood = checkMood.analyzeMood();
        Assert.assertEquals("HAPPY", mood);
    }

    //Test for Custom Exception Handling Happy Message when given mood is Null
    @Test
    public void givenMood_whenNull_shouldReturnHappy() {
        checkMood = new MoodAnalyzerProblem(null);
        try {
            mood = checkMood.analyzeMood();
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals("Happy", e.getMessage());
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.NULL, e.type);
        }
    }

    //Test for Custom Exception Handling Empty Message when given mood is Empty
    @Test
    public void givenMood_whenEmpty_shouldReturnEmptyMood() {
        checkMood = new MoodAnalyzerProblem("");
        try {
            mood = checkMood.analyzeMood();
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals("Empty Mood", e.getMessage());
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.EMPTY, e.type);
        }
    }
}

