package com.example.paymentservicettsbatch.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentRequestDto {
    private Long orderId;
    private String name;
    private int amount;
}
