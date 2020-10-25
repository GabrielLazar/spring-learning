package gabriellazar.implementation;


import gabriellazar.services.Course;
import gabriellazar.services.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    //field injection
    @Autowired
    @Qualifier("officeHours")
    ExtraSessions extraSessions;

    /*
    //constructor injection
    @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

     */

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours " + (30 + extraSessions.getHours()));
    }


}
