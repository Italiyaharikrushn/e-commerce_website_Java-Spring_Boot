package com.restaurant.restaurant.service;

import com.restaurant.restaurant.model.Order;
import com.restaurant.restaurant.response.PaymentResponse;
import org.springframework.beans.factory.annotation.Value;

public class PaymentServiceImpl implements PaymentService{

    @Value("${strip.api.key}")
    private String stripeSecretKey;

    @Override
    public PaymentResponse createPaymentLink(Order order) {
        return null;
    }
}
