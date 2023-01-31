package CONTROLLER;

import java.util.ArrayList;

import MODEL.Music;

// model 과 view 사이에서 프로그램 흐름을 관리하는 클래스
//controller
public class MusicPlayer {
    // 재생 / 중지 / 이전 곡 / 다음 곡

    // 노래들을 필드로 저장????
    private ArrayList<Music> musicList = new ArrayList<Music>();
    private int index_1 = 0;

    public MusicPlayer() {
        // 기본 생성자를 이용하여 노래 목록 초기화

        Music music = new Music("HypeBoy", "뉴진스", 46);
        musicList.add(music);
        music = new Music("Antifragile", "르세라핌", 36);
        musicList.add(music);
        music = new Music("LoveDive", "아이브", 41);
        musicList.add(music);
        music = new Music("사건의지평선", "윤하", 48);
        musicList.add(music);
        music = new Music("WhenIMove", "카라", 21);
        musicList.add(music);

    }

    public Music play() {
        Music m = musicList.get(index_1);
        return m;
    }

    public void stop() {

    }

    public Music previous() {
        if (index_1 != 0) {
            index_1--;
        } else {
            index_1 = musicList.size() - 1;
        }
        Music m = musicList.get(index_1);
        return m;
    }

    public Music next() {
        if (index_1 != musicList.size() - 1) {
            index_1++;
        } else {
            index_1 = 0;
        }
        Music m = musicList.get(index_1);
        return m;
    }
}
