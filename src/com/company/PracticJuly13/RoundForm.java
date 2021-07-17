package com.company.PracticJuly13;

public abstract class RoundForm {
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public RoundForm(String name){
        this.name =name;
    }

    public RoundForm(){

    }
}
