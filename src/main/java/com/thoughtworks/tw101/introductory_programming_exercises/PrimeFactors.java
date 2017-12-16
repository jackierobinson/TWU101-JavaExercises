package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
    }

    private static List<Integer> generate(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0 && isPrime(i))
                primeFactors.add(i);
        }
        return primeFactors;
    }

    private static boolean isPrime(int num) {
        if (num == 2 || num == 1)
            return true;
        if (num % 2 == 0)
            return false;
        double largestPotentialPrime = Math.round(Math.sqrt(num));
        for (int i = 3; i <= largestPotentialPrime; i = i + 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

}
