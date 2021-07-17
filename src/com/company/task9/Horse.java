package com.company.task9;

public class Horse extends Animals{
    private String color;

    public Horse(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public Horse(int weight,int age,char sex,String mnemonic,String color) {
        super(weight, age, sex, mnemonic);
        this.color = color;

    }
}
