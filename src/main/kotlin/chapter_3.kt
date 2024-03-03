package main.kotlin

import main.SyntaxUtil

/*
 * Напишите программу которая проверяет, является ли введенное число положительным,
 * отрицательным или нулем, и выводит соответствующее сообщение.
 */
fun main() {
    val number = SyntaxUtil.getIntNumber(SyntaxUtil.ASK_FOR_FIRST_NUMBER)
    val res = if (number > 0) "Число позитивне"
    else if (number < 0) "Число негативне"
    else "Число дорівнює нулю"
    println(res)

    val number2 = SyntaxUtil.getIntNumber(SyntaxUtil.ASK_FOR_SECOND_NUMBER)
    val res2 = when (number2) {
        in (1..Int.MAX_VALUE) -> "Число позитивне"
        in (Int.MIN_VALUE..-1) -> "Число негативне"
        0 -> "Число дорівнює нулю"
        else -> "Маячня якась..."
    }
    println(res2)
}
