package main.basic_syntax

fun main() {
    val x = 10
    val y = 9

    // in 연산자를 이용해 숫자가 범위 내에 있는지 확인
    if (x in 1..y + 1) {
        println("fits in range")
    }

    val list = listOf("a", "b", "c")

    // 숫자가 범우를 벗어나는지 확인
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }

    // 범위를 반복
    for (x in 1..5) {
        println(x)
    }

    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}