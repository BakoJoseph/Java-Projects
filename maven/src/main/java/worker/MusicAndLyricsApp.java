package worker;

import javazoom.jl.player.Player;
import java.io.FileInputStream;

public class MusicAndLyricsApp {
    public static void main(String[] args) {
        String musicFilePath = "C:\\Users\\USER\\Documents\\io\\home.mp3"; // Replace with your MP3 file path

        Thread musicThread = new Thread(() -> {
            try {
                FileInputStream fileInputStream = new FileInputStream(musicFilePath);
                Player player = new Player(fileInputStream);
                System.out.println("🎵 Playing music...");
                player.play();
                player.close();
            } catch (Exception e) {
                System.out.println("Error playing music: " + e.getMessage());
            }
        });

        Thread lyricsThread = new Thread(() -> {
            String[] lyrics = {
                    "🎶 [0s] First line of lyrics...",
                    "🎶 [3s] Second line of lyrics...",
                    "🎶 [6s] Third line of lyrics...",
                    "🎶 [9s] Fourth line of lyrics...",
                    "🎶 [12s] Fifth line of lyrics..."
            };
            int[] timings = {0, 3000, 6000, 9000, 12000}; // Time in milliseconds

            try {
                for (int i = 0; i < lyrics.length; i++) {
                    Thread.sleep(timings[i]); // Sync lyrics with song
                    System.out.println(lyrics[i]);
                }
            } catch (InterruptedException e) {
                System.out.println("Lyrics thread interrupted");
            }
        });

        musicThread.start();
        lyricsThread.start();
    }
}
