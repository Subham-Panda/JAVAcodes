public class qs7NullPointerException {
	public static void main(String[] args) {
		try {
			demo1 d = new demo1("Subham");
			d = null;
			System.out.println(d.s);
		} catch (NullPointerException e) {
			System.out.println("The varaiable d doesnt reference to any memory, so cant access the variable");
		}

	}
}

class demo1 {
	String s;

	demo1(String s) {
		this.s = s;
	}
}
