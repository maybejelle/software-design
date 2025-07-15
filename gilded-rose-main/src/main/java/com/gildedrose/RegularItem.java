package com.gildedrose;

public class RegularItem extends Item {

    public RegularItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    void updateItem(){
        super.decreaseQuality();

        sellIn = sellIn - 1;

        if (sellIn < 0) {
           super.decreaseQuality();
        }
    }
}
