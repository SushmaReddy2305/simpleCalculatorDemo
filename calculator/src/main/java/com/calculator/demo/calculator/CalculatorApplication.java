package com.calculator.demo.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CalculatorApplication {
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public static double divide(int num1, int num2) {
		if (num2 == 0) {
			throw new IllegalArgumentException("Cannot divide by zero.");
		}
		return (double) num1 / num2;
	}

	public static void main(String[] args) {

		SpringApplication.run(CalculatorApplication.class, args);
		int num1 = 10;
		int num2 = 5;

		System.out.println("Addition: " + add(num1, num2));

	}

	@GetMapping("/")
	public String home() {
		return "index.html";
	}

}
