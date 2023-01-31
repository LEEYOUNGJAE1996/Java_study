package CONTROLLER;

import java.util.ArrayList;
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
