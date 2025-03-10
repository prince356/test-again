package com.example.greetingapp.Controller;

import com.example.greetingapp.Model.Greeting;
import com.example.greetingapp.Service.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @PostMapping("/save")
    public Greeting saveGreeting(@RequestParam(required = false) String firstName,
                                 @RequestParam(required = false) String lastName) {
        return greetingService.saveGreeting(firstName, lastName);
    }

    @GetMapping("/hello")  // Added a GET method to test in browser
    public String testGreeting() {
        return "Hello, Spring Boot is running!";
    }
}