package messages;

import java.util.Arrays;

public class TaskAddedMobileMessage implements TaskAddedMessage{

	@Override
	public String prepareMessage(String[] placeHolders) {
		// code to replace place holders of this type
		return Arrays.toString(placeHolders);
	}

	@Override
	public void addTeamDescription() {
		// Add Team Description
	}
}
