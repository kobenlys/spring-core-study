package com.example.SSAFY.Order;

import org.springframework.stereotype.Component;

@Component
public class PaymentProcessorBean {
    void processPayment() {
        System.out.println("결제를 처리한다.");
    }
}
