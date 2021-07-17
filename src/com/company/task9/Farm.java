package com.company.task9;

import java.util.ArrayList;

public class Farm {
    private  String address;
    private  ArrayList<Cow> herdOfCows;
    private  ArrayList<Sheep> flockOfSheep;
    private  ArrayList<Horse> herdOfHorses;
    private String ownerNameAndSurname;

    public Farm(){

    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public ArrayList<Cow> getHerdOfCows()
    {

        return herdOfCows;
    }

    public void setHerdOfCows(ArrayList<Cow> herdOfCows) {

        this.herdOfCows = herdOfCows;
    }

    public ArrayList<Sheep> getFlockOfSheep() {

        return flockOfSheep;
    }

    public void setFlockOfSheep(ArrayList<Sheep> flockOfSheep) {

        this.flockOfSheep = flockOfSheep;
    }

    public ArrayList<Horse> getHerdOfHorses() {

        return herdOfHorses;
    }

    public void setHerdOfHorses(ArrayList<Horse> herdOfHorses) {

        this.herdOfHorses = herdOfHorses;
    }

    public String getOwnerNameAndSurname() {

        return ownerNameAndSurname;
    }

    public void setOwnerNameAndSurname(String ownerNameAndSurname)
    {

        this.ownerNameAndSurname = ownerNameAndSurname;
    }

    public Farm (String address, ArrayList<Cow> herdOfCows, ArrayList<Sheep> flockOfSheep,
                 ArrayList<Horse> herdOfHorses, String ownerNameAndSurname){

      this.address = address;
      this.herdOfCows = herdOfCows;
      this.flockOfSheep = flockOfSheep;
      this.herdOfHorses = herdOfHorses;
      this.ownerNameAndSurname = ownerNameAndSurname;
  }

}
