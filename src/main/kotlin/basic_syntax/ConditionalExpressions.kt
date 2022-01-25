package main.basic_syntax

fun main() {
   println("max of 0 and 42 is ${maxOf(0,42)}")
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

// 아래와 같이 표현식으로 사용할 수 있다.
fun maxOf2(a: Int, b: Int) = if (a > b) a else b