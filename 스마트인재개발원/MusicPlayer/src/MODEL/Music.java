package MODEL;

//model 
//데이터를 관리하는 클래스
public class Music {
    // 음악정보
    private String title;
    private String singer;
    private int playTime;
    private String filePath; // mp3파일 경로

    public Music(String title, String singer, int playTime, String filePath) {
        this.title = title;
        this.singer = singer;
        this.playTime = playTime;
        this.filePath = filePath;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }

    public int getPlayTime() {
        return playTime;
    }

    public String getFilePath() {
        return filePath;
    }
}