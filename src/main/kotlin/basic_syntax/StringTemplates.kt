package main.basic_syntax

fun main() {
    var a = 1
    val s1 = "a is $a"

    a = 2
    //  임의의 표현식
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}