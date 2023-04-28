package com.example.spravochnik;

public class Flower {
    private String name;
    private String flowerDescription;
    private int flowerResource;
    private String flowerWaterSize;

    public Flower(String name, String flowerDescription, int flowerResource, String flowerSize) {
        this.name = name;
        this.flowerDescription = flowerDescription;
        this.flowerResource = flowerResource;
        this.flowerWaterSize = flowerSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlowerDescription() {
        return flowerDescription;
    }

    public void setFlowerDescription(String flowerDescription) {
        this.flowerDescription = flowerDescription;
    }

    public int getFlowerResource() {
        return flowerResource;
    }

    public void setFlowerResource(int flowerResource) {
        this.flowerResource = flowerResource;
    }

    public String getFlowerSize() {
        return flowerWaterSize;
    }

    public void setFlowerSize(String flowerSize) {
        this.flowerWaterSize = flowerSize;
    }
}
