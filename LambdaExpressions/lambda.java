public class lambda {
	public static void main(String[] args) {
		employee1 e = () -> {
			System.out.println("HELLO WORLD");
		};
		e.display();
	}
}

//LAMBDA EXPRESSIONS WORK ONLY FOR FUNCTIONAL INTERFACE
// FUNTIONAL INTERFACE THAT HAS ONLY ONE ABSTRACT METHOD AND NO OTHER METHOD
interface employee1 {
	void display();
}
