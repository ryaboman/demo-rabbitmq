package ru.ryaboman.demo.rabbitmq.producer.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/")
    public String showForm() {
        return "index";
    }
}
