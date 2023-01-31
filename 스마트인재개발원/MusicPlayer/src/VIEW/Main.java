package VIEW;

import java.util.Scanner;

import CONTROLLER.MusicPlayer;
import MODEL.Music;

//view
//사용자와 상호작용하여 입력과 결과를 다루는 역할
public class Main {
    public static void main(String args[]) {
        // 프로그램 구동 및 상호소통(with 사용자)
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Music Player=====");
        MusicPlayer mp = new MusicPlayer("C:\\Users\\young\\OneDrive\\바탕 화면\\MusicInfo.txt");
        while (true) {
            System.out.println("[1] Play [2] Pause [3]Previous [4]Next [5]Exit ");
            int choice = sc.nextInt();
            if (choice == 1) {
                // play
                Music m = mp.play();
                System.out.println("현재 재생되는 곡 : " + m.getTitle());
                System.out.println("가수 : " + m.getSinger());
                System.out.println("play time : " + m.getPlayTime());
            } else if (choice == 2) {
                mp.stop();
                System.out.println("STOP \tSTOP \tSTOP \tSTOP \tSTOP \tSTOP \tSTOP \tSTOP \t");
            } else if (choice == 3) {
                Music m = mp.previous();
                System.out.println("현재 재생되는 곡 : " + m.getTitle());
                System.out.println("가수 : " + m.getSinger());
                System.out.println("play time : " + m.getPlayTime());
            } else if (choice == 4) {
                Music m = mp.next();
                System.out.println("현재 재생되는 곡 : " + m.getTitle());
                System.out.println("가수 : " + m.getSinger());
                System.out.println("play time : " + m.getPlayTime());

            } else if (choice == 5) {
                System.exit(0);
            } else {
                System.out.println("잘못된 접근입니다.");
            }
        }
    }
}
