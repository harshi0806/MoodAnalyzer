package com.moodanalyzerproblem;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerProblemTest {
    private String mood;
    private MoodAnalyzerProblem checkMood;

    /**
     * Function checking when mood is Sad
     */
    @Test
    public void givenMood_whenSad_shouldReturnSad() {
        checkMood = new MoodAnalyzerProblem("I am in Sad Mood");
        mood = checkMood.analyzeMood();
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }

    /**
     * Function checking when mood is Happy
     */
    @Test
    public void givenMood_whenHappy_shouldReturnHappy() {
        checkMood = new MoodAnalyzerProblem("I am in Happy Mood");
        mood = checkMood.analyzeMood();
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }
    /**
     * Test for Custom Exception Handling: Null
     */
    @Test
    public void givenMood_whenNull_returnHappy() {
        checkMood = new MoodAnalyzerProblem(null);
        try {
            mood = checkMood.analyzeMood();
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals("Happy", e.getMessage());
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.NULL, e.type);
        }
    }

    /**
     * Test for Custom Exception Handling: Empty Message
     */
    @Test
    public void givenMood_whenEmpty_returnEmptyMood() {
        checkMood = new MoodAnalyzerProblem("");
        try {
            mood = checkMood.analyzeMood();
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals("Empty Mood", e.getMessage());
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.EMPTY, e.type);
        }
    }
}

