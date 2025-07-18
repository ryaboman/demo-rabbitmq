package ru.ryaboman.demo.rabbitmq.consumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = "hello")
    public void processMessage(String message) {
        System.out.println("=== Получено сообщение ===");
        System.out.println("Время: " + java.time.LocalTime.now());
        System.out.println("Содержимое: " + message);
        System.out.println("=========================");
    }
}
