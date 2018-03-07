package com.scrubele;

import java.util.Objects;

public class Lipstick extends BeatyProduct {
    private LipstickTaste taste;
    private int colorCode;

    public Lipstick() {
    }

    public Lipstick(String name, Double price, ProductType type, int quantity, LipstickTaste newTaste, int newColorCode) {
        super(name, price, type, quantity);
        this.taste = newTaste;
        this.colorCode = newColorCode;

    }

    @Override
    public String toString() {
        return  getType()+" { name=" + getName() +
                ", price =" + getPrice() +
                ", taste=" + taste +
                ", colorCode=" + colorCode +
                '}';
    }

    public void setTaste(LipstickTaste taste) {
        this.taste = taste;
    }

    public void setColorCode(int colorCode) {
        this.colorCode = colorCode;
    }

    public LipstickTaste getTaste() {
        return taste;
    }

    public int getColorCode() {
        return colorCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lipstick lipstick = (Lipstick) o;
        return colorCode == lipstick.colorCode &&
                taste == lipstick.taste;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), taste, colorCode);
    }
}
