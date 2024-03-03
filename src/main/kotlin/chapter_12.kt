package main.kotlin

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Введіть строку: ")
    println("Строка містить ${length(scanner.nextLine())} символів")
}

fun length(line : String) = line.length
