package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService{
    @Override
    public String Operating(String num1, String operator, String num2) {
        try {
            int rNum1 = Integer.parseInt(num1);
            int rNum2 = Integer.parseInt(num2);
            int result = 0;
            switch (operator) {
                case "+":
                    result = rNum1 + rNum2;
                    break;
                case "-":
                    result = rNum1 - rNum2;
                    break;
                case "*":
                    result = rNum1 * rNum2;
                    break;
                case "/":
                    result = rNum1 / rNum2;
                    break;
                 default:
                     throw new Exception();
            }
            return ""+result;
        }catch(Exception e){
            return "에러";
        }
    }
}
