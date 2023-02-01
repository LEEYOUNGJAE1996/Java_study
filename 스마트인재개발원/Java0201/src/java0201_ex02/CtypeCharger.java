package java0201_ex02;

// INTERFACE ----> FOR 설계
// 1. 필드 값은 static 상수
// 2. 메소드는 추상메소드

public interface CtypeCharger {
    public static final int id = 0; // 고정값!

    public void chargerStart(); // abstract 생략 가능

    public void chargeEnd();
}
