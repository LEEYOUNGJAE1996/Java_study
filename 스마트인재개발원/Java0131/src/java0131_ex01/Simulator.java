package java0131_ex01;

public class Simulator {

    public static void main(String args[]) {
        Cat c = new Cat();
        Dog d = new Dog();
        // 형제끼리는 casting 불가능
        // upcasting : 하위타입을 상위타입으로 자동형변화
        // a 는 Animal객체가 아닌 Cat 객체의 주소값을 가지고 있다.

        Animal a = c;

        // Down casting : 상위타입을 하위타입으로 강제형변환
        // Cat c2 = (Cat)new Animal(); // 메모리적으로 불가능
        Cat c2 = (Cat) a; // 강제 형변환 진행

        // overloading(중복정의)
        // overriding(재정의)
        // 1. 상속관계에서 가능 2. 상위클래스로부터 물려받은 메소드를 다시 재정의 하는 기법
        // 오버라이딩한 메소드 사용 예시
        c.eat();
        d.eat();
        // 다형성 : 똑같은 메소드를 이용해서 객체에 따라 다양한 결과가 나오도록 하는 기법
        // 상위 부모 클래스의 eat 메소드가 아닌 실제 객체의 재정의된 eat이 호출
        // ex 현재 Animal로 객체를 생성했지만 가르키는 주소는 Cat 주소를 가르키고 있다.
        // 그 결과 a.eat()메소드로 호출 시에는 cat주소를 따라 eat()을 출력
        a.eat();
        c2.eat();
    }

}