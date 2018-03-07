package com.scrubele;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class BeatyProductTest {

    BeatyProduct beatyProduct = new BeatyProduct();
    ProductType type;

    @Test
    public void setName() {
        this.beatyProduct.setName("beaty");
        Assert.assertEquals(this.beatyProduct.getName(),"beaty");
    }

    @Test
    public void setPrice() {
        this.beatyProduct.setPrice(500.0);
        Assert.assertEquals(java.util.Optional.of((Double) this.beatyProduct.getPrice()), java.util.Optional.of(500.0));
    }

    @Test
    public void setType() {
        type=ProductType.EYELINER;
        this.beatyProduct.setType(type);
        Assert.assertEquals(this.beatyProduct.getType(),type);
    }

    @Test
    public void setQuantity() {
        this.beatyProduct.setQuantity(2);
        Assert.assertThat(this.beatyProduct.getQuantity(), Is.is(2));
    }

    @Test
    public void toStringTest() {
        BeatyProduct beaty = new BeatyProduct("Black", 350.0, ProductType.MASCARA, 125);
       Assert.assertEquals( beaty.toString(), "MASCARA" + " {" +
               "name='" + "Black" + '\'' +
               ", price=" + "350.0" +
               ", quantity=" + "125" +
               '}');

    }

    @Test(expected = NullPointerException.class)
    public void getName() {
        Assert.assertFalse(this.beatyProduct.getName().isEmpty());
    }

    @Test
    public void getPrice() {
        this.beatyProduct.setPrice(500.0);
        Assert.assertEquals(java.util.Optional.of((Double) this.beatyProduct.getPrice()), java.util.Optional.of(500.0));

    }

    @Test
    public void getType() {
        this.beatyProduct.setType(ProductType.BLUSH);
        Assert.assertEquals(this.beatyProduct.getType(), ProductType.BLUSH);
    }

    @Test
    public void getQuantity() {
        this.beatyProduct.setQuantity(3);
        Assert.assertEquals(java.util.Optional.ofNullable(this.beatyProduct.getQuantity()), java.util.Optional.ofNullable(3));

    }
}