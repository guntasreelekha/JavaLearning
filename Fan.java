package com.concent;

public class Fan {
    public static void main(String args[]) {
        /*
         * Fan is rotate or not and power is supplied or not*/
        String power = "on";
        String Switch = "on";
        if (power.equalsIgnoreCase("off")) {
            System.out.println("The power will not supply to the house");
        } else {
            System.out.println("The power will be supplied to the house ");
            if (Switch.equalsIgnoreCase("on")) {
                System.out.println("The fan will rotate ");
            } else {
                System.out.println("The will not rotate");
            }
        }
    }
}
