package day12.inner;

// 계산 기능을 명세
// 두 개의 정수를 상황에 맞게 연산할 수 있다

// 람다사용이 가능한지 체크 : 추상메서드가 1개인 경우
@FunctionalInterface
public interface Calculator {

    int operate(int n1, int n2);
}