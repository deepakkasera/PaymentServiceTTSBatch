package com.example.paymentservicettsbatch.services.paymentgateway;

import org.springframework.stereotype.Service;

@Service("stripepaymentgateway")
public class StripePaymentGateway implements PaymentGateway {
    @Override
    public String generatePaymentLink(Long orderId, String name, int amount) {
        return null;
    }

    @Override
    public boolean validatePayment(Long orderId) {
        return false;
    }
}
