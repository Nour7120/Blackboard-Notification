package gateways;

import messages.*;

public class SMSGateway implements Gateway{

	@Override
	public String sendDailyNewsMessage(DailyNewsMessage dailyNewsMobileMessage, String[] placeHolders, String email)
	{
		String preparedmessage = dailyNewsMobileMessage.prepareMessage(placeHolders);
		return preparedmessage;
	}

	@Override
	public String sendGradesAnnouncementMessage(GradesAnnouncementMessage announcementMobileMessage, String[] placeHolders, String email)
	{
		String preparedmessage = announcementMobileMessage.prepareMessage(placeHolders);
		return preparedmessage;
	}

	@Override
	public String sendTaskAddedMessage(TaskAddedMessage addedMobileMessage, String[] placeHolders, String email)
	{
		String preparedmessage = addedMobileMessage.prepareMessage(placeHolders);
		return preparedmessage;
	}
}
