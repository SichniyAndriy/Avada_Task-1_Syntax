package main.java.chapter_12;

import java.util.Scanner;

/*
 * Напишите программу с использованием метода, который принимает строку и возвращает ее длину
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("Введіть строку: ");
        String line = new Scanner(System.in).nextLine();
        System.out.println("Символів в строці: " + line.length());
    }
}
