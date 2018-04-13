package com.thoughtworks;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FizzBuzzGameTest {
    @Test
    public void should_return_Fizz_when_have_3() {
        FizzBuzzGame game = new FizzBuzzGame();
        int num1 = 3;
        int num2 = 13;
        String fizz = "Fizz";
        assertEquals(fizz, game.getAnswer(num1));
        assertNotEquals(fizz, game.getAnswer(num2));
    }

}
