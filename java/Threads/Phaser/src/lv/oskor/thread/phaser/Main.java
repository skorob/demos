package lv.oskor.thread.phaser;

import java.util.concurrent.Phaser;

/**
 * Created by Oleg Skorobogatov on 22.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        Phaser phaser=new Phaser(3);

        FileSearch system=new FileSearch("C:\\Windows", "log",
            phaser);
        FileSearch apps=
            new FileSearch("C:\\Program Files","log",phaser);
        FileSearch documents=
            new FileSearch("C:\\oem","log",phaser);

        Thread systemThread=new Thread(system,"System");
        systemThread.start();

        Thread appsThread=new Thread(apps,"Apps");
        appsThread.start();

        Thread documentsThread=new Thread(documents, "Documents");
        documentsThread.start();

        try {
            systemThread.join();
            appsThread.join();
            documentsThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Terminated: "+ phaser.isTerminated());
    }
}
