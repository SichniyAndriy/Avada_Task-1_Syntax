package main.java.chapter_2;

import main.SyntaxUtil;

/*
 * Напишите программу которая считывает два числа с клавиатуры и выводит их сумму.
 */
public class Main {
    public static void main(String[] args) {
        Double first = SyntaxUtil.getDoubleNumber(SyntaxUtil.ASK_FOR_FIRST_NUMBER);
        Double second = SyntaxUtil.getDoubleNumber(SyntaxUtil.ASK_FOR_SECOND_NUMBER);

        String res = SyntaxUtil.numberFormatter.format(first + second);
        System.out.println("Сумма: " + res);
    }
}
