package com.thoughtworks.ketsu.infrastructure.records;

import com.thoughtworks.ketsu.infrastructure.core.Order;

import java.util.List;

/**
 * Created by syzhang on 7/18/16.
 */
public class OrderRecord implements Order {
    private int id;
    private int userId;
    private String name;
    private String phone;
    private String address;
    private float totalPrice;
    private List<OrderItemRecord> items;

    public OrderRecord(int userId, int id){
        this.userId = userId;
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getUserId() {
        return userId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public float getTotalPrice() {
        return totalPrice;
    }

    @Override
    public List<OrderItemRecord> getItems() {
        return items;
    }
}
