package com.gildedrose;

public class Conjured extends Item {
    Conjured(int sellIn, int quality) {
        super("Conjured", sellIn, quality);
    }

    @Override
    protected void doUpdateQuality() {
        super.doUpdateQuality();
        super.doUpdateQuality();
    }
}
