package com.example.newkettle;
public class Kettle {
    public static final int DEFAULT_WATER = 0;
    private int water;
    public static final String DEFAULT_MATERIAL = "Copper";
    private String material;

    public Kettle() {
        this(DEFAULT_WATER, DEFAULT_MATERIAL);
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        if (water >= 0) {
            this.water = water;
        } else {
            throw new IllegalArgumentException("water cannot be negative");
        }
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Kettle(int water, String material) {
        this.water = water;
        this.material = material;
    }
}