package ru.ryaboman.demo.rabbitmq.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String status(Model model) {
        model.addAttribute("status", "Consumer is running");
        return "status";
    }
}
