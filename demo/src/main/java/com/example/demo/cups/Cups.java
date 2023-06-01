package com.example.demo.cups;

public class Cups {

    private int id;
    private int age;

    private String name;

    private String brand;

    private String shape;

    public Cups() {
    }

    public Cups(int id, int age, String name, String brand, String shape) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.brand = brand;
        this.shape = shape;
    }

    public Cups(int age, String name, String brand, String shape) {
        this.age = age;
        this.name = name;
        this.brand = brand;
        this.shape = shape;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Cups{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", shape='" + shape + '\'' +
                '}';
    }
}
