package com.company.task9;

public abstract class Animals {

    private int weight;
    private int age;
    private char sex;
    private String mnemonic;

    public Animals() {

    }

    public Animals(int weight, int age, char sex, String mnemonic) {
        this.weight = weight;
        this.age = age;
        this.sex = sex;
        this.mnemonic = mnemonic;

    }


    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public char getSex()
    {
        return sex;
    }

    public void setSex(char sex)
    {
        this.sex = sex;
    }

    public String getMnemonic() {

        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {

        this.mnemonic = mnemonic;
    }
}


