package com.concent;

public class TrafficSignal{
    public static void main(String args[]) {
        /*
         * to check color of the signal*/
        String color = "Orange";
        if (color.equals("green")){
            System.out.println("Vehicle can move");
        } else if (color.equalsIgnoreCase("orange")) {
            System.out.println("Vehicle can be ready to move and stop");
        } else {
            System.out.println("Vehicle should be stop");
        }
    }
}

