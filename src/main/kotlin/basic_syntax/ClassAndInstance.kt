package main.basic_syntax

class ClassAndInstance

open class Shape

// 클래스의 속성은 선언 또는 본문에 나열될 수 있다.
class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}

/*
    클래스 간의 상속은 콜론으로 선언된다. 클래스는 기본적으로 final이다.
    클래스를 상속 가능하게 하려면 open으로 표시한다.
 */
class Rectangle2(var height: Double, var length: Double): Shape() {
    var perimeter = (height + length) * 2
}

fun main() {
    // 클래스 선언의 매개변수가 나열된 기본 생성자는 자동으로 사용 가능하다.
    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
}