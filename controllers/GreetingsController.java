package com.codeforce.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingsController {
    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("I love mimi");
    }
    @GetMapping("/say-good-bye")
    public ResponseEntity<String> sayGoodbye(){
        return ResponseEntity.ok("Goodbye");
    }
}
