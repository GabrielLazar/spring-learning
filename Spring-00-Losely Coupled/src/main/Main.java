package main;

import impl.FullTimeMentor;

public class Main {

    public static void main(String[] args) {

        //PartTimeMentor partTime = new PartTimeMentor();
        FullTimeMentor fullTimeMentor = new FullTimeMentor();

        MentorAccount mentorAccount = new MentorAccount(fullTimeMentor);

        mentorAccount.manageAccount();
    }
}
