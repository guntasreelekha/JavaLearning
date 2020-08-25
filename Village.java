package com.concent;

public class Village {
    public static void main(String args[]) {
        /*
        * To print particular street and houseNum*/
        int street = 3;
        int houseNum;
        if (street == 1) {
            for (houseNum = 1; houseNum <= 100; houseNum++){
                houseNum = 95;
                if (houseNum == 95) {
                    System.out.println("The house Number is " + houseNum);
                    break;
                } else {
                    System.out.println("The house number is not provided in this street");
                    break;
                }
            }
        } else if (street == 2) {
            for (houseNum = 1; houseNum <= 75; houseNum++) {
                houseNum = 76;
                if (houseNum == 75) {
                    System.out.println("The house Number is " + houseNum);
                    break;
                } else {
                    System.out.println("The house Number is not provided in this street");
                    break;
                }
            }
        } else if (street == 3) {
            for (houseNum = 1; houseNum <= 10; houseNum++) {
                houseNum=10;
                if (houseNum == 10) {
                    System.out.println("The house Number is " + houseNum);
                    break;
                } else {
                    System.out.println(" the house number is not provided in this street");
                    break;
                }
            }
        } else if (street == 4) {
            for (houseNum = 1; houseNum <= 10; houseNum++) {
                houseNum = 1;
                if (houseNum == 1) {
                    System.out.println("The house Number is " + houseNum);
                    break;
                } else {
                    System.out.println("The house Number is not provided in this street");
                    break;
                }
            }
        } else {
            System.out.println("This street number is not provided");
        }

    }
}
