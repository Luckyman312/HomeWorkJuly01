package com.company.Practice;

import com.company.task9.Horse;

import java.util.ArrayList;

public class FarmPractic {
    private String address;
    private ArrayList<CowsPractic>herdOfCows;
    private ArrayList<SheepsPractic>flockOfSheep;
    private ArrayList<HorsesPractic>herdOfHorses;
    private String ownerNameAndSurname;

    public FarmPractic(){

    }
    public String getAddress(){

        return address;
    }
    public void setAddress(String address){

        this.address = address;

    }
    public ArrayList<CowsPractic>getHerdOfCows(){

        return herdOfCows;
    }
    public void setHerdOfCows(ArrayList<CowsPractic>herdOfCows){

        this.herdOfCows = herdOfCows;
    }
    public ArrayList<SheepsPractic>getFlockOfSheep(){

        return flockOfSheep;
    }
    public void setFlockOfSheep(ArrayList<SheepsPractic>flockOfSheep){

        this.flockOfSheep = flockOfSheep;
    }
    public ArrayList<HorsesPractic>getHerdOfHorses(){

        return  herdOfHorses;
    }
    public void setHerdOfHorses(ArrayList<HorsesPractic>herdOfHorses){

        this.herdOfHorses =herdOfHorses;
    }
    public String getOwnerNameAndSurname(){

        return ownerNameAndSurname =ownerNameAndSurname;
    }

    public void setOwnerNameAndSurname(String ownerNameAndSurname) {

        this.ownerNameAndSurname = ownerNameAndSurname;
    }
    public FarmPractic(String address, ArrayList<CowsPractic>herdOfCows,ArrayList<SheepsPractic>flockOfSheep,
                       ArrayList<HorsesPractic>herdOfHorses,String ownerNameAndSurname ){

        this.address = address;
        this.herdOfCows = herdOfCows;
        this.flockOfSheep = flockOfSheep;
        this.herdOfHorses = herdOfHorses;
        this.ownerNameAndSurname = ownerNameAndSurname;
    }
}
