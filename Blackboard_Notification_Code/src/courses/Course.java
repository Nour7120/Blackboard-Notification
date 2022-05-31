package courses;

import java.util.ArrayList;

import gateways.EmailGateway;

import messages.DailyNewsEmailMessage;
import messages.GradesAnnouncementEmailMessage;
import messages.Message;
import messages.TaskAddedEmailMessage;
import users.Person;

import users.Professor;
import users.Student;
import users.TA;

public class Course {
	
	String name;
	String code;
	ArrayList<String> announcements;
	ArrayList<String> exams;
	ArrayList<String> grades;
	

	ArrayList<Person> personForEmailNotification;
	ArrayList<Person> personForSMSNotification;

	
	public Course(String name, String code) {
		super();
		this.name = name;
		this.code = code;
		
		announcements = new ArrayList<>();
		exams = new ArrayList<>();
		grades = new ArrayList<>();


		personForEmailNotification = new ArrayList<>();
		personForSMSNotification = new ArrayList<>();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public void subscribeProfessorForEmailNotification(Professor professor) {

		personForEmailNotification.add(professor);
	}
	
	public void subscribeProfessorForSMSNotification(Professor professor) {
		personForSMSNotification.add(professor);
	}
	
	public void subscribeTAForEmailNotification(TA ta) {
		personForEmailNotification.add(ta);
	}
	
	public void subscribeTAForSMSNotification(TA ta) {
		personForSMSNotification.add(ta);
	}
	
	public void subscribeStudentForEmailNotification(Student student) {
		personForEmailNotification.add(student);
	}
	
	public void subscribeStudentForSMSNotification(Student student) {
		personForSMSNotification.add(student);

	}
	
	
	
	public void addAssignment(String assignName, String assignBody) {
		announcements.add(assignName);
		String[] placeholders = new String[] {assignName, assignBody};
		// do some logic here 


		notifyAllUsersForTasks(placeholders);
	}

	// AddExam, PostGrades, PostAnnouncement  will be the same 

	private void notifyAllUsersForTasks(String[] placeholders) {
		// notify users by email
		TaskAddedEmailMessage msg = new TaskAddedEmailMessage();
		
		// open connection for Email gateway and do some configurations to the object
		
		EmailGateway emailGateway = new EmailGateway();

		Message msgs = new Message();

		msgs.setTaskAddedMessage(msg);

		msgs.setGateway(emailGateway);


		for (Person person : personForEmailNotification) {
			person.notifyPerson(msgs.taskAddedMessage(placeholders, person.getEmail()));
		}

	}

	private void notifyAllUsersForDailyNews(String[] placeholders) {
		// notify users by email
		DailyNewsEmailMessage msg = new DailyNewsEmailMessage();

		// open connection for Email gateway and do some configurations to the object

		EmailGateway emailGateway = new EmailGateway();

		Message msgs = new Message();

		msgs.setDailyNewsMessage(msg);

		msgs.setGateway(emailGateway);

		for (Person person : personForEmailNotification) {
			person.notifyPerson(msgs.dailyNewsMessage(placeholders, person.getEmail()));
		}

	}

	private void notifyAllUsersForGrades(String[] placeholders) {
		// notify users by email
		GradesAnnouncementEmailMessage msg = new GradesAnnouncementEmailMessage();

		// open connection for Email gateway and do some configurations to the object

		EmailGateway emailGateway = new EmailGateway();

		Message msgs = new Message();

		msgs.setGradesAnnouncementMessage(msg);

		msgs.setGateway(emailGateway);

		for (Person person : personForEmailNotification) {
			person.notifyPerson(msgs.gradesAnnouncementMessage(placeholders, person.getEmail()));
		}

	}

}
