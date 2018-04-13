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


}
