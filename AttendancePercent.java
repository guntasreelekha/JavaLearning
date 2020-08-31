package com.concent;

public class AttendancePercent {
    public static void main(String args[]) {
        char ch = 'B';
        boolean cse = true;
        float totalStudents = 60;
        float presentStudentsA, presentStudentsB;
        float percentage;
        if (cse) {
            presentStudentsA = 50;
            presentStudentsB = 45;
            if (ch == 'A') {
                System.out.println("Total students in  CSE A :" + totalStudents);
                percentage = (presentStudentsA / totalStudents) * 100;
                System.out.println("Weekly attendance Percentage of students in CSE-A section :" + percentage);
            } else if (ch == 'B') {
                System.out.println("Total students in CSE B:" + totalStudents);
                percentage = (float) (presentStudentsB / totalStudents) * 100;
                System.out.println("Weekly attendance Percentage of students in CSE-B section :" + percentage);
            } else {
                System.out.println(ch + "section is not provided");
            }
        } else {
            System.out.println("Another department is provided");
        }
    }
}
