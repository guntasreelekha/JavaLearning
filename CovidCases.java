package com.concent;

public class CovidCases {
    public static void main(String args[]) {
        boolean cough = true, cold = false, fever = true, headache = true, tasteless = true;
        String Covid19 = "positive";
          //if (Covid19.equalsIgnoreCase("positive")) {
            if (cough) {
                System.out.println("The Symptoms of COvid19 ");
            } else {
                System.out.println("There is no Covid19 Symptoms");
            }
            if (cold) {
                System.out.println("The Symptoms of Covid19 ");
            } else {
                System.out.println("There is no Covid19 Symptoms");
            }
            if (fever) {
                System.out.println("The Symptoms of Covid19");
            } else {
                System.out.println("There is no Symptoms of Covid19");
            }
            if (headache) {
                System.out.println("The Symptoms of Covid19");
            } else {
                System.out.println("There is no Symptoms of Covid19");
            }
            if (tasteless) {
                System.out.println("The Symptoms of Covid19");
            } else {
                System.out.println("There is no Symptoms of Covid19");
            }
              System.out.println("The Covid19 is " + Covid19);
          //}else {
            //  System.out.println("The Covid19 is " + Covid19);
          //}
    }
}
