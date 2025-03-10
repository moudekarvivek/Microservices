package com.substring.foodie.restaurant.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.ArrayList;

@Getter
@Setter
public class RestaurantDto {

    private String id;
    private String name;
    private String address;
    private String phone;
    private ArrayList<String> pictures = new ArrayList<>();
    //priority 1
    private boolean open = false;

    // priority2
    private LocalTime openTime;
    private LocalTime closeTime;
    private String aboutRestaurant;
}
