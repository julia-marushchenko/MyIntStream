/**
 *  Java program to create a Stream with 14 random integer elements.
 */
package com.mystream;

import java.util.Random;
import java.util.stream.IntStream;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating a stream with integers.
        Random random = new Random();
        IntStream myStream = random.ints(14);

        // Printing myStream to console.
        myStream.forEach(System.out::println);

    }
}