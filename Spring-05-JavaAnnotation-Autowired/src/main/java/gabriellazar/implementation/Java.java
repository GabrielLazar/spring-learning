package gabriellazar.implementation;


import gabriellazar.services.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    //field injection
    @Autowired
    OfficeHours officeHours;

    /*
    //constructor injection
    @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

     */

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours " + (30 + officeHours.getHours()));
    }


}
