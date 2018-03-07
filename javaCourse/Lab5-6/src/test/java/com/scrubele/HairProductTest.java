package com.scrubele;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class HairProductTest {
    HairProduct hairProduct = new HairProduct();

    @Test
    public void toStringTest() {
        HairProduct hair = new HairProduct("Super100", 198.99, ProductType.HAIRCONDITIONERS, 3,
                HairType.WAVY, 1000);
        Assert.assertEquals(hair.toString(), "HAIRCONDITIONERS" + " { name=" + "Super100" +
                ", price =" + "198.99" +
                ", hairtype=" + "WAVY" +
                ", capasity=" + "1000" +
                '}');
    }

    @Test
    public void createHairProductTest() {
        HairProduct hair = new HairProduct("Super100", 198.99, ProductType.HAIRCONDITIONERS, 3,
                HairType.WAVY, 1000);
        HairProduct hair1 = new HairProduct(hair.getName(), hair.getPrice(),
                hair.getType(), hair.getQuantity(), hair.getHair(), hair.getCapasity());
        Assert.assertEquals(hair, hair1);
    }

    @Test
    public void getHair() {
        hairProduct.setHair(HairType.CURLY);
        Assert.assertEquals(this.hairProduct.getHair(), HairType.CURLY);
    }

    @Test
    public void getCapasity() {
        hairProduct.setCapasity(1);
        Assert.assertEquals(this.hairProduct.getCapasity(), 1);
    }
}