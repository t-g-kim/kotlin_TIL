package main.basic_syntax

fun main() {
    print("sum of 3 and 5 is ")
    println(sum(3, 5))
}

/*
    2개의 Int parameter, Int return type

    함수 본문은 표현식이 될 수 있다. return type이 유추된다.
    fun sum(a: Int, b: Int) = a + b
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

/*
    retrun이 없는 function
    Unit : 아무것도 반환하지 않는 function
 */
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

// return type은 생략될 수 있다.
fun printSum2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}
