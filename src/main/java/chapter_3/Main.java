package main.java.chapter_3;

import main.SyntaxUtil;

/*
 * Напишите программу которая проверяет, является ли введенное число положительным,
 * отрицательным или нулем, и выводит соответствующее сообщение.
 */
public class Main {
    public static void main(String[] args) {
        int num = SyntaxUtil.getIntNumber(SyntaxUtil.ASK_FOR_NUMBER);

        String res = "Число " + (num == 0 ? "дорівнює нулю" : num > 0 ? "позитивне" : "негативне");
        System.out.println(res);
    }
}
