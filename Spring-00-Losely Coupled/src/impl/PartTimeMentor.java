package impl;

import services.MentorService;

public class PartTimeMentor implements MentorService {

    @Override
    public void createAccount() {
        System.out.println("Part time mentor created");
    }
}
