package adapter;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(AudioType audioType, String fileName) {
        if (audioType.equals(AudioType.MP3)) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equals(AudioType.MP4) || audioType.equals(AudioType.VLC)) {
            MediaAdapter adapter = new MediaAdapter();
            adapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid audio type. audio type " + audioType + " not supported.");
        }
    }
}
