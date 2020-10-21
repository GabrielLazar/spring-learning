package impl;

import services.MentorService;

public class FullTimeMentor implements MentorService {

    @Override
    public void createAccount() {
        System.out.println("Full time mentor is created...");
    }
}
