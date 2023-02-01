package java0201_ex01.View;

import java.util.Scanner;

import java0201_ex01.Controller.Calculation;
import java0201_ex01.Model.PartTimeEmployee;
import java0201_ex01.Model.RegularEmployee;
import java0201_ex01.Model.TempEmployee;

public class Main {
    // 월급계산 프로그램

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Calculation cal = new Calculation();
        System.out.println("월급 계산 프로그램");
        while (true) {
            System.out.println("1.temp 2. regular 3. part-time 4. exti");
            System.out.print("직급 선택 >> ");

            int choice = sc.nextInt();
            if (choice == 1) {
                // TempEmployee temp = new TempEmployee("SMHRD001", "박문수", 3000);
                System.out.print("사번 입력 >> ");
                String empId = sc.next();
                System.out.print("이름 입력 >> ");
                String name = sc.next();
                System.out.print("연봉 입력 >> ");
                int pay = sc.nextInt();
                TempEmployee temp = new TempEmployee(empId, name, pay);
                System.out.println("급여 출력");
                System.out.println("사번 : " + temp.getEmpId()
                        + "\n이름 : " + temp.getName()
                        // upcasting
                        + "\n월급 : " + cal.calPayment(temp));

            } else if (choice == 2) {
                // RegularEmployee regul = new RegularEmployee("SMHRD002", "홍길동", 4000, 400);
                System.out.print("사번 입력 >> ");
                String empId = sc.next();
                System.out.print("이름 입력 >> ");
                String name = sc.next();
                System.out.print("연봉 입력 >> ");
                int pay = sc.nextInt();
                System.out.print("보너스 입력 >> ");
                int bonus = sc.nextInt();
                RegularEmployee regul = new RegularEmployee(empId, name, pay, bonus);
                System.out.println("급여 출력");
                System.out.println("사번 : " + regul.getEmpId()
                        + "\n이름 : " + regul.getName()
                        // upcasting
                        + "\n월급 : " + cal.calPayment(regul));

            } else if (choice == 3) {
                // PartTimeEmployee part = new PartTimeEmployee("SMHRD003", "김장독", 10, 10);
                System.out.print("사번 입력 >> ");
                String empId = sc.next();
                System.out.print("이름 입력 >> ");
                String name = sc.next();
                System.out.print("일급 입력 >> ");
                int pay = sc.nextInt();
                System.out.print("일한 일 입력 >> ");
                int workDay = sc.nextInt();
                PartTimeEmployee part = new PartTimeEmployee(empId, name, pay, workDay);
                System.out.println("급여 출력");
                System.out.println("사번 : " + part.getEmpId()
                        + "\n이름 : " + part.getName()
                        // upcasting
                        + "\n월급 : " + cal.calPayment(part));

            } else if (choice == 4) {
                sc.close();
                System.exit(0);
            } else {
                System.out.println("잘못된 접근입니다.");
            }
        }

    }
}
