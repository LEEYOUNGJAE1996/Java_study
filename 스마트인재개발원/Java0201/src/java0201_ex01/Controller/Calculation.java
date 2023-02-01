package java0201_ex01.Controller;

import java0201_ex01.Model.Employee;

public class Calculation {
    // Employee를 상속한 클래스는 전부 가능 ---> ex Employee e = 하위 클래스 b ==> upcasting
    // DIP 의존관계역전 calculation은 들어오는 객체에 의존 ---> 이 때 객체에는 추상화된 상위 객체(클래스)에 의존하는 것이
    // 확장성이 좋음
    public int calPayment(Employee e) {
        return e.payment();
    }
}
