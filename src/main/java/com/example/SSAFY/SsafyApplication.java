package com.example.SSAFY;

import com.example.SSAFY.Chef.ChefBean;
import com.example.SSAFY.Config.AppConfig;
import com.example.SSAFY.Delivery.DeliveryServiceBean;
import com.example.SSAFY.Order.OrderProcessorBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SsafyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsafyApplication.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderProcessorBean orderProcessorBean = context.getBean("orderProcessorBean", OrderProcessorBean.class);
        ChefBean chefBean = context.getBean("chefBean", ChefBean.class);
        DeliveryServiceBean deliveryServiceBean = context.getBean("deliveryServiceBean", DeliveryServiceBean.class);

        orderProcessorBean.processOrder();
        chefBean.cook();
        deliveryServiceBean.deliver();
    }
}