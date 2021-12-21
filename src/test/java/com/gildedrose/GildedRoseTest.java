package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

class GildedRoseTest {

    @Test
    void update_quality() {

        String[] names = {"foo", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert", "Sulfuras, Hand of Ragnaros"};
        Integer[] sellIn = {-1, 0, 11};
        Integer[] qualities = {0, 1, 49, 50};

        CombinationApprovals.verifyAllCombinations(
                this::doUpdateQuality,
                names,
                sellIn,
                qualities);
    }

    private String doUpdateQuality(String name, int sellIn, int quality) {
        Item[] items = new Item[]{new Item(name, sellIn, quality)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        return app.items[0].toString();
    }


}
