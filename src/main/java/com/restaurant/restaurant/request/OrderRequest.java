package com.restaurant.restaurant.request;

import com.restaurant.restaurant.model.Address;
import lombok.Data;

@Data
public class OrderRequest {
    private Long id;
    private Long restaurantId;
    private Address deliveryAddress;
}