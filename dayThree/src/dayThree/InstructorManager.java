package dayThree;

public class InstructorManager extends UserManager {
	
	@Override
	public void addToCourse(User user) {
		System.out.println(user.getFirstName()+" Eðitmen olarak kursa eklendi.");
	}

	public void addBiography(Instructor instructor) {
		System.out.println("Biyografi eklendi: "+instructor.getFirstName());
	}
}
