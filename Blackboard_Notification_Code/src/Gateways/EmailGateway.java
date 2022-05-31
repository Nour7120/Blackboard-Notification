package gateways;

import messages.*;

public class EmailGateway implements Gateway{

	@Override
	public void sendDailyNewsMessage(DailyNewsMessage dailyNewsEmailMessage, String[] placeHolders)
	{
		dailyNewsEmailMessage.prepareMessage(placeHolders);
	}

	@Override
	public void sendGradesAnnouncementMessage(GradesAnnouncementMessage announcementEmailMessage, String[] placeHolders)
	{
		announcementEmailMessage.prepareMessage(placeHolders);
	}

	@Override
	public void sendTaskAddedMessage(TaskAddedMessage addedEmailMessage, String[] placeHolders, String email)
	{
		addedEmailMessage.prepareMessage(placeHolders);
	}
}
