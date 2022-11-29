package com.kodilla.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;
import java.lang.*;
import java.io.*;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
        Calculator calc = new Calculator();
        System.out.println("14 - 3 = " + calc.subtract(14, 3));
        System.out.println("14 + 3 = " + calc.add(14, 3));
    }
}
