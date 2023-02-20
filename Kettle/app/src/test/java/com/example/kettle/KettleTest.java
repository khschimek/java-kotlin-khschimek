package com.example.kettle;
import static org.junit.Assert.*;
import org.junit.Test;
class KettleTest {
    @Test
    public void checkWaterAmount(){
        Kettle kettle = new Kettle();
        assertEquals(0, kettle.waterAmount());
    }
    @Test
    public void checkWhatMaterial() {
        Kettle kettle = new Kettle();
        assertEquals("material", kettle.whatMaterial());
    }
}