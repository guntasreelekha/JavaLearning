package com.concent;

public class Swapping {
    public static void main(String args[]) {
        int a, b, c;
        a = 5;
        b = 10;
        /**
         * Swapping functionality assigning a value to b and b value to a
         */
        System.out.println("The value of a :" + a);
        System.out.println("The value of b :" + b);
        c = a;
        System.out.println("the value of c :" +c);
        a = b;
        b = c;
        System.out.println("The value of a after swapping:" + a);
        System.out.println("The value of b after swapping :" + b);
    }
}
