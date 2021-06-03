package ClassExamples.AnonymousClass;

public class AclassGeneral {
	public static void main(String[] args) {
		//GENERAL WAY TO PERFORM
		student1 s = new student1();
		s.display();
	}
}

abstract class person1 {
	public abstract void display();
}

class student1 extends person1 {
	@Override
	public void display() {
		System.out.println("HELLO WORLD");
	}
}
