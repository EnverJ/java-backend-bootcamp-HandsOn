package io.javabrains.javabasics;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArrayChallenge {

    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        int sum = Arrays.stream(array).sum();
        OptionalDouble ave = Arrays.stream(array).average();
        OptionalInt larg = Arrays.stream(array).max();
        System.out.println("sum = " + sum);
        System.out.println("ave = " + ave.orElse(0));
        System.out.println("larg = " + larg.orElse(0));


    }
}
