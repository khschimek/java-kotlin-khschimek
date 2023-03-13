package com.example.newkettle;
import static org.junit.Assert.*;

import android.database.DatabaseErrorHandler;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class KettleTest {

    Kettle kettle;
    @Before
    public void setUp() throws Exception {
        kettle = new Kettle();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getWater() {
        assertEquals(Kettle.DEFAULT_WATER,kettle.getWater());
    }

    @Test
    public void setWaterOk() {
        kettle.setWater(33);
        assertEquals(33,kettle.getWater());

    }

    @Test(expected = IllegalArgumentException.class)
    public void setWaterBad() {
        kettle.setWater(-33);
        assertEquals(-33,kettle.getWater());
    }

    @Test
    public void getMaterial() {
    }

    @Test
    public void setMaterial() {
    }
}