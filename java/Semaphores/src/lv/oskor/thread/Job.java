package lv.oskor.thread;

/**
 * Created by Oleg Skorobogatov on 29.03.2016.
 */
public class Job implements Runnable {
    private PrintQueue printQueue;

    public Job(PrintQueue printQueue){
        this.printQueue=printQueue;
    }

    @Override
    public void run() {

    }
}
