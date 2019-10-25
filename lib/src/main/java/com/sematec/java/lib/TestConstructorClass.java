package com.sematec.java.lib;

public class TestConstructorClass {

    int teacherId;
    String name = "";


    public TestConstructorClass(int id) {
        teacherId = id;
    }

    public TestConstructorClass(int id, String teacherName) {
        teacherId = id;
        name = teacherName;
    }


    public void nothing() {
    }


    public String teacherTypeAndName() {
        switch (teacherId) {
            case 0:
                return "RASMI " + name;
            case 1:
                return "KHOSUSI " + name;
            case 2:
                return "SAATI " + name;
            default:
                return "UNKNOWN TEACHER ";

        }
    }
}
