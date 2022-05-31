package messages;

public interface GradesAnnouncementMessage {

    public String prepareMessage(String[] placeHolders);
    public boolean verifyGrades();

}
