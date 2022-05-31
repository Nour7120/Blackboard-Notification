package users;

import java.sql.Date;

public class Professor extends Person{

	String department;
	Date hirringDate;
	String phDTopic;

	public Professor(String name, String department, Date hirringDate, String phDTopic, String email,
			String phoneNumber) {
		super(name, email, phoneNumber);
		this.department = department;
		this.hirringDate = hirringDate;
		this.phDTopic = phDTopic;
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getHirringDate() {
		return hirringDate;
	}
	public void setHirringDate(Date hirringDate) {
		this.hirringDate = hirringDate;
	}
	public String getphDTopic() {
		return phDTopic;
	}
	public void setphDTopic(String phDTopic) {
		this.phDTopic = phDTopic;
	}
	
	@Override
	public void notify_person(String message) {
		// do some stuff to notify professor
		
	}
	
	
	
}
