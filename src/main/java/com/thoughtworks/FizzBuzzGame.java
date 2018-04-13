package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();
    private Integer fizz;
    private Integer buzz;
    private Integer whizz;

    FizzBuzzGame() {
        fizz = 3;
        buzz = 5;
        whizz = 7;
    }

    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            this.results.add(getAnswer(i));
        }
    }

    public List<String> getResults() {
        return results;
    }

    String getAnswer(int n) {
        if (n % 10 == fizz) {
            return ""+fizz;
        }
        return  null;
    }
}




