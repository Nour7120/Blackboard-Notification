package courses;

import java.util.ArrayList;

import gateways.EmailGateway;

import messages.Message;

import messages.TaskAddedEmailMessage;
import users.Professor;
import users.Student;
import users.TA;

public class Course {
	
	String name;
	String code;
	ArrayList<String> announcements;
	ArrayList<String> exams;
	ArrayList<String> grades;
	
	ArrayList<Professor> professorsForEmailNotification;
	ArrayList<Professor> professorsForSMSNotification;
	
	ArrayList<TA> tAsForEmailNotification;
	ArrayList<TA> tAsForSMSNotification;
	
	ArrayList<Student> studentsForEmailNotification;
	ArrayList<Student> studentsForSMSNotification;
	
	public Course(String name, String code) {
		super();
		this.name = name;
		this.code = code;
		
		announcements = new ArrayList<>();
		exams = new ArrayList<>();
		grades = new ArrayList<>();
		
		professorsForEmailNotification = new ArrayList<>();
		professorsForSMSNotification = new ArrayList<>();
		
		tAsForEmailNotification = new ArrayList<>();
		tAsForSMSNotification = new ArrayList<>();
		
		studentsForEmailNotification = new ArrayList<>();
		studentsForSMSNotification = new ArrayList<>();
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
		professorsForEmailNotification.add(professor);
	}
	
	public void subscribeProfessorForSMSNotification(Professor professor) {
		professorsForSMSNotification.add(professor);
	}
	
	public void subscribeTAForEmailNotification(TA ta) {
		tAsForEmailNotification.add(ta);
	}
	
	public void subscribeTAForSMSNotification(TA ta) {
		tAsForSMSNotification.add(ta);
	}
	
	public void subscribeStudentForEmailNotification(Student student) {
		studentsForEmailNotification.add(student);
	}
	
	public void subscribeStudentForSMSNotification(Student student) {
		studentsForSMSNotification.add(student);
	}
	
	
	
	public void addAssignment(String assignName, String assignBody) {
		announcements.add(assignName);
		String[] placeholders = new String[] {assignName, assignBody};
		// do some logic here 
		
		notifyAllUsers(placeholders);
	}
	
	// AddExam, PostGrades, PostAnnouncement  will be the same 

	private void notifyAllUsers(String[] placeholders) {
		// notify users by email
		TaskAddedEmailMessage msg = new TaskAddedEmailMessage();
		String notification = msg.prepareMessage(placeholders);
		
		// open connection for Email gateway and do some configurations to the object
		
		EmailGateway emailGateway = new EmailGateway();

		Message msgs = new Message();

		msgs.setTaskAddedMessage(msg);

		msgs.setGateway(emailGateway);

		for (Professor professor : professorsForEmailNotification) {
			professor.notify_person(notification);
			emailGateway.sendTaskAddedMessage(msg, placeholders,professor.getEmail());
		}
		
		for (TA ta : tAsForEmailNotification) {
			ta.notify_person(notification);
			emailGateway.sendTaskAddedMessage(msg, placeholders,ta.getEmail());
		}
		
		for (Student student : studentsForEmailNotification) {
			student.notify_person(notification);
			emailGateway.sendTaskAddedMessage(msg, placeholders,student.getEmail());
		}
	}
	
	
	
	
}
