package com.example.greetingapp.Service;

import com.example.greetingapp.Model.Greeting;
import com.example.greetingapp.Repository.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public Greeting saveGreeting(String firstName, String lastName) {
        String message;
        if (firstName != null && lastName != null) {
            message = "Hello " + firstName + " " + lastName + " from BridgeLabz";
        } else if (firstName != null) {
            message = "Hello " + firstName + " from BridgeLabz";
        } else if (lastName != null) {
            message = "Hello " + lastName + " from BridgeLabz";
        } else {
            message = "Hello World from BridgeLabz";
        }
        Greeting greeting = new Greeting(message);
        return greetingRepository.save(greeting);
    }
}
