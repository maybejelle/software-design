package com.gildedrose;

public abstract class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    abstract void updateItem();

    protected void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    protected void decreaseSellIn() {
        sellIn = sellIn - 1;
    }

    protected void decreaseQuality() {
        if(quality > 0) {
            quality = quality - 1;
        }
    }
    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
