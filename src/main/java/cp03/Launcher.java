package cp03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("cp03.xml");
        Car car1 = (Car) applicationContext.getBean("car1");
        Car car2 = (Car) applicationContext.getBean("car2");
        System.out.println(car1);
        System.out.println(car2);

        Person p = (Person) applicationContext.getBean("person");
        System.out.println(p);
    }
}
