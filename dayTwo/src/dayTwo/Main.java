package dayTwo;

public class Main {

	public static void main(String[] args) {
		
		Course csharp = new Course(
				1,
				"Yazýlým Geliþtirici Yetiþtirme Kampý",
				"2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.",
				"Engin Demirog",
				0
				);
		
		Course java = new Course(
				2,
				"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA & REACT)",
				"2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.",
				"Engin Demiroð",
				0
				);
		
		Course basic = new Course(
				3,
				"Programlamaya Giriþ Ýçin Temel Kurs",
				"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.",
				"Engin Demiroð",
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
