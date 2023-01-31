package CONTROLLER;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

// 외부 라이브러리 사용
import javazoom.jl.player.MP3Player;
import MODEL.Music;

// model 과 view 사이에서 프로그램 흐름을 관리하는 클래스
//controller
public class MusicPlayer {
    // 재생 / 중지 / 이전 곡 / 다음 곡

    // 노래들을 필드로 저장????
    private ArrayList<Music> musicList = new ArrayList<Music>();
    private int index_1 = 0;
    private MP3Player mp3 = new MP3Player();

    public MusicPlayer() {
        // 기본 생성자를 이용하여 노래 목록 초기화

        Music music = new Music("HypeBoy", "뉴진스", 46, "C:\\Users\\young\\OneDrive\\바탕 화면\\mp3\\뉴진스-HypeBoy.mp3");
        musicList.add(music);
        music = new Music("Antifragile", "르세라핌", 36, "C:\\Users\\young\\OneDrive\\바탕 화면\\mp3\\르세라핌-Antifragile.mp3");
        musicList.add(music);
        music = new Music("LoveDive", "아이브", 41, "C:\\Users\\young\\OneDrive\\바탕 화면\\mp3\\아이브-LoveDive.mp3");
        musicList.add(music);
        music = new Music("사건의지평선", "윤하", 48, "C:\\Users\\young\\OneDrive\\바탕 화면\\mp3\\윤하-사건의지평선.mp3");
        musicList.add(music);
        music = new Music("WhenIMove", "카라", 21, "C:\\Users\\young\\OneDrive\\바탕 화면\\mp3\\카라-WhenIMove.mp3");
        musicList.add(music);

    }

    // 파일을 통해서 정보를 받아오는 생성자(생성자 오버로딩)
    public MusicPlayer(String infoFilePath) {
        // File 객체가 따로 존재
        // 자바에서 경로를 지정 함으로서 접근 가능하게 하는 객체
        File infoFile = new File(infoFilePath);
        // 경로가 잘못된 경우 읽을 수 없는 문제가 발생
        System.out.println("파일 객체 생성" + infoFilePath);

        // 문법적인 오류가 아닌 실행 중 에러가 발생하는 경우 예외를 처리하기 위한 문법 try catch
        try {
            Scanner sc = new Scanner(new InputStreamReader(new FileInputStream(infoFile)));
            // 데이터 읽기
            System.out.println("스캐너 객체 생성 " + sc);
            System.out.println(sc.hasNext());
            // 읽을 데이터가 계속 존재하는지 확인하는 .hasNext()
            while (sc.hasNext()) {
                System.out.println("파일 입력이 존재합니다.");
                String infoSong = sc.nextLine(); // 하나의 줄에 들어있는 정보를 전부 읽는 nextLIne()
                // spilt 문법 .split("") -> "" 안에 문자를 기준으로 문자열을 쪼갠다.
                String[] arr = infoSong.split(",");
                // 문자열을 숫자로 바꾸는 문법 Integer.parseInt
                Music m = new Music(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3]);
                musicList.add(m);
            }
        } catch (FileNotFoundException e) {
            System.out.println("잘못된 파일 경로입니다.");
            e.printStackTrace();
        }
    }

    public Music play() {
        Music m = musicList.get(index_1);
        playButton(m);
        return m;
    }

    public void stop() {
        if (mp3.isPlaying()) {
            mp3.stop();
        }
    }

    public Music previous() {
        if (index_1 != 0) {
            index_1--;
        } else {
            index_1 = musicList.size() - 1;
        }
        Music m = musicList.get(index_1);
        playButton(m);
        return m;
    }

    public Music next() {
        if (index_1 != musicList.size() - 1) {
            index_1++;
        } else {
            index_1 = 0;
        }
        Music m = musicList.get(index_1);
        playButton(m);
        return m;
    }

    private void playButton(Music m) {
        if (mp3.isPlaying()) {
            mp3.stop();
        }
        mp3.play(m.getFilePath());
    }
}
