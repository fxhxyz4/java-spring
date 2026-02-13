package com.student.calculator.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("") // пустий, context-path вказаний в resources/application.yml
public class CalculatorController {

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }

    @GetMapping("/divide")
    public Object divide(@RequestParam int a, @RequestParam int b) {
        if (b == 0) {
            return Map.of("Error", "не можна ділити на нуль");
        } else {
            return a / b;
        }
    }
}