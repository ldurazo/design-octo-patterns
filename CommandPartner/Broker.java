package com.patterns.CommandPartner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ldurazo on 8/26/2014.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for(Order order: orderList){
            order.execute();
        }
        orderList.clear();
    }
}
