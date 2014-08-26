package com.patterns.CommandPartner;

/**
 * Created by ldurazo on 8/26/2014.
 */
public class BuyStock implements Order{
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
