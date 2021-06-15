public class EInheritance {
	public static void main(String[] args) {
		test2 t = new test2();
		
		//PARENT CONSTRUCTOR RUNS FIRST
		
		//OUTPUT:
		//PARENT CONSTRUCTOR
		//CHILD CONSTRUCTOR
		
	}
}

class test1 {
	public test1() {
		System.out.println("PARENT CONSTRUCTOR");
	}
}

class test2 extends test1 {
	public test2() {
		System.out.println("CHILD CONSTRUCTOR");
	}
}