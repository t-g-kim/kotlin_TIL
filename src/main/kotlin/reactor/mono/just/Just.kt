package reactor.mono.just

import reactor.core.publisher.Mono

fun main() {
    // 모노를 생성하는 가장 간단한 방법은 Mono.just를 사용하는 것입니다.
    // Mono.just(T data)는 객체를 인자로 받은 뒤 모노로 래핑하는 팩토리 함수입니다.
    val mono: Mono<String> = Mono.just("Hello Reactive")
    mono.subscribe(::println)
}

/*
인자로 “Hello Reactive World”라는 String을 인자로 받았기 때문에 String이 감싸진 Mono<String>을 반환하며
그다음 라인에 작성된 mono.subscribe(::println)는 리액티브 스트림 사양의 Publisher.subscribe 함수를 구현하여 데이터를 구독합니다.

중요한 점은 플럭스와 모노는 게으르게(lazy) 동작하여 subscribe를 호출하지 않으면 연산자에 작성한 로직이 동작하지 않는다는 것입니다.
이런 특징은 Java8 스트림 API의 특성과 동일합니다. 스트림 API 역시 연산자를 트리거 하는 최종 연산자를 호출하지 않으면 스트림 연산이 동작하지 않습니다.
 */