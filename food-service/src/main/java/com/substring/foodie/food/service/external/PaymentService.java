package com.substring.foodie.food.service.external;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "payment-service",url = "")
public interface PaymentService {

    //Implement like rest apis
}
