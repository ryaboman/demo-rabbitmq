package ru.ryaboman.demo.rabbitmq.consumer.Listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = "hello")
    public void processMessage(String message) {
        System.out.println("Получено сообщение: " + message);
    }
}
