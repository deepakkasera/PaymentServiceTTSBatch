package com.example.paymentservicettsbatch.services;

public interface PaymentService {
    public String initiatePayment(Long orderId, String name, int amount);
}
