package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Qualifier("demoServiceImpl")
    @Autowired
    DemoService ds;

    @GetMapping("/calc/{num1}/{operator}/{num2}")
    public String Calc(@PathVariable String num1, @PathVariable String operator, @PathVariable String num2){
        return (ds.Operating(num1, operator, num2));
    }
}
