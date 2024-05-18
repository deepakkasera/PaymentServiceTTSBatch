package com.example.paymentservicettsbatch.configs;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorpayClientConfig {
    @Value("${razorpay.key.id}")
    private String razorPayKeyId;

    @Value("${razorpay.key.secret}")
    private String razorPaySecretId;

    @Bean
    public RazorpayClient getRazorpayClient() throws RazorpayException {
        return new RazorpayClient(razorPayKeyId, razorPaySecretId);
    }
}
