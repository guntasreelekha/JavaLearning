package com.concent;

//Demonstrate boolean values
public class BoolTest {
    public static void main(String args[]) {
        boolean b;
        b = false;
        System.out.println("b is false");
        b = true;
        System.out.println("b is true");
        //A boolean value can control the if statement
        if (b) System.out.println("This is executed.");
        b = false;
        if (b) System.out.println("This is not executed.");
        //outcome of a relational operator is a boolean value
        System.out.println("10>9 is " + (10 > 9));
    }
}
