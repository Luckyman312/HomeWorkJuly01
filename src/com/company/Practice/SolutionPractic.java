package com.company.Practice;

import com.company.task9.Farm;
import com.company.task9.Horse;

import java.util.ArrayList;

public class SolutionPractic {

    public static void main(String[] args) {

        SheepsPractic sheep1 = new SheepsPractic();
        sheep1.setWeight(25);
        sheep1.setAge(3);
        sheep1.setSex('F');
        sheep1.setMnemonic("Sasha");

        SheepsPractic sheep2 = new SheepsPractic();
        sheep2.setWeight(28);
        sheep2.setAge(4);
        sheep2.setSex('F');
        sheep2.setMnemonic("Yula");

        SheepsPractic sheep3 = new SheepsPractic();
        sheep3.setWeight(25);
        sheep3.setAge(3);
        sheep3.setSex('F');
        sheep3.setMnemonic("Yula");

        CowsPractic cow1 = new CowsPractic();
        cow1.setWeight(200);
        cow1.setAge(3);
        cow1.setSex('M');
        cow1.setMnemonic("Marusya");

        CowsPractic cow2 = new CowsPractic();
        cow2.setWeight(250);
        cow2.setAge(4);
        cow2.setSex('M');
        cow2.setMnemonic("Mars");

        HorsesPractic horse1 = new HorsesPractic();
        horse1.setWeight(500);
        horse1.setAge(2);
        horse1.setSex('F');
        horse1.setMnemonic("Umka");

        HorsesPractic horse2 = new HorsesPractic();
        horse1.setWeight(550);
        horse1.setAge(4);
        horse1.setSex('M');
        horse1.setMnemonic("Borka");

        FarmPractic farm1 = new FarmPractic();
        farm1.setAddress("Ivanovka, str Vostochnaya");
        farm1.setOwnerNameAndSurname("Ivanov Ivan");

        ArrayList<SheepsPractic> sheepList = new ArrayList<>();
        sheepList.add(sheep1);
        sheepList.add(sheep2);
        sheepList.add(sheep3);

        ArrayList<CowsPractic> cowList = new ArrayList<>();
        cowList.add(cow1);
        cowList.add(cow2);

        ArrayList<HorsesPractic> horseList = new ArrayList<>();
        horseList.add(horse1);
        horseList.add(horse2);

        farm1.setFlockOfSheep(sheepList);
        farm1.setHerdOfCows(cowList);
        farm1.setHerdOfHorses(horseList);

        System.out.println("Name of Farm is Farm1; " + " \nOwner is " + farm1.getOwnerNameAndSurname() + ";" + "\nQuantity of Sheep is " + sheepList.size() + ";" +
                "\nQuantity of Cows is " + cowList.size() + ";" + " \nQuantity of Horses is " + horseList.size()+ ";");



    }
}
