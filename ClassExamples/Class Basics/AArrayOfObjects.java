public class AArrayOfObjects {
	public static void main(String[] args) {
		// Create array
		student1 s1[] = new student1[4];

		// Allocate memory to each array
		for (int i = 0; i < 4; i++) {
			s1[i] = new student1("Subham","19ABC4567");
		}
	}

}

class student1 {
	String name;
	String id;

	public student1(String name, String id) {
		this.name=name;
		this.id=id;
	}
}