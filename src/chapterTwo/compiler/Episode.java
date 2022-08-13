package chapterTwo.compiler;

public class Episode {
    int seriesNumber;
    int episodeNumber;

    void play()
    {
        System.out.println("Playing the episode "+episodeNumber);
    }
    void skipIntro() {
        System.out.println("Skipping intro...");
    }
    void skipToNext() {
        System.out.println("Loading next episode...");
    }
}
