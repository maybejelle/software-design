package com.gildedrose;

public class BackstagePass extends Item {

    public BackstagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void updateItem() {
        if (quality < 50) {
            quality = quality + 1;
            checkSellIn();
        }

        super.decreaseSellIn();
        checkForQualityReset();
    }

    private void checkSellIn() {
        if (sellIn < 11) {
            super.increaseQuality();
        }

        if (sellIn < 6) {
            super.increaseQuality();
        }
    }

    void checkForQualityReset() {
        if (sellIn < 0) {
            quality = 0;
        }
    }
}
