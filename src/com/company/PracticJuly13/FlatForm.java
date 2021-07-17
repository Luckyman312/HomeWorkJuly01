package com.company.PracticJuly13;

public abstract class FlatForm {
    private String name;

    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name = name;
    }
    public FlatForm(String name){
        this.name = name;
    }
}
