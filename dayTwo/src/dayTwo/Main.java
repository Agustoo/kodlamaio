package dayTwo;

public class Main {

	public static void main(String[] args) {
		
		Course csharp = new Course(
				1,
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp�",
				"2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.",
				"Engin Demirog",
				0
				);
		
		Course java = new Course(
				2,
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA & REACT)",
				"2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.",
				"Engin Demiro�",
				0
				);
		
		Course basic = new Course(
				3,
				"Programlamaya Giri� ��in Temel Kurs",
				"PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.",
				"Engin Demiro�",
				0
				);
				
		Course[] courses = {
				csharp,
				java,
				basic
		};
		
		for(Course course : courses) {
			System.out.println(course.name+"\n"+course.desc+"\n");
		}
	}
}
