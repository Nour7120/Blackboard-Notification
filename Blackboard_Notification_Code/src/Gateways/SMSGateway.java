package gateways;

import messages.*;

public class SMSGateway implements Gateway{

	@Override
	public void sendDailyNewsMessage(DailyNewsMessage dailyNewsMobileMessage, String[] placeHolders)
	{
		dailyNewsMobileMessage.prepareMessage(placeHolders);
	}

	@Override
	public void sendGradesAnnouncementMessage(GradesAnnouncementMessage announcementMobileMessage, String[] placeHolders)
	{
		announcementMobileMessage.prepareMessage(placeHolders);
	}

	@Override
	public void sendTaskAddedMessage(TaskAddedMessage addedMobileMessage, String[] placeHolders, String email)
	{
		addedMobileMessage.prepareMessage(placeHolders);
	}
}
