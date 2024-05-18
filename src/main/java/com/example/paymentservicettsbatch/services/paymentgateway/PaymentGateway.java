package com.example.paymentservicettsbatch.services.paymentgateway;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;

public interface PaymentGateway {
    String generatePaymentLink(Long orderId, String name, int amount) throws RazorpayException, StripeException;

    boolean validatePayment(Long orderId);
}
