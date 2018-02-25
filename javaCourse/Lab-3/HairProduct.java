package com.scrubele;

public class HairProduct extends BeatyProduct {
    HairType hair;
    int capasity;

    public HairProduct(String name, Double price, ProductType type, int quantity, HairType hair, int capasity) {
        super(name, price, type, quantity);
        this.hair = hair;
        this.capasity = capasity;


    }

    @Override
    public String toString() {
        return  getType()+" { name=" + getName() +
                ", price =" + getPrice() +
                ", hairtype=" + hair +
                ", capasity=" + capasity +
                '}';
    }
}
