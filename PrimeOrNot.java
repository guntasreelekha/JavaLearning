package com.concent;

public class PrimeOrNot {
    public static void main(String args[]) {
        int num = 7846289;
        boolean flag = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(num + " is not a prime");
        } else {
            System.out.println(num + " is a prime");
        }
    }
}
