package com.scrubele;

public class Lipstick extends BeatyProduct {
    LipstickTaste taste;
    int colorCode;


    public Lipstick(String name, Double price, ProductType type, int quantity, LipstickTaste taste, int colorCode) {
        super(name, price, type, quantity);
        this.taste = taste;
        this.colorCode = colorCode;

    }

    @Override
    public String toString() {
        return  getType()+" { name=" + getName() +
                ", price =" + getPrice() +
                ", taste=" + taste +
                ", colorCode=" + colorCode +
                '}';
    }
}
