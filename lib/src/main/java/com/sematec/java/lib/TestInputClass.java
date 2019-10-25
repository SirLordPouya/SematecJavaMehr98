package com.sematec.java.lib;

import java.util.Scanner;

public class TestInputClass {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name : ");
        String name = scanner.nextLine();

        System.out.print("Please enter your age : ");
        int age = scanner.nextInt();

        System.out.println("Name : " + name + " Age : " + age);

    }
}
