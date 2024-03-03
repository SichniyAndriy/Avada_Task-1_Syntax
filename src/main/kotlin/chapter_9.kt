package main.kotlin

import main.SyntaxUtil

fun main() {
    val number = SyntaxUtil.getIntNumber(SyntaxUtil.ASK_FOR_NUMBER)
    if (number < 1) {
        throw IllegalArgumentException(SyntaxUtil.ERROR_NUMBER_INPUT)
    }
    val list = mutableListOf<Int>()
    println("Сума елементів: ${(1..number).sum()}")
}
