package com.concent;

public class Number {
    public static void main(String args[]) {
        int num = -7;
        //check if the number is greater than zero
        if(num>0){
            System.out.println("The number is positive :" +num);
        }
        // check the number is less than zero
        else if(num < 0){
            System.out.println("The number is negative :" +num);
        }else{
            System.out.println("The number is equal to zero :" +num);
        }
    }
}
