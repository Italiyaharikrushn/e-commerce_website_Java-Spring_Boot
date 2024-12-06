package com.restaurant.restaurant.dto;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Data
@Embeddable
public class RestaurantDto {
    private String title;

    @Column(length = 1000)
    private List<String> images;
//    private List<String> images =new ArrayList<>();

    private String description;
    private Long id;
}