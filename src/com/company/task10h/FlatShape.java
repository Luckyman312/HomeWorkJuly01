package com.company.task10h;

public abstract class FlatShape {

  private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public FlatShape(String name){
        this.name = name;
    }
}
