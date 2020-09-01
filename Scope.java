package com.concent;

//Demonstrate block scope
public class Scope {
    public static void main(String args[]) {
        //known to all code within main
        int x;
        x = 10;
        //starts new scope
        if (x == 10) {
            //known only to this block
            int y = 20;
            //x and y both known here
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
            System.out.println("The x value is :" + x);
        }
        //y=100;//Error! y not known here
        //x is still known here
        System.out.println("the value of x : " + x);
    }
}
