package lv.oskor.thread.countdown;

import java.util.concurrent.TimeUnit;

/**
 * Created by Oleg Skorobogatov on 31.03.2016.
 */
public class Participant implements Runnable {
    private Videoconference conference;
    private String name;
    public Participant(Videoconference conference, String name) {
        this.conference=conference;
        this.name=name;
    }
    @Override
    public void run() {
        long duration=(long)(Math.random()*10);
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        conference.arrive(name);

    }
}
