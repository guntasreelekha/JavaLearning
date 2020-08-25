package com.concent;

public class Door {
    public static void main(String args[]) {
        //to check that key is opened or not
        String key = "open";
        if (key.equalsIgnoreCase("open")) {
            for (int i = 0; i <= 5; i++) {
                System.out.println("The door is opened");
            }
        } else {
            for(int i = 0; i <= 5; i++) {
                System.out.println("The door is not opened");
            }
        }
    }
}
