package com.scrubele;

import org.junit.Assert;
import org.junit.Test;

public class LipstickTest {

    Lipstick lipstick = new Lipstick();
    @Test
    public void createLipstickTest(){
        Lipstick lipsticks = new Lipstick("Super100", 125.35, ProductType.LIPSTICK, 15,
                LipstickTaste.COCONUT, 567892);
        Lipstick lipsticks1 = new Lipstick(lipsticks.getName(), lipsticks.getPrice(),
                lipsticks.getType(), lipsticks.getQuantity(),lipsticks.getTaste(), lipsticks.getColorCode());
        Assert.assertEquals(lipsticks, lipsticks1);
    }

    @Test
    public void toStringTest() {
        Lipstick lipsticks = new Lipstick("Super100", 125.35, ProductType.LIPSTICK, 15,
                LipstickTaste.COCONUT, 567892);
        Assert.assertEquals( lipsticks.toString(),"LIPSTICK"+" { name=" + "Super100" +
                ", price =" + "125.35" +
                ", taste=" + "COCONUT" +
                ", colorCode=" + "567892" +
                '}');
    }

    @Test
    public void setTaste() {
    }

    @Test
    public void setColorCode() {
    }

    @Test
    public void getTaste() {
        lipstick.setTaste(LipstickTaste.COCONUT);
        Assert.assertEquals(this.lipstick.getTaste(), LipstickTaste.COCONUT);
    }

    @Test
    public void getColorCode() {
        lipstick.setColorCode(123456);
        Assert.assertEquals(this.lipstick.getColorCode(),123456);
    }
}