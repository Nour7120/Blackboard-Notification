package gateways;

import messages.*;

public class EmailGateway implements Gateway{

	@Override
	public String sendDailyNewsMessage(DailyNewsMessage dailyNewsEmailMessage, String[] placeHolders, String email)
	{
		String preparedmessage = dailyNewsEmailMessage.prepareMessage(placeHolders);
		return preparedmessage;
	}

	@Override
	public String sendGradesAnnouncementMessage(GradesAnnouncementMessage announcementEmailMessage, String[] placeHolders, String email)
	{
		String preparedmessage = announcementEmailMessage.prepareMessage(placeHolders);
		return preparedmessage;
	}

	@Override
	public String sendTaskAddedMessage(TaskAddedMessage addedEmailMessage, String[] placeHolders, String email)
	{
		String preparedmessage = addedEmailMessage.prepareMessage(placeHolders);
		return preparedmessage;
	}
}
