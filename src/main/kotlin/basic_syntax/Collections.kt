package main.basic_syntax

fun main() {

    // 컬렉션을 반복
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }

    // in 연산자를 사용하여 컬렉션에 개체가 포함되어 있는지 확인
    when {
        "Orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

    // 람다식을 사용하여 컬렉션 및 필터링 및 매핑
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}