package com.sparta.delivery.dto;

import lombok.Getter;
@Getter
public class RestaurantRequestDto {
    private String name;
    private int minOrderPrice;
    private int deliveryFee;
}
