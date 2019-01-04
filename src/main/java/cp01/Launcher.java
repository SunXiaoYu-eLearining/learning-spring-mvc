package cp01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {
    public static void main(String[] args){

        // Original way to crate an object
        Student stu1 = new Student();
        System.out.println("stu1: " + stu1);

        // use Spring MVC to get been by class
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("cp01.xml");
        //Student stu2 = applicationContext.getBean(Student.class);
        //System.out.println("stu2: " + stu2);

        // use Spring MVC to get been by id
        Student stu3 = (Student) applicationContext.getBean("stu");
        System.out.println("stu3: " + stu3);

        // get been with ref
        Student stu4 = (Student) applicationContext.getBean("stux");
        System.out.println("stu4: " + stu4);

    }
}
