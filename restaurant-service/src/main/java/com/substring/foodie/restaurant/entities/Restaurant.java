package com.substring.foodie.restaurant.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.ArrayList;

@Entity
@Table(name = "restaurant")
@Getter
@Setter
public class Restaurant {
    @Id
    private String id;
    private String name;
    private String address;
    private String phone;
    @ElementCollection
    private ArrayList<String> pictures = new ArrayList<>();
    //priority 1
    private boolean open = false;

    // priority2
    private LocalTime openTime;
    private LocalTime closeTime;

    @Lob
    private String aboutRestaurant;
}
