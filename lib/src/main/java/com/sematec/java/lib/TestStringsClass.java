package com.sematec.java.lib;

public class TestStringsClass {

    public static void main(String[] args) {
        String name = "PoUya";
        String family = "Heydari";
        String name2 = "Qoli";


        System.out.println(name + " " + family + 10);

        String fullName = name + " " + family;

        System.out.println(fullName);

        if (name.equals(name2)) {

        }

        if (name.equalsIgnoreCase("pouya")) {

        }

        if (name.contains("oU")) {

        }

        if (name.startsWith("a")) {

        }

        if (name.length() < 10) {

        }
    }
}
