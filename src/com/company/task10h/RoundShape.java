package com.company.task10h;

public abstract class RoundShape {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public RoundShape(String name){ //Конструктор
        this.name = name;
    }

}
