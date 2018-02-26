package com.scrubele;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CosmeticDepartment {
    private String name;
    private String addressOfShop;
    private int floor;
    private List<BeatyProduct> productList;

    public CosmeticDepartment(String name, String addressOfShop, int floor) {
        this.name = name;
        this.addressOfShop = addressOfShop;
        this.floor = floor;
        this.productList = new LinkedList<>();
    }

    public void addProduct(BeatyProduct beatyProduct) {
        productList.add(beatyProduct);
    }

    public void displayProducts(List<BeatyProduct> productList) {
        productList.sort(Comparator.comparing(BeatyProduct::getPrice).reversed());
        System.out.println("We can offer you:");
        for (BeatyProduct product : productList) {
            System.out.println(product.toString());
        }
        System.out.println();
    }


    public List<BeatyProduct> findAvailableProducts(boolean choice, double money) {
        List<BeatyProduct> avialableForCustomerProducts = new LinkedList<>();
        int countOfProducts = 0;
        double sum = 0;
        if (choice == true) {
            productList.sort(Comparator.comparing(BeatyProduct::getPrice).reversed());

            for (BeatyProduct product : productList) {
                if ((product.getQuantity() > 0) && (product.getPrice() <= money)) {
                    avialableForCustomerProducts.add(product);
                    countOfProducts++;
                }
            }

        } else {

            productList.sort(Comparator.comparing(BeatyProduct::getPrice));
            while (sum < money) {
                for (BeatyProduct product : productList) {
                    if (product.getQuantity() > 0) sum += product.getPrice();
                    if (sum < money) {
                        avialableForCustomerProducts.add(product);
                        countOfProducts++;
                    }
                }
            }
        }

        if (countOfProducts > 0) {
            displayProducts(avialableForCustomerProducts);
        } else {
            System.out.println("Ohh, no... You can not buy any product. Sorry :(");
        }
        return avialableForCustomerProducts;
    }

    @Override
    public String toString() {
        return "CosmeticDepartment{" +
                "name='" + name + '\'' +
                ", addressOfShop='" + addressOfShop + '\'' +
                ", floor=" + floor +
                ", productList=" + productList;
    }

    public List<BeatyProduct> getProductList() {
        return productList;
    }
}
