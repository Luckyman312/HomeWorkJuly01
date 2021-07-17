package com.company.PracticJuly13;


import java.util.ArrayList;
public class Solution {

    private static ArrayList<Apple> bunchOfApple = new ArrayList<>();
    private static ArrayList<Water>bottleOfWater = new ArrayList<>();
    private static ArrayList<File>stackOfFiles = new ArrayList<>();
    private static ArrayList<Balls>bunchOfBalls = new ArrayList<>();
    private static ArrayList<Book> stackOfBooks = new ArrayList<>();
    private static ArrayList<Cola>bottleOfCola = new ArrayList<>();


    public    static void main(String[] args) {

        bottleOfCola.add(new Cola("coca"));
        stackOfFiles.add(new File("Kaff"));
        bottleOfWater.add(new Water("Legends"));
        stackOfBooks.add(new Book("King Artur"));

        createFirstBackPack();
        createSecondBackPack();
    }
    private static void createFirstBackPack(){

        BackPackPr backPackPr1 = new BackPackPr();

        for (int i = 0; i < 20; i++) {

            bunchOfApple.add(new Apple("makintosh"));

        }
        for (int i = 0; i < 50; i++) {
            bunchOfBalls.add(new Balls("Tennis"));

        }
        backPackPr1.setBunchOfApple(bunchOfApple);
        backPackPr1.setStackOfBooks(stackOfBooks);
        backPackPr1.setBottleOfCola(bottleOfCola);

        System.out.println("Рюгзак №1: ");
        System.out.println("Количество яблок: " + backPackPr1.getBunchOfApple().size());
        System.out.println("Количество Кока Колы: " + backPackPr1.getBottleOfCola().size());
        System.out.println("Количество книг: " + backPackPr1.getStackOfBooks().size());

    }
    private static void createSecondBackPack(){

        BackPackPr backPackPr2 = new BackPackPr();
        backPackPr2.setBunchOfBalls(bunchOfBalls);
        backPackPr2.setBottleOfWater(bottleOfWater);
        backPackPr2.setStackOfFiles(stackOfFiles);

        System.out.println("Рюгзак №2: ");
        System.out.println("Количество воды: " + backPackPr2.getBottleOfWater().size());
        System.out.println("Количесто файлов: " + backPackPr2.getStackOfFiles().size());
        System.out.println("Количесто мячей: " + backPackPr2.getBunchOfBalls().size());
    }
}
