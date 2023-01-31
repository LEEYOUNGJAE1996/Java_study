package MODEL;

//model 
//데이터를 관리하는 클래스
public class Music {
    // 음악정보
    private String title;
    private String singer;
    private int playTime;

    public Music(String title, String singer, int playTime) {
        this.title = title;
        this.singer = singer;
        this.playTime = playTime;
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
}