package main.kotlin

import main.SyntaxUtil

fun main() {
    val number = SyntaxUtil.getIntNumber(SyntaxUtil.ASK_FOR_NUMBER)
    for (i in 1..10) {
        println("${String.format("%2d", i)} * $number = ${number * i}")
    }
}
