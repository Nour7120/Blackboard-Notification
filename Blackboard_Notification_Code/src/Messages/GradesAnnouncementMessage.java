package messages;

public interface GradesAnnouncementMessage {

    String prepareMessage(String[] placeHolders);
    boolean verifyGrades();

}
