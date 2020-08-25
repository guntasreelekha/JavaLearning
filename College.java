package com.concent;

public class College {
    public static void main(String args[]) {
        char block = 'b';
        int floor;
        /*
         * to print  the particular block and floor in the college*/
        if (block == 'a') {
            for (floor = 1; floor <= 3; floor++) {
                floor = 1;
                if (floor == 1) {
                    System.out.println("Floor " + floor + "  is office room");
                } else if (floor == 2) {
                    System.out.println("Floor " + floor + " is FME department");
                } else {
                    System.out.println("Floor " + floor + "is in 3rd floor :" + floor);
                }
            }
        } else if (block == 'b') {
            for (floor = 1; floor <= 3; floor++) {
                floor = 3;
                if (floor == 1) {
                    System.out.println("Floor" + floor + " is lab for CSE");
                } else if (floor == 2) {
                    System.out.println("Floor" + floor + " is CSE Department");

                } else {
                    System.out.println("Floor" + floor + " is MCA Department");
                }
            }
        } else if (block == 'c') {
            for (floor = 1; floor <= 3; floor++) {
                floor = 2;
                if (floor == 1) {
                    System.out.println("Floor " + floor + " is ECE department");
                } else if (floor == 2) {
                    System.out.println("Floor " + floor + " is lab for ECE");
                } else {
                    System.out.println("Floor " + floor + " Placement cell");
                }
            }
        } else if (block == 'd') {
            for (floor = 1; floor <= 3; floor++) {
                floor = 2;
                if (floor == 1) {
                    System.out.println("Floor " + floor + " is EEE department ");
                } else if (floor == 2) {
                    System.out.println("Floor " + floor + " is lab for EEE");
                }
            }
        }else{
            System.out.println("This block is not provided ");
        }
    }
}
