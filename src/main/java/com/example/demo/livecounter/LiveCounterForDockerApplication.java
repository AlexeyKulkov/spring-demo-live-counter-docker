package com.example.demo.livecounter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class LiveCounterForDockerApplication {

    private Long counter = 0L;

    public static void main(String[] args) {
        SpringApplication.run(LiveCounterForDockerApplication.class, args);
    }

    @GetMapping
    public String count() {
        return "you load this page " + counter++ + " times";
    }

}
