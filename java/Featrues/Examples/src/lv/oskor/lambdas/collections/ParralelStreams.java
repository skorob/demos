package lv.oskor.lambdas.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg Skorobogatov on 08.05.2017.
 */
public class ParralelStreams {
    public static void main(String[] args) {


        List<String> strings = new ArrayList<>();
        for(int i = 0; i<10000;i++) {
            strings.add("Item"+i);
        }



        strings.stream().forEach(p-> System.out.println(p));


        strings.stream().parallel() .forEach(p-> System.out.println(p));

    }
}
