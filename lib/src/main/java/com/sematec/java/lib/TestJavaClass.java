package com.sematec.java.lib;


public class TestJavaClass {

    int number = 20;
    String s;
    int myDearBeautifulNumber = 10;


    public static void main(String[] args) {

        int a = f(2);
        System.out.println(a);

        int b = plusOne(20);
        System.out.println(b);

        printHello();
    }

    public static int f(int x) {
        int result = x * x;
        return result;
    }


    public static int plusOne(int x) {
        int result = x + 1;
        return result;
    }

    public boolean isEven(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String getName(String name) {
        return name;
    }


    public double getP() {
        return 3.14;
    }

    public void saveName(String name) {
        // save to data base
    }

    public static void printHello() {
        System.out.println("Hello!");
    }

}
