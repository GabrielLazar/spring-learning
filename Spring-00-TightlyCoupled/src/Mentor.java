public class Mentor {

    FullTimeMentor fullTimeMentor;
    PartTimeMentor partTimeMentor;

    public Mentor(FullTimeMentor fullTimeMentor, PartTimeMentor partTimeMentor){
         this.partTimeMentor = partTimeMentor;
         this.fullTimeMentor = fullTimeMentor;
    }

    public void manageAccounts(){
        fullTimeMentor.createAccount();
        partTimeMentor.createAccount();
    }
}
