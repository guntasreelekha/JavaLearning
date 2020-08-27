package com.concent;

public class Village {
    public static void main(String args[]) {
        /*
         * To print particular street and houseNum*/
        int street = 2;
        int houseNum;

        if (street == 1) {
            int visitingHouse=95;
            for (houseNum = 1; houseNum <= 100; houseNum++) {
                if (visitingHouse == houseNum) {
                    System.out.println("The house Number is " +visitingHouse);
                    break;
                } else {
                    System.out.println("The house number is not provided ");
                }
            }
        } else if (street == 2) {
            for (houseNum = 1; houseNum <= 75; houseNum++) {
                int visitingHouse = 73;
                if (houseNum == visitingHouse) {
                    System.out.println("The house Number is " +visitingHouse);
                    break;
                } else {
                    System.out.println("The house Number is not provided in this street");
                }
            }
        } else if (street == 3) {
            for (houseNum = 1; houseNum <= 10; houseNum++) {
                int visitingHouse= 10;
                if (houseNum == visitingHouse) {
                    System.out.println("The house Number is " + visitingHouse);
                    break;
                } else {
                    System.out.println(" the house number is not provided in this street");
                }
            }
        } else if (street == 4) {
            for (houseNum = 1; houseNum <= 10; houseNum++) {
                int visitingHouse = 1;
                if (houseNum == visitingHouse) {
                    System.out.println("The house Number is " + visitingHouse);
                    break;
                } else {
                    System.out.println("The house Number is not provided in this street");
                }
                break;
            }
        } else {
            System.out.println("This street number is not provided");
        }

    }
}
