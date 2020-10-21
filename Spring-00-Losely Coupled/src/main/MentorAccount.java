package main;

import services.MentorService;

public class MentorAccount {

    MentorService mentorService;

    public MentorAccount(MentorService mentorService) {
        this.mentorService = mentorService;
    }

    public void manageAccount(){
         this.mentorService.createAccount();
    }
}
