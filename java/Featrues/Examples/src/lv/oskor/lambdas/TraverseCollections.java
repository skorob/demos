package lv.oskor.lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg Skorobogatov on 08.05.2017.
 */
public class TraverseCollections {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("fff");
        list.add("sdfsdfsd");
        list.add("dfsadf");

        list.forEach(str-> System.out.println(str));
    }

}
