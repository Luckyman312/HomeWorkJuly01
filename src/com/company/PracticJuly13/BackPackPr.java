package com.company.PracticJuly13;


import java.util.ArrayList;

public class BackPackPr {

    private ArrayList<Apple>bunchOfApple;
    private ArrayList<Water>bottleOfWater;
    private ArrayList<File>stackOfFiles;
    private ArrayList<Balls>bunchOfBalls;
    private ArrayList<Book>stackOfBooks;
    private ArrayList<Cola>bottleOfCola;

    public BackPackPr(){

    }
    public ArrayList<Apple>getBunchOfApple(){
        return bunchOfApple;
    }
    public void setBunchOfApple(ArrayList<Apple>bunchOfApple){
        this.bunchOfApple = bunchOfApple;
    }
     public ArrayList<Water>getBottleOfWater(){
        return bottleOfWater;
     }
     public void setBottleOfWater(ArrayList<Water>bottleOfWater){
        this.bottleOfWater =bottleOfWater;
     }
     public ArrayList<File>getStackOfFiles(){
        return stackOfFiles;
     }
     public void setStackOfFiles(ArrayList<File>stackOfFiles){
        this.stackOfFiles = stackOfFiles;
     }
     public ArrayList<Balls>getBunchOfBalls(){
        return bunchOfBalls;
     }
     public void setBunchOfBalls(ArrayList<Balls>bunchOfBalls){
        this.bunchOfBalls = bunchOfBalls;
     }
     public ArrayList<Book>getStackOfBooks(){
        return stackOfBooks;

     }public void setStackOfBooks(ArrayList<Book>stackOfBooks){
        this.stackOfBooks = stackOfBooks;
    }
    public ArrayList<Cola>getBottleOfCola(){
        return bottleOfCola;
    }
    public void setBottleOfCola(ArrayList<Cola>bottleOfCola){
        this.bottleOfCola = bottleOfCola;
    }
    public BackPackPr(ArrayList<Apple>bunchOfApple, ArrayList<Water>bottleOfWater,
                      ArrayList<File>stackOfFiles, ArrayList<Balls>bunchOfBalls,
                      ArrayList<Book>stackOfBooks, ArrayList<Cola>bottleOfCola){

        this.bunchOfApple = bunchOfApple;
        this.bottleOfWater = bottleOfWater;
        this.stackOfFiles = stackOfFiles;
        this.bunchOfBalls = bunchOfBalls;
        this.stackOfBooks = stackOfBooks;
        this.bottleOfCola = bottleOfCola;
    }
}
