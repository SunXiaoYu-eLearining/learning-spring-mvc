package cp02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Launcher {
    public static void main(String[] args){
        ApplicationContext applitionContext = new ClassPathXmlApplicationContext("cp02.xml");
        User user1 = (User) applitionContext.getBean("user_singleton");
        User user2 = (User) applitionContext.getBean("user_singleton");
        System.out.print("user1 == user2 : ");
        System.out.println(user1 == user2);

        User user3 = (User) applitionContext.getBean("user_prototype");
        User user4 = (User) applitionContext.getBean("user_prototype");
        System.out.print("user3 == user4 : ");
        System.out.println(user3 == user4);

        User user5 = (User) applitionContext.getBean("radon");
        User user6 = (User) applitionContext.getBean("allen");
        System.out.println("user5 = " + user5);
        System.out.println(user6);

        // depends-on
        User user7 = (User) applitionContext.getBean("people");

        // get c3p0 data source via Spring
        DataSource ds = (DataSource) applitionContext.getBean("dataSource");
        Connection conn = null;
        try{
            conn = ds.getConnection();
        }catch(SQLException e){
            e.printStackTrace();
        }
        System.out.println(conn);

        User p_scope = (User) applitionContext.getBean("user_p_scope");
        System.out.println(p_scope);
    }
}
