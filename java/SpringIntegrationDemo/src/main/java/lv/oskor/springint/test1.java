package lv.oskor.springint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Oleg Skorobogatov on 05.04.2016.
 */
public class Test1 {


        public static void main(String... args) throws Exception {
            ApplicationContext ctx =
                new ClassPathXmlApplicationContext("context.xml");
            // Simple Service
            TempConverter converter =
                ctx.getBean("simpleGateway", TempConverter.class);
            System.out.println(converter.fahrenheitToCelcius(68.0f));
            // Web Service
            converter  = ctx.getBean("wsGateway", TempConverter.class);
            System.out.println(converter.fahrenheitToCelcius(68.0f));
        }
}
