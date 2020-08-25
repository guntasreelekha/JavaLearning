package com.concent;

public class Fibonacci {
    public static void main(String[] args) {

        int count = 8, a = 0, b = 1;
        /**On each iteration, we are assigning second number
         * to the first number and assigning the sum of last two
         * numbers to the second number
         */
        System.out.print("Fibonacci Series of " + count + " numbers:");
        if (a >= 0) {
            for (int i = 1; i <= count; i++) {
                System.out.print(" " + a);
                int c = a + b;
                a = b;
                b = c;
            }
        } else {
            System.out.println("The number is negative");
        }
    }
}
