package chapter_02.xmlconfig.soundsystem;
import java.util.List;
import java.util.Set;

public class BlankDisc implements CompactDisc{

    private String title;
    private String artist;
    private Set<String> tracks;

    public BlankDisc(String title, String artist, Set<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for(String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }
}
