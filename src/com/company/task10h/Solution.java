package com.company.task10h;

import com.company.PracticJuly13.CocaCola;

import java.util.ArrayList;

public class Solution {

    private static ArrayList<Apples> bonchOfApples = new ArrayList<>();
    private static ArrayList<Book> stackOfBooks = new ArrayList<>();
    private static ArrayList<CocaCola> bottleOfCola = new ArrayList<CocaCola>();
    private static ArrayList<Files> stackOfFiles = new ArrayList<>();
    private static ArrayList<Water> bottleOfWater = new ArrayList<>();
    private static ArrayList<TennisBalls> bonchOfBalls = new ArrayList<>();
    private  static ArrayList<Apples>bonchOfApplesForThird = new ArrayList<>();
    private static ArrayList<TennisBalls>bonchOfBallsForThird = new ArrayList<>();

    public static void main(String[] args) {



        stackOfBooks.add(new Book("Alisa"));
        stackOfFiles.add(new Files("Clear"));
        bottleOfWater.add(new Water("Legenda"));
        bottleOfCola.add(new CocaCola("Cola"));



        createFirstBackpach();
        createSecondBackpack();
        createThirdBackpack();
    }

    public static void createFirstBackpach() {

        Backpack backpack1 = new Backpack();

        for (int i = 0; i < 20; i++) {
            bonchOfApples.add(new Apples("Prevoshodniy"));
        }

        for (int i = 0; i < 50; i++) {
            bonchOfBalls.add(new TennisBalls("Rocketka"));

        }
        backpack1.setBunchOfApples(bonchOfApples);
        backpack1.setStackOfBooks(stackOfBooks);
        backpack1.setBottleOfCola(bottleOfCola);

        System.out.println("Рюкзак №1:");
        System.out.println("Количесто яблок: " + backpack1.getBunchOfApples().size());

        System.out.println("Количесто Кока-Колы: " + backpack1.getBottleOfCola().size());
        System.out.println("Количесто книг " + backpack1.getStackOfBooks().size());

    }

    public static void createSecondBackpack() {

        Backpack backpack2 = new Backpack();
        backpack2.setBunchOfBalls(bonchOfBalls);
        backpack2.setBottleOfWater(bottleOfWater);
        backpack2.setStackOfFiles(stackOfFiles);

        System.out.println("Рюкзак №2:");


        System.out.println("Количество воды: " + backpack2.getBottleOfWater().size());
        System.out.println("Количесто файлов: " + backpack2.getStackOfFiles().size());
        System.out.println("Количесто мячей: " + backpack2.getBunchOfBalls().size());

    }

    public static void createThirdBackpack() {


        Backpack backpack3 = new Backpack();

        for (int i = 0; i < 10; i++) {
            bonchOfApplesForThird.add(new Apples("Aport"));

        }


        for (int i = 0; i < 3; i++) {
            bonchOfBallsForThird.add(new TennisBalls("Rocket"));

        }
        backpack3.setBunchOfApples(bonchOfApplesForThird);
        backpack3.setBunchOfBalls(bonchOfBalls);
        backpack3.setStackOfFiles(stackOfFiles);
        backpack3.setBottleOfCola(bottleOfCola);

        System.out.println("Рюкзак №3:");

        System.out.println("Количество яблок: " + backpack3.getBunchOfApples().size());
        System.out.println("Количесто мячей: " + backpack3.getBunchOfBalls().size());
        System.out.println("Количесто файло: " + backpack3.getStackOfFiles().size());
        System.out.println("Количесто Кока- Колы: " + backpack3.getBottleOfCola().size());

    }

}
