package main.java.chapter_6;

import main.SyntaxUtil;

/*
 * Напишите программу которая проверяет, является ли введенный год високосным,
 * и выводит соответствующее сообщение
 */
public class Main {
    public static void main(String[] args) {
        int year = SyntaxUtil.getIntNumber("Введіть рік: ");
        String res = "Рік не високосний";
        if (0 == year % 100 && 0 == year % 400) {
            res = "Рік високосний";
        } else if (0 == year % 4) {
            res = "Рік високосний";
        }
        System.out.println(res);
    }
}
