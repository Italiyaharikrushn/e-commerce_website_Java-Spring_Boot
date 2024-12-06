package com.restaurant.restaurant.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String Description;
    private Long price;

    @ManyToOne
    private Category foodCategory;

    @Column(length = 1000)
    @ElementCollection
    private List<String> images;

    private boolean available;

    @ManyToOne
    @JsonManagedReference
    private Restaurant restaurant;

    private boolean isVegetarian;
    private boolean isSeasonal;

    @OneToMany
//    @JsonBackReference
    private List<IngredientsItem> ingredients = new ArrayList<>();

    private Date creationDate;
}