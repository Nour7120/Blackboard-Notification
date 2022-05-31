package messages;


import java.util.Arrays;


public class GradesAnnouncementMobileMessage implements GradesAnnouncementMessage{

	@Override

	public String prepareMessage(String[] placeHolders) {
		// code to replace place holders of this type
		return Arrays.toString(placeHolders);
	}

	@Override

	public boolean verifyGrades() {
		// code to verify Grades before announcement
		
		return true;
	}
}
