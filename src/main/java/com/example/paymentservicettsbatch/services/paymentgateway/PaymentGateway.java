package com.example.paymentservicettsbatch.services.paymentgateway;

import com.razorpay.RazorpayException;

public interface PaymentGateway {
    String generatePaymentLink(Long orderId, String name, int amount) throws RazorpayException;

    boolean validatePayment(Long orderId);
}
