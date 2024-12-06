package com.restaurant.restaurant.service;

import com.restaurant.restaurant.model.Order;
import com.restaurant.restaurant.response.PaymentResponse;

public interface PaymentService {
    public PaymentResponse createPaymentLink(Order order);
}
