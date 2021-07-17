package com.company.task4;

public class Screen implements Updatable,Selectable {
    @Override
    public void onSelect() {
        System.out.println("Should be Selected !");

    }

    @Override
    public void refresh() {
        System.out.println("Should be Refreshed !");

    }
}
