package com.example.paymentservicettsbatch.controllers;

import com.example.paymentservicettsbatch.dtos.InitiatePaymentRequestDto;
import com.example.paymentservicettsbatch.services.PaymentService;
import com.razorpay.RazorpayException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/")
    public String initiatePayment(@RequestBody InitiatePaymentRequestDto requestDto) {
        String payment = null;
        try {
            payment = paymentService.initiatePayment(
                    requestDto.getOrderId(),
                    requestDto.getName(),
                    requestDto.getAmount()
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return payment;
    }

}
