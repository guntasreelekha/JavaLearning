package com.concent;

public class SwapWithoutUsingThirdVariable {
        public static void main(String args[]) {
            int a, b;
            a = 30;
            b = 15;
            System.out.println("The value of a:" + a);
            System.out.println("The value of b :" + b);
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("The value of a after swapping :" + a);
            System.out.println("The value of b after swapping:" + b);

        }
}
