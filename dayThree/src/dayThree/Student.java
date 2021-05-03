package dayThree;

public class Student extends User{
	private String[] certificates;
	
	public Student() {
		
	}

	public Student(int id, String firstName, String lastName, String email, String[] courses, String[] certificates) {
		super(id,firstName,lastName,email,courses);
		this.certificates = certificates;
	}

	public String[] getCertificates() {
		return certificates;
	}

	public void setCertificates(String[] certificates) {
		this.certificates = certificates;
	}

}
