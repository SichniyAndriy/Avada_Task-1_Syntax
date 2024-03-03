package main.kotlin

import main.SyntaxUtil
import kotlin.math.sqrt

fun main() {
    val number = SyntaxUtil.getIntNumber(SyntaxUtil.ASK_FOR_NUMBER)
    println("Число ${if (isSimple(number)) "просте" else "не просте"}")
}

fun isSimple(number : Int) : Boolean {
    val res = true
    if (0 == number.mod(2)) {
        return false
    } else {
        val len = sqrt(number.toDouble()).toInt()
        for (i in 3..len step 2) {
            if (0 == number.mod(i)) {
                return false
            }
        }
    }
    return res
}
