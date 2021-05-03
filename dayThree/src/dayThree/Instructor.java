package dayThree;

public class Instructor extends User{
	private String biography;
	
	public Instructor() {
		
	}

	public Instructor(int id, String firstName, String lastName, String email, String[] courses, String biography) {
		super(id,firstName,lastName,email,courses);
		this.biography = biography;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}
	

}
