package com.patterns.CommandPartner;

/**
 * Created by ldurazo on 8/26/2014.
 */
public class SellStock implements Order{
    private Stock abcStock;
    public SellStock(Stock abcStock){
        this.abcStock=abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
