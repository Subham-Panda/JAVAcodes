//qs 5

public class javalabclass {
	public static void main(String[] args) {
		professor satish = new professor("satish ", "vellore ", "111 ", "a06");
		satish.display_professor();
	}
}

abstract class person {
	protected String name;
	protected String address;

	public abstract void display_vitadd();
}

class faculty extends person {
	public String empid;

	public faculty(String a, String b, String c) {
		name = a;
		address = b;
		empid = c;
	}

	public void display_faculty() {
		System.out.println(name + address + empid);
	}

	@Override
	public void display_vitadd() {
		System.out.println(address);
	}
}

class professor extends faculty {
	public String cabinno;

	public professor(String a, String b, String c, String d) {
		super(a, b, c);
		cabinno = d;
	}

	public void display_professor() {
		System.out.println(name + address + empid + cabinno);
	}
}