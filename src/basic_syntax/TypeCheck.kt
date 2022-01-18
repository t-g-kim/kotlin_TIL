package basic_syntax

fun getStringLength(obj: Any): Int? {

    if (obj is String) {
        // obj는 String으로 자동 캐스트
        return obj.length
    }

    // obj는 여전히 Any타입이다.
    return null
}

fun main() {
    fun printLength(obj: Any) {
        println("Getting the length of '$obj'. Result ${getStringLength(obj) ?: "Error: the object is not a string"}")
    }
    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))
}