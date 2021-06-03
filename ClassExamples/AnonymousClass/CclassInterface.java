package ClassExamples.AnonymousClass;

public class CclassInterface {
	public static void main(String[] args) {
		person3 p = new person3(){
			public void display() {
				System.out.println("HELLO WORLD");
			};
		};
		p.display();
	}
}

interface person3 {
	public abstract void display();
}

