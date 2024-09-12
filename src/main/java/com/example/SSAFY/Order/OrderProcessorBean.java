package com.example.SSAFY.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderProcessorBean {
    private final OrderReceiverBean orderReceiverBean;
    private final PaymentProcessorBean paymentProcessorBean;

    @Autowired
    public OrderProcessorBean(OrderReceiverBean orderReceiverBean, PaymentProcessorBean paymentProcessorBean) {
        this.orderReceiverBean = orderReceiverBean;
        this.paymentProcessorBean = paymentProcessorBean;
    }

    public void processOrder() {
        orderReceiverBean.receiveOrder();
        paymentProcessorBean.processPayment();
    }
}
