public class BclassAbstract{
	public static void main(String[] args) {
		person2 p = new person2(){
			public void display() {
				System.out.println("HELLO WORLD");
			};
		};
		p.display();
	}
}

abstract class person2 {
	public abstract void display();
}

