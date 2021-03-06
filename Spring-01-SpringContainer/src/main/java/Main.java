import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.Mentor;

public class Main {

    public static void main(String[] args) {

      //  BeanFactory container = new ClassPathXmlApplicationContext("config.xml");

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");


        //getting the bean from the container
        Mentor mentor = (Mentor) container.getBean("fullTimeMentor");

        mentor.createAccount();

        Mentor mentor1 =  container.getBean("partTimeMentor",Mentor.class);

        mentor1.createAccount();
    }
}
