package com.thoughtworks;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FizzBuzzGameTest {
    @Test
    public void should_return_Fizz_when_have_3() {
       assertEquals("Fizz", new FizzBuzzGame().getAnswer(3));
        assertNotEquals("Fizz", new FizzBuzzGame().getAnswer(13));
    }
    @Test
    public void should_return_Fizz_when_have_3_times() {
         assertEquals("Fizz", new FizzBuzzGame().getAnswer(6));
    }

    @Test
    public void should_return_Buzz_when_have_5() {
       assertEquals("Buzz", new FizzBuzzGame().getAnswer(5));
    }

    @Test
    public void should_return_Buzz_when_have_5_times() {
        assertEquals("Buzz", new FizzBuzzGame().getAnswer(6));
    }

    @Test
    public void should_return_Whizz_when_have_7() {
        assertEquals("Whizz", new FizzBuzzGame().getAnswer(7));
    }
    @Test
    public void should_return_Whizz_when_have_7_times() {
        assertEquals("Whizz", new FizzBuzzGame().getAnswer(14));
    }

    @Test
    public void should_return_FizzBuzz_when_have_15() {
        assertEquals("FizzBuzz", new FizzBuzzGame().getAnswer(15));
    }

    @Test
    public void should_return_FizzWhizz_when_have_21() {
        assertEquals("FizzWhizz", new FizzBuzzGame().getAnswer(21));
    }

    @Test
    public void should_return_Fizz_when_have_35() {
        assertEquals("Fizz", new FizzBuzzGame().getAnswer(35));
    }

    @Test
    public void should_return_BuzzWhizz_when_have_70() {
       assertEquals("BuzzWhizz", new FizzBuzzGame().getAnswer(70));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_have_105() {
        assertEquals("FizzBuzzWhizz", new FizzBuzzGame().getAnswer(105));
    }

}
