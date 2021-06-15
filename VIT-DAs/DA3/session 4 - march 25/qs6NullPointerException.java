public class qs6NullPointerException {
	public static void main(String[] args) {
		demo d = new demo("Subham");
		d = null;
		System.out.println(d.s);
	}
}

class demo {
	String s;

	demo(String s) {
		this.s = s;
	}
}
