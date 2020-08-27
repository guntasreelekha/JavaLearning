package com.concent;

public class DepartmentAndYear {
    public static void main(String args[]) {
        /*
         * To check the student is studying which branch and which year*/
        String branch = "ECE";
        int year = 3;
        if (branch.equals("CSE")) {
            System.out.println("Student is studying in " + branch + " Department");
            for (year = 1; year <= 4; year++) {
                if (year == 1) {
                    System.out.println("Student is studying " + year + "st year");
                    break;
                } else if (year == 2) {
                    System.out.println("Student is studying " + year + "nd year");
                    break;
                } else if (year == 3) {
                    System.out.println("Student is studying " + year + "rd year");
                    break;
                } else {
                    System.out.println("Student is studying " + year + "th year");
                    break;
                }
            }
        } else if (branch.equals("ECE")) {
            System.out.println("Student is studying in " + branch + " Department");
            for (year = 1; year <= 4; year++) {
                if (year == 1) {
                    System.out.println("Student is studying " + year + "st year");
                    break;
                } else if (year == 2) {
                    System.out.println("Student is studying " + year + "nd year");
                    break;
                } else if (year == 3) {
                    System.out.println("Student is studying " + year + "rd year");
                    break;
                } else {
                    System.out.println("Student is studying " + year + "th year");
                    break;
                }
            }
        } else if (branch.equals("EEE")) {
            System.out.println("Student is studying in " + branch + " Department");
            for (year = 1; year <= 4; year++) {
                if (year == 1) {
                    System.out.println("Student is studying " + year + "st year");
                    break;
                } else if (year == 2) {
                    System.out.println("Student is studying " + year + "nd year");
                    break;
                } else if (year == 3) {
                    System.out.println("Student is studying " + year + "rd year");
                    break;
                } else {
                    System.out.println("Student is studying " + year + "th year");
                    break;
                }
            }
        } else if (branch.equals("MEC")) {
            System.out.println("Student is studying in " + branch + " Department");
            for (year = 1; year <= 4; year++) {
                if (year == 1) {
                    System.out.println("Student is studying " + year + "st year");
                    break;
                } else if (year == 2) {
                    System.out.println("Student is studying " + year + "nd year");
                    break;
                } else if (year == 3) {
                    System.out.println("Student is studying " + year + "rd year");
                    break;
                } else {
                    System.out.println("Student is studying " + year + "th year");
                    break;
                }
            }
        } else if (branch.equals("CIVIL")) {
            System.out.println("Student is studying in " + branch + " Department");
            for (year = 1; year <= 4; year++) {
                if (year == 1) {
                    System.out.println("Student is studying " + year + "st year");
                    break;
                } else if (year == 2) {
                    System.out.println("Student is studying " + year + "nd year");
                    break;
                } else if (year == 3) {
                    System.out.println("Student is studying " + year + "rd year");
                    break;
                } else {
                    System.out.println("Student is studying " + year + "th year");
                    break;
                }
            }
        } else {
            System.out.println("Department " + branch + " is not provided");
        }
    }


}
