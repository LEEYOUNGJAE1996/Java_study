package VIEW;

import java.util.Scanner;

//view
//사용자와 상호작용하여 입력과 결과를 다루는 역할
public class Main {
    public static void main(String args[]) {
        // 프로그램 구동 및 상호소통(with 사용자)
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Music Player=====");

        while (true) {
            System.out.println("[1] play [2] pause [3]previous [4]next [5]exit ");
            int choice = sc.nextInt();
            if (choice == 1) {

            } else if (choice == 2) {

            } else if (choice == 3) {

            } else if (choice == 4) {

            } else if (choice == 5) {
                System.exit(0);
            } else {
                System.out.println("잘못된 접근입니다.");
            }
        }
    }
}
