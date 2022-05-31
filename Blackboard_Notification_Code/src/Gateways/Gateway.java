package gateways;

import messages.*;

public interface Gateway {

    String sendDailyNewsMessage(DailyNewsMessage dailyNewsMessage, String[] placeHolders, String email);

    String sendGradesAnnouncementMessage(GradesAnnouncementMessage announcementMessage, String[] placeHolders, String email);

    String sendTaskAddedMessage(TaskAddedMessage addedMessage, String[] placeHolders, String email);


}
