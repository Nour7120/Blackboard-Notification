package messages;

import java.util.Arrays;

public class DailyNewsMobileMessage implements DailyNewsMessage{

	@Override
	public String prepareMessage(String[] placeHolders) {
		// code to replace place holders of this type
		return Arrays.toString(placeHolders);
	}

}
