package com.company.task11;

import java.util.SplittableRandom;

public class LeftPocket {
    private  String name;
    private String model;
    private int serialNumber;
    private int price;

    public LeftPocket() {

    }
    public String getModel() {

      return model;
    }
    public void setModel(String model){

        this.model = model;
    }
    public int getSerialNumber(){

        return serialNumber;

    }public void setSerialNumber(int serialNumber){

        this.serialNumber = serialNumber;
    }
    public int getPrice(){

        return price;
    }
    public void setPrice(int price){

        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LeftPocket(String model, int serialNumber, int price,String name){
        this.price = price;
        this.serialNumber = serialNumber;
        this.model = model;
        this.name = name;

    }

}