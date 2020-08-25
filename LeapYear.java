package com.concent;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2020;
        if (year % 4 == 0) {
            System.out.println(" Leap Year :" + year);
        } else {
            System.out.println("  not a Leap Year  :" + year);
        }
    }
}
