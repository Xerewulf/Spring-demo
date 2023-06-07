package com.example.demo.cups;

import jakarta.persistence.*;

@Entity
@Table
public class Cups {
@Id
@SequenceGenerator(
        name = "cups_sequance",
        sequenceName = "cups_sequance",
        allocationSize = 1
)
@GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "cups_sequance"
)

    private int id;
@Transient
    private int age;

    private String name;

    private String brand;

    private String shape;

    public Cups() {
    }

    public Cups(int id, String name, String brand, String shape) {
        this.id = id;
        //this.age = age;
        this.name = name;
        this.brand = brand;
        this.shape = shape;
    }

    public Cups( String name, String brand, String shape) {
       // this.age = age;
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
