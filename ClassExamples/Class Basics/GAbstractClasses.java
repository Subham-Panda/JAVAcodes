public class GAbstractClasses {
	public static void main(String[] args) {

		// Child classes can be stored in a parent class type

		shape s = new square(10);
		shape c = new circle(10);
		s.computearea();
		c.computearea();
		System.out.println(s.area);
		System.out.println(c.area);
	}
}

abstract class shape {
	double area;

	public void display() {
		System.out.println(area);
	}

	public abstract void computearea();
}

// CLASSES EXTENDING ABSTRACT CLASSES MUST IMPLEMENET ALL ITS ABSTRACT METHODS

class square extends shape {
	int side;

	public square(int side) {
		this.side = side;
	}

	public void computearea() {
		area = side * side;
	}
}

class circle extends shape {
	int radius;

	public circle(int radius) {
		this.radius = radius;
	}

	public void computearea() {
		area = Math.PI * radius * radius;
	}
}