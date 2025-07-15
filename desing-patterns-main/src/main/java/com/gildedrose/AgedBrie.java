package com.gildedrose;

public class AgedBrie extends Item {

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    void updateItem() {
        super.increaseQuality();
        super.decreaseSellIn();
        if (sellIn < 0) {
            super.increaseQuality();
        }
    }
}
