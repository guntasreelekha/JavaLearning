package com.concent;

//Compute distance light travels using long variables
public class Light {
    public static void main(String args[]) {
        long lightSpeed;
        long days;
        long seconds;
        long distance;
        //approximate speed of light in miles per second
        lightSpeed = 14365;
        //specify number of days here
        days = 2000;
        //convert to seconds
        seconds = days * 24 * 60 * 60;
        //compute distance
        distance = lightSpeed * seconds;
        System.out.println("In " + days);
        System.out.print("days light will travel about ");
        System.out.println(distance + "miles.");
    }
}
