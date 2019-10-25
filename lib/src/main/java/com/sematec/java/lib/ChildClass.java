package com.sematec.java.lib;

public class ChildClass extends ParentClass {


    void getNameFromUser() {
        String userName = "Pouya";
        setName(userName);
        getName();
    }


    @Override
    public void setName(String userName) {
        String fullName = "Mr. " + userName;
        super.setName(fullName);
    }


    @Override
    public String getName() {
        return "Qoli";
    }
}
