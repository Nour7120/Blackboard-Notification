package gateways;

import messages.*;

public interface Gateway {
    public void sendDailyNewsMessage(DailyNewsMessage dailyNewsMessage, String[] placeHolders);

    public void sendGradesAnnouncementMessage(GradesAnnouncementMessage announcementMessage, String[] placeHolders);

    public void sendTaskAddedMessage(TaskAddedMessage addedMessage, String[] placeHolders, String email);

}
