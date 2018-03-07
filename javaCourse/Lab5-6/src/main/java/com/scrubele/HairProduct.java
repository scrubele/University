package com.scrubele;

public class HairProduct extends BeatyProduct {
    private HairType hair;
    private int capasity;

    public HairProduct() {
    }

    public HairProduct(String name, Double price, ProductType type, int quantity, HairType hairs, int newCapasity) {
        super(name, price, type, quantity);
        this.hair = hairs;
        this.capasity = newCapasity;


    }

    @Override
    public String toString() {
        return  getType()+" { name=" + getName() +
                ", price =" + getPrice() +
                ", hairtype=" + hair +
                ", capasity=" + capasity +
                '}';
    }

    public HairType getHair() {
        return hair;
    }

    public int getCapasity() {
        return capasity;
    }

    public void setHair(HairType hair) {
        this.hair = hair;
    }

    public void setCapasity(int capasity) {
        this.capasity = capasity;
    }
}
