package com.moodanalyzerproblem;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerProblemTest {
    private String mood;
    private MoodAnalyzerProblem checkMood;

    /**
     * Function checking when mood is Sad
     * Refactor: Passing parameter while creating MoodAnalyzer Object
     * Removed parameter while calling analyzeMood Method
     */
    @Test
    public void givenMood_whenSad_shouldReturnSad() {
        checkMood = new MoodAnalyzerProblem("I am in Sad Mood");
        mood = checkMood.analyzeMood();
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }

    /**
     * Function checking when mood is Happy
     * Refactor: Passing parameter while creating MoodAnalyzer Object
     * Removed parameter while calling analyzeMood Method
     */
    @Test
    public void givenMood_whenHappy_shouldReturnHappy() {
        checkMood = new MoodAnalyzerProblem("I am in Happy Mood");
        mood = checkMood.analyzeMood();
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }
    /**
     * Function to test for Exception Handling
     */
    @Test
    public void givenMood_whenNull_shouldReturnHappy() {
        checkMood = new MoodAnalyzerProblem(null);
        mood = checkMood.analyzeMood();
        Assert.assertThat(mood, CoreMatchers.is("Happy"));
    }
}
