package com.company.task10h;


import com.company.PracticJuly13.CocaCola;

import java.util.ArrayList;

public class Backpack {

    private ArrayList<Apples>bunchOfApples;
    private ArrayList<TennisBalls>bunchOfBalls;
    private ArrayList<Book>stackOfBooks;
    private ArrayList<Files>stackOfFiles;
    private ArrayList<Water>bottleOfWater;
    private ArrayList<CocaCola>bottleOfCola;

    public Backpack(){

    }

    public ArrayList<Apples> getBunchOfApples() {

        return bunchOfApples;
    }

    public void setBunchOfApples(ArrayList<Apples>bunchOfApples) {

        this.bunchOfApples = bunchOfApples;
    }

    public ArrayList<TennisBalls> getBunchOfBalls() {
        return bunchOfBalls;
    }

    public void setBunchOfBalls(ArrayList<TennisBalls> bunchOfBalls) {

        this.bunchOfBalls = bunchOfBalls;

    }
    public ArrayList<Book>getStackOfBooks(){

        return stackOfBooks;
    }
    public void setStackOfBooks(ArrayList<Book>stackOfBooks){

        this.stackOfBooks = stackOfBooks;
    }

    public ArrayList<Files> getStackOfFiles() {

        return stackOfFiles;
    }

    public void setStackOfFiles(ArrayList<Files> stackOfFiles) {

        this.stackOfFiles = stackOfFiles;
    }

    public ArrayList<Water> getBottleOfWater() {

        return bottleOfWater;
    }

    public void setBottleOfWater(ArrayList<Water> bottleOfWater) {

        this.bottleOfWater = bottleOfWater;
    }

    public ArrayList<CocaCola> getBottleOfCola() {

        return bottleOfCola;
    }

    public void setBottleOfCola(ArrayList<CocaCola> bottleOfCola) {

        this.bottleOfCola = bottleOfCola;
    }
    public Backpack(ArrayList<Apples>bunchOfApples,ArrayList<Book>stackOfBooks,ArrayList<Files>stackOfFiles,
                    ArrayList<CocaCola>bottleOfCola,ArrayList<Water>bottleOfWater,ArrayList<TennisBalls>bunchOfBalls){
        this.bunchOfApples = bunchOfApples;
        this.stackOfBooks = stackOfBooks;
        this.stackOfFiles = stackOfFiles;
        this.bottleOfCola = bottleOfCola;
        this.bunchOfBalls = bunchOfBalls;
        this.bottleOfWater =bottleOfWater;
    }

}

