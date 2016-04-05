package lv.oskor.examples.threads.consproducer.locks;

import java.util.Random;

/**
 * Created by Oleg Skorobogatov on 23.03.2016.
 */
public class Consumer implements Runnable {
    private Buffer buffer;
    public Consumer (Buffer buffer) {
        this.buffer=buffer;
    }

    @Override
    public void run() {
        while (buffer.hasPendingLines()) {
            String line=buffer.get();
            processLine(line);
        }
    }

    private void processLine(String line) {
        try {
            Random random=new Random();
            Thread.sleep(random.nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
