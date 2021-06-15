public class HInterfaces {
	public static void main(String[] args) {

	}
}

/*
 ************
 * Interface contains only abstract methods which are public by default
 * Interface cannot be instantiated
 * Interface do not have a constructor
 * Interface can contain only static and final variables that are public
 * A class should implement all the methods in an interface 
 * A class can implement multiple Interfaces - way to acheive multiple interface 
 * Interface can extend another interface 
 * An object cannot be created for an interface
 ***************
 */

interface button {
	void setButtonColor();

	void setButtonText();

	void onClick();

	// not compulsory to implement this method in the classes implementing the interface
	// but can be overwritten
	default void testMethod() {
		System.out.println("THIS IS A TEST METHOD");
	}
}

interface threedimension extends button {
	void location(int x, int y, int z);
}

interface twodimension extends button {
	void location(int x, int y);
}

class form implements threedimension, twodimension {
	@Override
	public void setButtonColor() {

	}

	@Override
	public void setButtonText() {

	}

	@Override
	public void onClick() {

	}

	@Override
	public void location(int x, int y) {

	}

	@Override
	public void location(int x, int y, int z) {

	}
}

class reservation implements button {
	String color;
	String text;

	@Override
	public void setButtonColor() {
		color = "blue";
	}

	@Override
	public void setButtonText() {
		text = "RESERVE TICKET";
	}

	@Override
	public void onClick() {
		System.out.println("TICKER RESERVATION SUCCESSFULL");
	}

	//can call the original testMethod from button interface
	public void test() {
		button.super.testMethod();
	}

	// can override testMethod in button interface
	@Override
	public void testMethod() {
		System.out.println("TEST METHOD OF BUTTON INTERFACE OVERWRITTEN");
	}
}

class cancellation implements button {
	String color;
	String text;

	@Override
	public void setButtonColor() {
		color = "red";
	}

	@Override
	public void setButtonText() {
		text = "CANCEL TICKET";
	}

	@Override
	public void onClick() {
		System.out.println("TICKET CANCELLED SUCCESSFULL");
	}
}
