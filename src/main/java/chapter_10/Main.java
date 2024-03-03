package main.java.chapter_10;

import main.SyntaxUtil;

/*
 * Напишите программу с использованием метода, который принимает два числа и возвращает их сумму
 */
public class Main {
    public static void main(String[] args) {
        double first = SyntaxUtil.getDoubleNumber(SyntaxUtil.ASK_FOR_FIRST_NUMBER);
        double second = SyntaxUtil.getDoubleNumber(SyntaxUtil.ASK_FOR_SECOND_NUMBER);

        String res = SyntaxUtil.numberFormatter.format(Double.sum(first, second));
        System.out.println("Сума чисел: " + res);
    }
}
