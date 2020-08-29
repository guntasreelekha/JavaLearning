package com.concent;

public class DepartmentAndYearOfEngineering {
    public static void main(String args[]) {
        /*
         * To check the student is studying which branch and which year*/
        String branch = "CSE";
        int totalYear = 4;
        int year;
        if (branch.equals("CSE")) {
            System.out.println("Student is studying in " + branch + " Department");
            for (totalYear = 1; totalYear <= 4; totalYear++) {
                year = 2;
                if (year == 1) {
                    System.out.println("Student is studying  " + year + "st year");
                    break;
                } else if (year == 2) {
                    System.out.println("Student is studying " + year + "nd year");
                    break;
                } else if (year == 3) {
                    System.out.println("Student is studying " + year + "rd year");
                    break;
                } else if (year == 4) {
                    System.out.println("Student is studying " + year + "th year");
                    break;
                } else {
                    System.out.println("year " + year + " is not provided");
                }
            }
        } else if (branch.equals("ECE")) {
            System.out.println("Student is studying in " + branch + " Department");
            for (totalYear = 1; totalYear <= 4; totalYear++) {
                year = 4;
                if (year == 1) {
                    System.out.println("Student is studying " + year + "st year");
                } else if (year == 2) {
                    System.out.println("Student is studying " + year + "nd year");
                } else if (year == 3) {
                    System.out.println("Student is studying " + year + "rd year");
                } else if (year == 4) {
                    System.out.println("Student is studying " + year + "th year");
                } else {
                    System.out.println("year " + year + " is not provided");
                }
            }
        } else if (branch.equals("EEE")) {
            System.out.println("Student is studying in " + branch + " Department");
            for (totalYear = 1; totalYear <= 4; totalYear++) {
                year = 4;
                if (year == 1) {
                    System.out.println("Student is studying " + year + "st year");
                } else if (year == 2) {
                    System.out.println("Student is studying " + year + "nd year");
                } else if (year == 3) {
                    System.out.println("Student is studying " + year + "rd year");
                } else if (year == 4) {
                    System.out.println("Student is studying " + year + "th year");
                } else {
                    System.out.println("year " + year + " is not provided");

                }
            }
        } else if (branch.equals("MEC")) {
            System.out.println("Student is studying in " + branch + " Department");
            for (totalYear = 1; totalYear <= 4; totalYear++) {
                year = 3;
                if (year == 1) {
                    System.out.println("Student is studying " + year + "st year");
                } else if (year == 2) {
                    System.out.println("Student is studying " + year + "nd year");
                } else if (year == 3) {
                    System.out.println("Student is studying " + year + "rd year");
                } else if (year == 4) {
                    System.out.println("Student is studying " + year + "th year");
                } else {
                    System.out.println("year " + year + " is not provided");
                }
            }
        } else if (branch.equals("CIVIL")) {
            System.out.println("Student is studying in " + branch + " Department");
            for (totalYear = 1; totalYear <= 4; totalYear++) {
                year = 2;
                if (year == 1) {
                    System.out.println("Student is studying " + year + "st year");
                } else if (year == 2) {
                    System.out.println("Student is studying " + year + "nd year");
                } else if (year == 3) {
                    System.out.println("Student is studying " + year + "rd year");
                } else if (year == 4) {
                    System.out.println("Student is studying " + year + "th year");
                } else {
                    System.out.println("year " + year + " is not provided");
                }
            }
        } else {
            System.out.println("Department " + branch + " is not provided");
        }
    }


}
