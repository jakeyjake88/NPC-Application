package com.example.npcapp;

public class NonPlayerCharacter {
    final String name;
    private final String introduction;
    String help;
    NonPlayerCharacter manager;


    public NonPlayerCharacter(String name, String introduction, String help){
        this.name = name;
        this.introduction = introduction;
        this.help = help;
    }

    public String name(){
        return name;
    }

    public String introduction(){
        return introduction;
    }

    public String help(){
        return help;
    }

}
