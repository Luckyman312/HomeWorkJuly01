package com.company.task8;


import com.company.task9.Cow;
import com.company.task9.Farm;
import com.company.task9.Horse;
import com.company.task9.Sheep;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sheep sheep1 = new Sheep();
        sheep1.setWeight(2);
        sheep1.setAge(20);
        sheep1.setSex('F');
        sheep1.setMnemonic("Faina");

        Sheep sheep2 = new Sheep();
        sheep2.setWeight(3);
        sheep2.setAge(40);
        sheep2.setSex('M');
        sheep2.setMnemonic("Bek");

        Sheep sheep3 = new Sheep();
        sheep3.setWeight(50);
        sheep3.setAge(5);
        sheep3.setSex('M');
        sheep3.setMnemonic("Gek");


        Cow cow1 = new Cow();
        cow1.setWeight(200);
        cow1.setAge(2);
        cow1.setSex('M');
        cow1.setMnemonic("Mars");

        Cow cow2 = new Cow();
        cow2.setWeight(200);
        cow2.setAge(2);
        cow2.setSex('M');
        cow2.setMnemonic("Mars");

        Cow cow3 = new Cow();
        cow3.setWeight(300);
        cow3.setAge(4);
        cow3.setSex('F');
        cow3.setMnemonic("Marusya");

        Cow cow4 = new Cow();
        cow4.setWeight(400);
        cow4.setAge(3);
        cow4.setSex('M');
        cow4.setMnemonic("Platon");

        Cow cow5 = new Cow();
        cow5.setWeight(800);
        cow5.setAge(3);
        cow5.setSex('M');
        cow5.setMnemonic("Bulat");

        Horse horse1 = new Horse();
        horse1.setWeight(300);
        horse1.setAge(3);
        horse1.setSex('M');
        horse1.setMnemonic("Buran");
        horse1.setColor("Black");

        Horse horse2 = new Horse();
        horse2.setWeight(500);
        horse2.setAge(3);
        horse2.setSex('F');
        horse2.setMnemonic("Burka");

        Farm farm = new Farm();
        farm.setAddress("Kant");
        farm.setOwnerNameAndSurname("Blinkov");

        ArrayList<Cow> cowList = new ArrayList<>();
        cowList.add(cow1);
        cowList.add(cow2);
        cowList.add(cow3);
        cowList.add(cow4);
        cowList.add(cow5);

        ArrayList<Sheep> sheepList = new ArrayList<>();
        sheepList.add(sheep1);
        sheepList.add(sheep2);
        sheepList.add(sheep3);

        ArrayList<Horse> horseList = new ArrayList<>();
        horseList.add(horse1);
        horseList.add(horse2);

        farm.setHerdOfCows(cowList);
        farm.setFlockOfSheep(sheepList);
        farm.setHerdOfHorses(horseList);

        System.out.println(" Name of Farm is Zarya;\n " + "Owner is " + farm.getOwnerNameAndSurname() + ";" +
                " \n Quantity of Cows are " + cowList.size() + ";" + " \n Quantity of Sheep are " +
                sheepList.size() + ";" + "\n Quantity of Horses are " + horseList.size()+ ";");
    }
}
