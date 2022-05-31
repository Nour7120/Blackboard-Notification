package messages;


public interface TaskAddedMessage {

    String prepareMessage(String[] placeHolders);
    void addTeamDescription();

}
