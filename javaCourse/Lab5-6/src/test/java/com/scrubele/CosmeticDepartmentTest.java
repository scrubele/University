package com.scrubele;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static java.util.Arrays.asList;

import java.util.*;

public class CosmeticDepartmentTest {
    Double money;
    Boolean choice;
    CosmeticDepartment cosmeticDepartment = new CosmeticDepartment();

    @Test
    public void createShopTest() {
        CosmeticDepartment shop = new CosmeticDepartment("Watsons", "Stryjska,135", 5);
        Assert.assertThat(shop.getName(), Is.is("Watsons"));
        Assert.assertThat(shop.getAddressOfShop(), Is.is("Stryjska,135"));
        Assert.assertEquals(shop.getFloor(), 5);

    }

    @Test(expected = NullPointerException.class)
    public void addProduct() {
        CosmeticDepartment shop = new CosmeticDepartment();
        BeatyProduct beaty = new BeatyProduct("Black", 350.0, ProductType.MASCARA, 125);

        shop.addProduct(beaty);

        Assert.assertEquals(shop.getProductList().size(), 1);
        BeatyProduct result = (BeatyProduct) shop.getProductList().get(0);
        Assert.assertThat(result, Is.is(beaty));

    }

    @Test
    public void displayProducts() {
        CosmeticDepartment shop = new CosmeticDepartment("Watsons", "Stryjska,135", 5);

        shop.addProduct(new BeatyProduct("Black", 350.0, ProductType.MASCARA,
                125));
        shop.addProduct(new Lipstick("Super100", 125.35, ProductType.LIPSTICK, 15,
                LipstickTaste.COCONUT, 567892));

        LinkedList<BeatyProduct> beaty = new LinkedList<>();
        beaty.add(new BeatyProduct("Black", 350.0, ProductType.MASCARA,
                125));
        beaty.add(new Lipstick("Super100", 125.35, ProductType.LIPSTICK, 15,
                LipstickTaste.COCONUT, 567892));
        Assert.assertEquals(shop.getProductList(), beaty);


    }


    @Test
    public void findAvailableProductsTest1() {
        CosmeticDepartment shop = new CosmeticDepartment("Watsons", "Stryjska,135", 5);

        shop.addProduct(new BeatyProduct("Black", 350.0, ProductType.MASCARA, 125));
        shop.addProduct(new Lipstick("Super100", 125.35, ProductType.LIPSTICK, 15,
                LipstickTaste.COCONUT, 567892));
        shop.addProduct(new BeatyProduct("Beet", 35.0, ProductType.BLUSH, 13));
        shop.addProduct(new HairProduct("Super100", 198.99, ProductType.HAIRCONDITIONERS, 3,
                HairType.WAVY, 1000));
        shop.addProduct(new BeatyProduct("Love", 100.50, ProductType.GEL, 2));
        shop.addProduct(new BeatyProduct("Tiger", 15.25, ProductType.EYELINER, 115));

        List<BeatyProduct> list = new LinkedList<>();
        list.add(new BeatyProduct("Love", 100.50, ProductType.GEL, 2));
        list.add(new BeatyProduct("Beet", 35.0, ProductType.BLUSH, 13));
        list.add(new BeatyProduct("Tiger", 15.25, ProductType.EYELINER, 115));

        money = 125.0;
        choice = true;
        List<BeatyProduct> avialableForCustomerProducts = shop.findAvailableProducts(choice, money);

        Assert.assertEquals(avialableForCustomerProducts, list);
    }

    @Test
    public void findAvailableProductsTest2() {
        CosmeticDepartment shop = new CosmeticDepartment("Watsons", "Stryjska,135", 5);

        shop.addProduct(new BeatyProduct("Black", 350.0, ProductType.MASCARA, 125));
        shop.addProduct(new Lipstick("Super100", 125.35, ProductType.LIPSTICK, 15,
                LipstickTaste.COCONUT, 567892));
        shop.addProduct(new BeatyProduct("Beet", 35.0, ProductType.BLUSH, 13));
        shop.addProduct(new HairProduct("Super100", 198.99, ProductType.HAIRCONDITIONERS, 3,
                HairType.WAVY, 1000));
        shop.addProduct(new BeatyProduct("Love", 100.50, ProductType.GEL, 2));
        shop.addProduct(new BeatyProduct("Tiger", 15.25, ProductType.EYELINER, 115));

        List<BeatyProduct> list = new LinkedList<>();
        list.add(new BeatyProduct("Beet", 35.0, ProductType.BLUSH, 13));
        list.add(new BeatyProduct("Tiger", 15.25, ProductType.EYELINER, 115));

        money = 125.0;
        choice = false;
        List<BeatyProduct> avialableForCustomerProducts = shop.findAvailableProducts(choice, money);

        Assert.assertThat(avialableForCustomerProducts, Is.is(list));
    }

    @Test
    public void findAvailableProductsTest3() {
        CosmeticDepartment shop = new CosmeticDepartment("Watsons", "Stryjska,135", 5);

        shop.addProduct(new BeatyProduct("Black", 350.0, ProductType.MASCARA, 125));
        shop.addProduct(new Lipstick("Super100", 125.35, ProductType.LIPSTICK, 15,
                LipstickTaste.COCONUT, 567892));
        shop.addProduct(new BeatyProduct("Beet", 35.0, ProductType.BLUSH, 13));
        shop.addProduct(new HairProduct("Super100", 198.99, ProductType.HAIRCONDITIONERS, 3,
                HairType.WAVY, 1000));
        shop.addProduct(new BeatyProduct("Love", 100.50, ProductType.GEL, 2));
        shop.addProduct(new BeatyProduct("Tiger", 15.25, ProductType.EYELINER, 115));

        List<BeatyProduct> list = new LinkedList<>();

        money = 5.0;
        choice = false;
        List<BeatyProduct> avialableForCustomerProducts = shop.findAvailableProducts(choice, money);

        Assert.assertThat(avialableForCustomerProducts, Is.is(list));
    }

    @Test
    public void getProductList() {
    }

    @Test(expected = NullPointerException.class)
    public void getName() {
        Assert.assertFalse(this.cosmeticDepartment.getName().isEmpty());
    }

    @Test
    public void setName() {
        this.cosmeticDepartment.setName("shop");
        Assert.assertThat(this.cosmeticDepartment.getName(), Is.is("shop"));
    }

    @Test(expected = NullPointerException.class)
    public void getAddressOfShop() {
        Assert.assertFalse(this.cosmeticDepartment.getAddressOfShop().isEmpty());
    }

    @Test
    public void setAddressOfShop() {
        this.cosmeticDepartment.setAddressOfShop("Lvivska,125");
        Assert.assertEquals(this.cosmeticDepartment.getAddressOfShop(), "Lvivska,125");
    }

    @Test
    public void getFloor() {
        cosmeticDepartment.setFloor(7);
        Assert.assertEquals(this.cosmeticDepartment.getFloor(), 7);
    }

    @Test
    public void setFloor() {
        this.cosmeticDepartment.setFloor(7);
        Assert.assertEquals(this.cosmeticDepartment.getFloor(), 7);
    }

    @Test
    public void setProductList() throws NullPointerException {
        List<BeatyProduct> productList = new LinkedList<>();
        BeatyProduct beaty = new BeatyProduct("Black", 350.0, ProductType.MASCARA, 125);

        productList.add(beaty);
        this.cosmeticDepartment.setProductList(productList);
        Assert.assertTrue(this.cosmeticDepartment.getProductList().contains(beaty));
    }


}