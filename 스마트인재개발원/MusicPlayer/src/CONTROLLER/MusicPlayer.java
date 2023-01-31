package CONTROLLER;

import java.util.ArrayList;

import MODEL.Music;

// model 과 view 사이에서 프로그램 흐름을 관리하는 클래스
//controller
public class MusicPlayer {
    // 재생 / 중지 / 이전 곡 / 다음 곡

    // 노래들을 필드로 저장????
    private ArrayList<Music> musiclist = new ArrayList<Music>();

    public MusicPlayer() {
        // 기본 생성자를 이용하여 노래 목록 초기화
        Music music = new Music("HypeBoy", "뉴진스", 120);
        musiclist.add(music);
    }

    public MusicPlayer(Music music) {
        // 기본 생성자를 이용하여 노래 목록 초기화
        musiclist.add(music);
    }
}
