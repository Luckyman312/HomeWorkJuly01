package com.company.task11;

public class RightPocket {

    private String country;
    private int price;
    private char symbol;

    public RightPocket() {

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
    public RightPocket(String country,int price,char symbol){
        this.country= country;
        this.price = price;
        this.symbol = symbol;

    }
}