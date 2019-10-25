package com.sematec.java.lib;

public class TestIfClass {

    static int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("invalid number");
        }

        if (b > a) {
            System.out.println("b is greater than a");
        }

        if (b > a && b > 100) {
            System.out.println("b is greater than 100");
        }

        if (a > b || a == 10) {
            System.out.println("a equals 10");
        }


        if (a == 1) {
            System.out.println("a is 1");
        } else if (a == 2) {
            System.out.println("a is 2");
        } else if (a > 2) {
            System.out.println("a is greater than 2");
        } else if (a == 10) {
            System.out.println("a is 10");
        } else {
            System.out.println("invalid value for a");
        }


    }


}
