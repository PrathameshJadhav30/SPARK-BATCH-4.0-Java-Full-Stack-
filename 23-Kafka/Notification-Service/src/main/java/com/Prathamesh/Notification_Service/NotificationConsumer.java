package com.Prathamesh.Notification_Service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class NotificationConsumer {


    @KafkaListener(topics = "order-topic", groupId = "notification-group")
    public void consume(String message)
    {
        System.out.println("Notification received for order: " + message);
    }
}
