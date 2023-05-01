package com.example.flower.model;

public class Flower {
   int image;
   String name;
   String color;
   String  sum;

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String  getSum() {
        return sum;
    }

    public Flower(int image, String name, String color, String sum) {
        this.image = image;
        this.name = name;
        this.color = color;
        this.sum = sum;
    }
}
