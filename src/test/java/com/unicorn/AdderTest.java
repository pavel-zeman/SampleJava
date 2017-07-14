package com.unicorn;


import org.junit.Assert;
import org.junit.Test;

public class AdderTest {

    @Test
    public void testAdd() {
        Adder adder = new Adder();
        Assert.assertEquals(10, adder.add(6, 4));
    }
}
