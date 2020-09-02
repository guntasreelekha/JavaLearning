package com.concent;

public class DataTypesInitialValues {
     byte b;
     short s;
     int i;
     long l;
     float f;
     double d;
     boolean t;
     String a;
        void Display(){
        System.out.println("byte (Initial Value) = " + b);
        System.out.println("short (Initial Value) = " + s);
        System.out.println("int (Initial Value) = " + i);
        System.out.println("long (Initial Value) = " + l);
        System.out.println("float (Initial Value) = " + f);
        System.out.println("double (Initial Value) = " + d);
        System.out.println("boolean (Initial Value) = " + t);
        System.out.println("string (Initial Value) = " + a);
    }
    public static void main(String args[]){
            DataTypesInitialValues d=new DataTypesInitialValues();
            d.Display();

        }
}

