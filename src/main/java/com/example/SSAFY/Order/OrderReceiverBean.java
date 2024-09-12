package com.example.SSAFY.Order;

import org.springframework.stereotype.Component;

@Component
public class OrderReceiverBean {
    void receiveOrder() {
        System.out.println("주문을 받는다");
    }
}
