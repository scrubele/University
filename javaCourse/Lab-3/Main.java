package com.scrubele;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        CosmeticDepartment shop = new CosmeticDepartment("Watsons", "Stryjska,135", 5);

        BeatyProduct mascara = new BeatyProduct("Black", 350.0, ProductType.MASCARA, 125);
        Lipstick lipstick = new Lipstick("Super100", 125.35, ProductType.LIPSTICK, 15,
                LipstickTaste.COCONUT, 567892);
        HairProduct hairProduct = new HairProduct("Super100", 198.99, ProductType.HAIRCONDITIONERS, 3,
                HairType.WAVY, 1000);
        BeatyProduct blush = new BeatyProduct("Beet", 35.0, ProductType.BLUSH, 13);
        BeatyProduct gel = new BeatyProduct("Love", 100.50, ProductType.GEL, 2);
        BeatyProduct eyeliner = new BeatyProduct("Tiger", 15.25, ProductType.EYELINER, 115);

        shop.addProduct(mascara);
        shop.addProduct(lipstick);
        shop.addProduct(hairProduct);
        shop.addProduct(blush);
        shop.addProduct(gel);
        shop.addProduct(eyeliner);

        shop.displayProduct();
        System.out.println("Plz enter how much money do yo have? : ");
        Float money = input.nextFloat();
        System.out.println("Enter how many products do you want to buy ?(1 - only one, 0 - few) ?  ");
        int count = input.nextInt();

        shop.displayAvailableProduct(count, money);

    }
}
