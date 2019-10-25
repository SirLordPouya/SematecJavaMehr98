package com.sematec.java.lib;

import java.util.Scanner;

public class TestObjectClass {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Please enter first number : ");
//        int firstNumber = scanner.nextInt();
//
//        System.out.print("Please enter second number : ");
//        int secondNumber = scanner.nextInt();
//
//        String output = String.format("%s %s", "joe", "Joezade");
//
//        System.out.println(output);
//
//
//        TestMathClass test = new TestMathClass();
//
//        int sumResult = test.sum(firstNumber, secondNumber);
//        int subResult = test.sub(firstNumber, secondNumber);
//        System.out.println("Sum : " + sumResult + " Sub : " + subResult);


        TestConstructorClass c1 = new TestConstructorClass(1);
        System.out.println(c1.teacherTypeAndName());


        TestConstructorClass c2 = new TestConstructorClass(1,"Pouya");
        System.out.println(c2.teacherTypeAndName());



    }
}
