package lv.oskor.thread;

import java.util.concurrent.Semaphore;

/**
 * Created by Oleg Skorobogatov on 29.03.2016.
 */
public class PrintQueue {

    private final Semaphore semaphore;

    public PrintQueue() {
        this.semaphore = new Semaphore(1);
    }

    public void printJob (Object document){
        try {
            semaphore.acquire();
            long duration=(long)(Math.random()*10);
            System.out.printf("%s: PrintQueue: Printing a Job during %d       seconds\n",Thread.currentThread().getName(),duration);
                    Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
