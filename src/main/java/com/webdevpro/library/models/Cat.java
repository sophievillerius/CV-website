package com.webdevpro.library.models;

public class Cat {
    private long id;
    private String name;
    private String color;
    private int age;
    private boolean purring;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPurring() {
        return purring;
    }

    public void setPurring(boolean purring) {
        this.purring = purring;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
