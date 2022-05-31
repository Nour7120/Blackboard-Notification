package users;

public class Student extends Person{

	int id;

	public Student(String name, int id, String email, String phoneNumber) {
		super(name, email, phoneNumber);
		this.id = id;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}
	
	@Override
	public void notifyPerson(String message) {
		// do some stuff to notify student
	}
	
}
