package impl;

import services.Mentor;

public class PartTimeMentor implements Mentor {

    @Override
    public void createAccount() {
        System.out.println("PartTime mentor is created");
    }
}
