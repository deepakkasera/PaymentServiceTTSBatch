package com.example.paymentservicettsbatch.controllers;

import com.example.paymentservicettsbatch.dtos.InitiatePaymentRequestDto;
import com.example.paymentservicettsbatch.services.PaymentService;
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
        return paymentService.initiatePayment(
                requestDto.getOrderId(),
                requestDto.getName(),
                requestDto.getAmount()
        );
    }

}
