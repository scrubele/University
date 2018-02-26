package com.scrubele;

public class BeatyProduct {
    private String name;
    private Double price;
    private ProductType type;
    private int quantity;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BeatyProduct(String name, Double price, ProductType type, int quantity) {
        setName(name);
        setPrice(price);
        setType(type);
        setQuantity(quantity);
    }

    @Override
    public String toString() {
        return type + " {" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public ProductType getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }
}
