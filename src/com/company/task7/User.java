package com.company.task7;

public class User implements DBObject {
    private long id;
    private String name;

    @Override
    public String toString() {
        return String.format("The user's name is %s, id = %d", name, id);

    }

    @Override
    public DBObject initializeIdAndName(long id, String name) {
        User user = new User();
        user.id = id;
        user.name = name;
        return user;
    }
}

