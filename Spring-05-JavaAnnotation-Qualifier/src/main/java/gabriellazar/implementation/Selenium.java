package gabriellazar.implementation;

import gabriellazar.services.Course;
import gabriellazar.services.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {


    ExtraSessions extraSessions;


    //constructor dependency injection
    public Selenium( @Qualifier("homeHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: 20");
    }


}
