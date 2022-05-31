package messages;

import java.util.Arrays;

public interface TaskAddedMessage {

    public String prepareMessage(String[] placeHolders);
    public void addTeamDescription();

}
