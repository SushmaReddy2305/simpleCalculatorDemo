package com.calculator.demo.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/add")
    public String addition() {
        int num1 = 20, num2 = 10;
        return " " + CalculatorApplication.add(num1, num2);

    }

    // @RequestMapping("/index")
    // public String index() {
    // return "index";
    // }
}
