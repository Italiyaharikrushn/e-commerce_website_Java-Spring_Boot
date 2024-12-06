package com.restaurant.restaurant.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping
    public ResponseEntity<String> HomeController(){
        return new ResponseEntity<>("Welcome to food delivery project", HttpStatus.OK);
    }
}