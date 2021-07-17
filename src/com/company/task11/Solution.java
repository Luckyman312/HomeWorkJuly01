package com.company.task11;

public class Solution {

    public static void main(String[] args) {

        LeftPocket leftPocket = new LeftPocket();
        leftPocket.setName("Iphone");
        leftPocket.setModel("11X pro");
        leftPocket.setSerialNumber(1546884);
        leftPocket.setPrice(1500);

        RightPocket rightPocket = new RightPocket();
        rightPocket.setCountry("USA");
        rightPocket.setPrice(85);
        rightPocket.setSymbol('$');


        System.out.println("In left pocket we have ;  ");
        System.out.println("Phone name -  " + leftPocket.getName()+";" + "\nPhone serial # - " + leftPocket.getSerialNumber()+";" +
                "\nPhone model - " +leftPocket.getModel()+";" + "\nPhone price - " + leftPocket.getPrice()+";");


        System.out.println("--------------------");

        System.out.println("In right pocket we have;  ");
        System.out.println("Dollar country " + rightPocket.getCountry()+  " ;"  + "\ndollar price is " + rightPocket.getPrice()+ ";"  +
                "\n" +
                "Dollar Symbol is  " + rightPocket.getSymbol() + " ;" );

    }


}
