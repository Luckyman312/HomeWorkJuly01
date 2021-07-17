package com.company.task10h;

public  abstract class BottleShape {
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public BottleShape(String name) { // конструктор
        this.name = name;
    }
}
