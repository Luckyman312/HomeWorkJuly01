package com.company.PracticJuly13;

public abstract class BottleForm {
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;

    }
    public BottleForm(String name){
        this.name = name;
    }
}
