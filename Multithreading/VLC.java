package Multithreading;

class Play extends Thread {
    public void run() {
        System.out.println("Playing video...");
    }
}

class PlayMusic extends Thread {
    public void run() {
        System.out.println("Playing music...");
    }
}

class ProgressBar extends Thread {
    public void run() {
        System.out.println("Progress bar is executing...");
    }
}

class Timer extends Thread {
    public void run() {
        System.out.println("Timer is executing...");
    }
}

public class VLC {
    public static void main(String[] args) {
        Play playing = new Play();
        playing.start();

        PlayMusic music = new PlayMusic();
        music.start();

        ProgressBar progressBar = new ProgressBar();
        progressBar.start();

        Timer timer = new Timer();
        timer.start();
    }
}
