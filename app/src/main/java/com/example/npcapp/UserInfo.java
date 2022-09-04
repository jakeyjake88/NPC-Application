package com.example.npcapp;

public class UserInfo {

    private String name;
    private String age;

    public UserInfo(String name, String age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getAge() {
        return age;
    }
}
