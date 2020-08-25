package com.concent;

public class Compare {
    public static void main(String args[]) {
        int a, b;
        a = 9;
        b = 5;
        if (a == b) {
            for (int i = 1; i <= 5; ++i) {
                System.out.println(" a is equal to b");
            }
        } else {
            int result = 0;
            for (int j = 1; j <= 5; ++j) {
                result = result + 1;
                System.out.println("the result is:" + result);
            }

        }
    }
}
