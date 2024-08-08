package Chapter11.jukebox;

import java.util.ArrayList;
import java.util.List;

class MockSongs {
    public static List<String> getSomeStrings() {
        List<String> songs = new ArrayList<>();

        songs.add("somersault");
        songs.add("cassidy");
        songs.add("$10");
        songs.add("havana");
        songs.add("Cassidy");
        songs.add("50 Ways");

        return songs;
    }
}

public class Jukebox1 {
    public static void main(String[] args) {
        new Jukebox1().go();
    }

    public void go() {
        List<String> songList = MockSongs.getSomeStrings();
        System.out.println(songList);
    }
}
