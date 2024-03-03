package main.kotlin

import main.SyntaxUtil

fun main() {
    val year = SyntaxUtil.getIntNumber("Введіть рік: ")
    var flag = false

    if (0 == year.mod(100)) {
        if (0 == year.mod(400)) {
            flag = true
        }
    } else if (0 == year.mod(4)) {
        flag = true
    }

    print("Рік ${if (flag) "високосний" else "не високосний"}")
}
