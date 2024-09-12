package com.example.SSAFY.Config;

import com.example.SSAFY.Chef.ChefBean;
import com.example.SSAFY.Delivery.DeliveryServiceBean;
import com.example.SSAFY.Order.OrderProcessorBean;
import com.example.SSAFY.Order.OrderReceiverBean;
import com.example.SSAFY.Order.PaymentProcessorBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public OrderReceiverBean orderReceiverBean() {
        return new OrderReceiverBean();
    }

    @Bean
    public PaymentProcessorBean paymentProcessorBean() {
        return new PaymentProcessorBean();
    }

    @Bean
    public OrderProcessorBean orderProcessorBean() {
        return new OrderProcessorBean(orderReceiverBean(), paymentProcessorBean());
    }

    @Bean
    public ChefBean chefBean() {
        return new ChefBean();
    }

    @Bean
    public DeliveryServiceBean deliveryServiceBean() {
        return new DeliveryServiceBean();
    }
}
