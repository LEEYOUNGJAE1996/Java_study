package java0131_ex02;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        // 도형의 넓이를 계산해주는 프로그램
        // 다향한 도형을 확장할 수 있게 설계

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1.사각형 2.삼각형 3. 종료 >> ");
            int choice = sc.nextInt();
            AreaCalculator area = new AreaCalculator();
            if (choice == 1) {
                System.out.print("너비 입력 : ");
                double width = sc.nextDouble();
                System.out.print("높이 입력 : ");
                double height = sc.nextDouble();
                Rectangle rec = new Rectangle(width, height);
                area = new Rectangle(width, height);

                System.out.println("넓이 : " + rec.area());
                System.out.println("넓이 : " + area.area());
                System.out.println("넓이 : " + area.calArea(rec));
            } else if (choice == 2) {
                System.out.print("밑변 입력 : ");
                double base = sc.nextDouble();
                System.out.print("높이 입력 : ");
                double height = sc.nextDouble();

                Triangle tri = new Triangle(base, height);
                // upcasting
                area = new Triangle(base, height);
                System.out.println("넓이 : " + (tri.getBase() * tri.getHeight() / 2));
                System.out.println("넓이 : " + area.area());
                System.out.println("넓이 : " + area.calArea(tri));

            } else {
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }

        sc.close();

    }
}
