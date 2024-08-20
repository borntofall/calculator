package calculator.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public static String plusService(Integer num1, Integer num2) {
        return String.valueOf(num1 + num2);
    }

    public static String minusService(Integer num1, Integer num2) {
        return String.valueOf(num1 - num2);
    }

    public static String multiplyService(Integer num1, Integer num2) {
        return String.valueOf(num1 * num2);
    }

    public static String divideService(Integer num1, Integer num2) {
        return String.valueOf(num1 / num2);
    }

}
