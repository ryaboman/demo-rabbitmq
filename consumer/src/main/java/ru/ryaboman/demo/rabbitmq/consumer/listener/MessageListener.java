package ru.ryaboman.demo.rabbitmq.consumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    private final SimpMessagingTemplate messagingTemplate;

    public MessageListener(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @RabbitListener(queues = "hello")
    public void processMessage(String message) {
        System.out.println("Получено сообщение: " + message);
        messagingTemplate.convertAndSend("/topic/messages", message);
    }
}
