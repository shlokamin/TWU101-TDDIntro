package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {

        if (i<0){
            throw new IllegalArgumentException("number cannot be negative");
        }

        int factorial = 1;

        if (i>1) {
            for (int j = 2; j <= i ; j++) {
                factorial*=j;
            }
        }
        return factorial;
    }
}
