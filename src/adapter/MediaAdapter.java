package adapter;

public class MediaAdapter implements MediaPlayer{

    @Override
    public void play(AudioType audioType, String fileName) {
        AdvancedMediaPlayer advancedMediaPlayer;
        if (audioType.equals(AudioType.VLC)) {
            advancedMediaPlayer = new VlcPlayer();
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equals(AudioType.MP4)) {
            advancedMediaPlayer = new Mp4Player();
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
