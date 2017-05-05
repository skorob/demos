import lv.oskor.lambdas.FunctionalInterface;

/**
 * Created by Oleg Skorobogatov on 04.05.2017.
 */
public class Main {

    public static void main(String [] v) {
        Runnable r = ()->{System.out.println("dddddddddddddd");};
        new Thread(r).start();


        FunctionalInterface functionalInterface = (p1, p2)-> {System.out.println(p1+" dddddddddddddd s"+p2);};
        functionalInterface.sayHello("Oleg","hello");
    }
}
