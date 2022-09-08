package com.example.npcapp;

import android.widget.TextView;

public class MathySource extends NonPlayerCharacter {
    public MathySource(String name) {
        super(name, "Let's do some fuckin' math!", "Enter any equation and I'll solve it.");
    }

    public String interact(TextView input) {
        try {
            String[] parts = input.toString().split(" ");

            if (parts[0].contains(".") || parts[2].contains(".")) {
                double first = Double.parseDouble(parts[0]);
                String operator = parts[1];
                double second = Double.parseDouble(parts[2]);

                double result;
                switch (operator) {
                    case "+":
                        result = first + second;
                        break;
                    case "-":
                        result = first - second;
                        break;
                    case "*":
                        result = first * second;
                        break;
                    case "/":
                        result = first / second;
                        break;
                    case "%":
                        result = first % second;
                        break;
                    default:
                        throw new Exception("Unknown operator: " + operator);
                }
                return String.valueOf(result);
            } else {
                int first = Integer.parseInt(parts[0]);
                String operator = parts[1];
                int second = Integer.parseInt(parts[2]);

                int result;
                switch (operator) {
                    case "+":
                        result = first + second;
                        break;
                    case "-":
                        result = first - second;
                        break;
                    case "*":
                        result = first * second;
                        break;
                    case "/":
                        result = first / second;
                        break;
                    case "%":
                        result = first % second;
                        break;
                    default:
                        throw new Exception("Unknown operator: " + operator);
                }
                return String.valueOf(result);
            }
        } catch (Exception e) {
            System.out.println("WTF");
        }
        return "";
    }
}
