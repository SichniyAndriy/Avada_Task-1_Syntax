package main.kotlin

import main.SyntaxUtil

fun main() {
    val number = SyntaxUtil.getIntNumber(SyntaxUtil.ASK_FOR_NUMBER)
    val res : String = if (number % 2 == 0) "Число парне" else "Число не парне"
    println(res)
}
