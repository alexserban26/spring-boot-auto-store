package com.autostore.partstore.service;

import com.autostore.partstore.dto.Purchase;
import com.autostore.partstore.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
