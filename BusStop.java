package com.concent;

public class BusStop {
    public static void main(String args[]){
        String stop="KarvetiNagaram";
        if(stop.equalsIgnoreCase("Chittoor")){
            System.out.println("We reached to the stop " +stop);
        }else if(stop.equalsIgnoreCase("KarvetiNagaram")){
            System.out.println("We reached to the stop " +stop);
        }else if(stop.equalsIgnoreCase("Puttur")){
            System.out.println("We reached to the stop "+stop);
        }else if(stop.equalsIgnoreCase("Tirupathi")){
            System.out.println("We reached to the stop "+stop);
        }else{
            System.out.println("stop name is not provided");
        }
    }
}
