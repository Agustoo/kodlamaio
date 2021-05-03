package dayThree;

public class StudentManager extends UserManager {
	
	@Override
	public void addToCourse(User user) {
		System.out.println(user.getFirstName()+" Öğrenci olarak kursa eklendi.");
	}
	
	public void addCertificate(Student student) {
		System.out.println("Sertifika eklendi: "+student.getFirstName());
	}


}
