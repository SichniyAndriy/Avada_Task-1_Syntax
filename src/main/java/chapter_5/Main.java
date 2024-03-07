package main.java.chapter_5;

import main.SyntaxUtil;

/*
 * Напишите программу которая проверяет, является ли введенное число четным или нечетным,
 * и выводит соответствующее сообщение
 */
public class Main {
    public static void main(String[] args) {
        int number = SyntaxUtil.getIntNumber(SyntaxUtil.ASK_FOR_NUMBER);

        System.out.println("Число " + ((number & 1) != 1 ? "парне" : "непарне"));
    }
}
