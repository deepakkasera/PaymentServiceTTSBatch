package com.example.paymentservicettsbatch.services;

import com.example.paymentservicettsbatch.controllers.PaymentController;
import com.example.paymentservicettsbatch.services.paymentgateway.PaymentGateway;
import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    private PaymentGateway paymentGateway;

    public PaymentServiceImpl(@Qualifier("stripepaymentgateway") PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public String initiatePayment(Long orderId, String name, int amount) throws RazorpayException, StripeException {
        //Call the Payment Gateway to generate the payment link.
        return paymentGateway.generatePaymentLink(
                orderId,
                name,
                amount
        );
    }
}
