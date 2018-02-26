package com.scrubele;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        CosmeticDepartment shop = new CosmeticDepartment("Watsons", "Stryjska,135", 5);

        shop.addProduct(new BeatyProduct("Black", 350.0, ProductType.MASCARA, 125));
        shop.addProduct(new Lipstick("Super100", 125.35, ProductType.LIPSTICK, 15,
                LipstickTaste.COCONUT, 567892));
        shop.addProduct(new BeatyProduct("Beet", 35.0, ProductType.BLUSH, 13));
        shop.addProduct(new HairProduct("Super100", 198.99, ProductType.HAIRCONDITIONERS, 3,
                HairType.WAVY, 1000));
        shop.addProduct(new BeatyProduct("Love", 100.50, ProductType.GEL, 2));
        shop.addProduct(new BeatyProduct("Tiger", 15.25, ProductType.EYELINER, 115));

        shop.displayProducts(shop.getProductList());
        System.out.println("Plz enter how much money do you have? : ");
        Float money = input.nextFloat();
        System.out.println("Enter how many products do you want to buy ?(true - only one, false - few) ?  ");
        boolean choice = input.nextBoolean();

        shop.findAvailableProducts(choice, money);

    }
}
