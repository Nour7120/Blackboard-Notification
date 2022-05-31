package messages;

import java.util.Arrays;

public class GradesAnnouncementMobileMessage {

	public String prepareMessage(String[] placeHolders) {
		// code to replace place holders of this type
		return Arrays.toString(placeHolders);
	}


	public boolean verifyGrades() {
		// code to verify Grades before announcement
		
		return true;
	}
}
