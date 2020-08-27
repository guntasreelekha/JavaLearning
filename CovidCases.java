package com.concent;

public class CovidCases {
    public static void main(String args[]) {
        boolean cough = false, cold = true, fever = true, headache = true, tasteless = true;
        /*
         * to check covid19 symptoms and positive or not*/
        String Covid19 = "positive";
        if (cough) {
            System.out.println("The Symptoms of COvid19 ");
        }
        if (cold) {
            System.out.println("The Symptoms of Covid19 ");
        }
        if (fever) {
            System.out.println("The Symptoms of Covid19");
        }
        if (headache) {
            System.out.println("The Symptoms of Covid19");
        }
        if (tasteless) {
            System.out.println("The Symptoms of Covid19");
        }
        if (Covid19.equalsIgnoreCase("positive")) {
            System.out.println("The covid19 is " + Covid19);
        } else {
            System.out.println("The Covid19 is " + Covid19);
        }
    }

    //}
    //}
    //if (cold) {
    //  System.out.println("The Symptoms of Covid19 ");
    //} else {
    //  System.out.println("There is no Covid19 Symptoms");
}
//if (fever) {
//  System.out.println("The Symptoms of Covid19");
//} else {
//  System.out.println("There is no Symptoms of Covid19");
//}
//if (headache) {
//  System.out.println("The Symptoms of Covid19");
//} else {
//  System.out.println("There is no Symptoms of Covid19");
//}
//if (tasteless) {
//  System.out.println("The Symptoms of Covid19");
//} else {
//  System.out.println("There is no Symptoms of Covid19");
//}
//System.out.println("The Covid19 is " + Covid19);
//}else {
//  System.out.println("The Covid19 is " + Covid19);
//}
//}
//}
