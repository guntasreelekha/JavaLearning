package com.concent;

public class RailwayStation {
    public static void main(String args[]) {
        String station = "Chennai";
        if (station.equals("Hyderabad")) {
            System.out.println("We reached  the station " + station);
        } else if (station.equals("Vijayawada")) {
            System.out.println("We reached the station" + station);
        } else if (station.equals("Chennai")) {
            System.out.println("We reached the station" + station);
        } else if (station.equals("Bangalore")) {
            System.out.println("We reached the station" + station);
        } else {
            System.out.println("Station " + station + " is not provided");
        }
    }
}
