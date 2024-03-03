package main.java.chapter_8;

import main.SyntaxUtil;

/*
 * Напишите программу которая считывает число и выводит таблицу умножения для этого числа от 1 до 10.
 */
public class Main {
    public static void main(String[] args) {
        int number = SyntaxUtil.getIntNumber(SyntaxUtil.ASK_FOR_NUMBER);
        for (int i = 1; i < 11; i++) {
            String s = String.format("%2d", i);
            System.out.println(s + " * " + number + " = " + (i * number));
        }
    }
}
