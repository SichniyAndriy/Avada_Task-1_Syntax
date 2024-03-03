package main.java.chapter_11;

import main.SyntaxUtil;

/*
 * Напишите программу с использованием метода, который принимает число и проверяет,
 * является ли оно простым (не имеет делителей, кроме 1 и самого себя),
 * и возвращает соответствующее булево значение
 */
public class Main {
    public static void main(String[] args) {
        int number = SyntaxUtil.getIntNumber(SyntaxUtil.ASK_FOR_NUMBER);
        boolean res = true;
        if (0 == number % 2) {
            res = false;
        } else {
            int len = (int) Math.sqrt(number);
            for (int i = 3; i <= len; i += 2) {
                if (0 == number % i) {
                    res = false;
                    break;
                }
            }
        }
        System.out.println("Число " + (res ? "просте" : "не просте"));
    }
}
