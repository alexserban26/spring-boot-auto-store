package com.autostore.partstore.dto;

import com.autostore.partstore.entity.Address;
import com.autostore.partstore.entity.Customer;
import com.autostore.partstore.entity.Order;
import com.autostore.partstore.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
