package com.sematec.java.lib;

public class TestInterfaceImpl implements TestInterface {


    @Override
    public int sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    @Override
    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public double div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    @Override
    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
