package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public interface DemoService {
    String Operating(String num1, String num2, String operator);
}
