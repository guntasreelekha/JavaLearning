package com.concent;

//Demonstrate dynamic initialization
public class DynamicInitialization {
    public static void main(String args[]) {
        double a = 2.5, b = 6.8;
        //c is dynamically initialized
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Hypotenuse is :" + c);
    }
}
