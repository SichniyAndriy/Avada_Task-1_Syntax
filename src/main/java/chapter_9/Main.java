package main.java.chapter_9;

import main.SyntaxUtil;

/*
 * Напишите программу которая считывает число и выводит сумму всех чисел от 1 до введенного числа
 */
public class Main {
    public static void main(String[] args) {
        int number = SyntaxUtil.getIntNumber(SyntaxUtil.ASK_FOR_NUMBER);
        if (number < 1) {
            throw new RuntimeException(SyntaxUtil.ERROR_NUMBER_INPUT);
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum += i;
        }
        System.out.println("Сума від 1 до " + number + ": " + sum);
    }
}
