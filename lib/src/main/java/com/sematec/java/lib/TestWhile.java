package com.sematec.java.lib;

public class TestWhile {

    public static void main(String[] args) {
        int c = 0;
        int a = 0;

        while (c < 10) {
            System.out.println("C is " + c);
            c = c + 1;
        }

        do {
            System.out.println("A is " + a);
            a = a + 1;
        } while (a < 10);
    }
}
