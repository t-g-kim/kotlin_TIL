package main.basic_syntax

// null 값이 가능한 경우 nullable을 명시해야 한다. ?를 이용해
fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null) {
        "xy를 사용하면 null이 포함될 수 있으므로 오류 발생"
        println(x * y)
    } else {
        // x 및 y는 null 검사후 자동으로 non null로 캐스트
        println("'$arg1' or 'arg2' is not a number")
    }
}

fun printProduct2(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // ...
    if (x == null) {
        println("Wrong number format in arg1: '$arg1'")
        return
    }
    if (y == null) {
        println("Wrong number format in arg2: '$arg2'")
        return
    }

    // x and y are automatically cast to non-nullable after null check
    println(x * y)
}

fun main() {
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")

    printProduct2("6", "7")
    printProduct2("a", "7")
    printProduct2("99", "b")
}