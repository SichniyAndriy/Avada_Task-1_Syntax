package main.java.chapter_4;

import main.SyntaxUtil;

/*
 * Напишите программу которая сравнивает два числа и выводит наибольшее из них.
 */
public class Main {
    public static void main(String[] args) {
        double first = SyntaxUtil.getDoubleNumber(SyntaxUtil.ASK_FOR_FIRST_NUMBER);
        double second = SyntaxUtil.getDoubleNumber(SyntaxUtil.ASK_FOR_SECOND_NUMBER);

        String res = SyntaxUtil.numberFormatter.format(Math.max(first, second));
        System.out.println("Найбільше з двох чисел: " + res);
    }
}
