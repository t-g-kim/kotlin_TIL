package basic_syntax


fun main() {

    // 읽기 전용 지역 변수는 키워드 val을 사용하여 정의된다.
    // 한번만 값을 할당할 수 있다.
    val a: Int = 1  // 즉시 할당
    val b = 2       // Int형이 유추 된다
    val c: Int      // 초기화를 하지 않음
    c = 3           // 지연할당
    print("a = $a, b = $b, c = $c")


    // 재할당할 수 있는 변수는 var 키워드를 사용한다.
    var x = 5   // Int type으로 유추된다.
    x += 1
    println("x = $x")

    println("x = $x; pI = $PI")
    incrementX()
    println("incrementX()")
    println("x = $x; PI = $PI")
}

// 최상위에 변수를 선언할 수있다.
val PI = 3.14
var x = 0

fun incrementX() {
    x += 1
}