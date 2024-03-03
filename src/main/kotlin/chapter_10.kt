package main.kotlin

import main.SyntaxUtil

fun main() {
    val first = SyntaxUtil.getDoubleNumber(SyntaxUtil.ASK_FOR_FIRST_NUMBER)
    val second = SyntaxUtil.getDoubleNumber(SyntaxUtil.ASK_FOR_SECOND_NUMBER)
    println("Сума чисел: ${SyntaxUtil.numberFormatter.format(first.plus(second))}")
}
