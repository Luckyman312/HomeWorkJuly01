package com.company.task2;

public class AlcoholicBear implements Drink {

    @Override
    public String toString() {
        if (isAlcoholic()) {
            return "Alcoholic beverage";
        } else {
            return "Non -Alcoholic beverage";
        }
    }

    @Override
    public boolean isAlcoholic() {
        return true;
    }
}
