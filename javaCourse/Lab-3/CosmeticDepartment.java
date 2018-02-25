package com.scrubele;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CosmeticDepartment {
    private String name;
    private String addressOfShop;
    private int floor;
    private List<BeatyProduct> productList;
    private List<BeatyProduct> avialableForCustomerList; // List for customer

    public CosmeticDepartment(String name, String addressOfShop, int floor) {
        this.name = name;
        this.addressOfShop = addressOfShop;
        this.floor = floor;
        this.productList = new LinkedList<>();
        this.avialableForCustomerList = new LinkedList<>();
    }

    public void addProduct(BeatyProduct beatyProduct) {
        productList.add(beatyProduct);
    }

    public void displayProduct() {
        System.out.println("We can offer you:");
        for (BeatyProduct i : productList) {
            System.out.println(i.toString());
        }
        System.out.println();
    }


    public void displayAvailableProduct(int count, double money) {
        int k = 0;
        double sum = 0;
        if (count == 1) {
            productList.sort(Comparator.comparing(BeatyProduct::getPrice).reversed());

            for (BeatyProduct i : productList) {
                if ((i.getQuantity() > 0) && (i.getPrice() <= money)) {
                    System.out.println(i.toString());
                    k++;
                }
            }

        } else {

            productList.sort(Comparator.comparing(BeatyProduct::getPrice));
            while (sum < money) {
                for (BeatyProduct i : productList) {
                    if (i.getQuantity() > 0)   sum += i.getPrice();
                    if(sum<money) {
                        avialableForCustomerList.add(i);
                        k++;
                    }
                }
            }
            if (k > 0) {
                System.out.println("You can buy:");
                avialableForCustomerList.sort(Comparator.comparing(BeatyProduct::getPrice).reversed());
                for (BeatyProduct i : avialableForCustomerList) {
                    System.out.println(i.toString());
                }
            }


        }
        if (k == 0) {
            System.out.println("Ohh, no... You can not buy any product. Sorry :(");
        }
    }

    @Override
    public String toString() {
        return "CosmeticDepartment{" +
                "name='" + name + '\'' +
                ", addressOfShop='" + addressOfShop + '\'' +
                ", floor=" + floor +
                ", productList=" + productList +
                ", avialableForCustomerList=" + avialableForCustomerList +
                '}';
    }
}
