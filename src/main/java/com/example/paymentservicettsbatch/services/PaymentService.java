package com.example.paymentservicettsbatch.services;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;

public interface PaymentService {
    String initiatePayment(Long orderId, String name, int amount) throws RazorpayException, StripeException;
}
