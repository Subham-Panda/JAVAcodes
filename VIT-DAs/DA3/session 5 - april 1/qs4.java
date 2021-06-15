import java.lang.Math;
import java.util.*;

public class qs4 {
	public static void main(String[] args) {
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		try {
			shape s[] = new shape[4];
			s[0] = new square();
			System.out.print("Enter x coordinate for square: ");
			x = sc.nextInt();
			System.out.print("Enter y coordinate for square: ");
			y = sc.nextInt();
			s[0].getlocation(x, y);
			s[0].computearea();
			s[1] = new circle();
			System.out.print("Enter x coordinate for circle: ");
			x = sc.nextInt();
			System.out.print("Enter y coordinate for circle: ");
			y = sc.nextInt();
			s[1].getlocation(x, y);
			s[1].computearea();
			s[2] = new sphere();
			System.out.print("Enter x coordinate for sphere: ");
			x = sc.nextInt();
			System.out.print("Enter y coordinate for sphere: ");
			y = sc.nextInt();
			System.out.print("Enter z coordinate for sphere: ");
			z = sc.nextInt();
			s[2].getlocation(x, y, z);
			s[2].computearea();
			s[3] = new cube();
			System.out.print("Enter x coordinate for cube: ");
			x = sc.nextInt();
			System.out.print("Enter y coordinate for cube: ");
			y = sc.nextInt();
			System.out.print("Enter z coordinate for cube: ");
			z = sc.nextInt();
			s[3].getlocation(x, y, z);
			s[3].computearea();
			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("Please enter the correct input!");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurred!");
		} catch (NullPointerException e) {
			System.out.println("The object you are trying to reference doesnt point to any location in memory");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You are tryng to access an index which is larger than the array");
		} catch (Exception e) {
			System.out.println("Sorry for the inconvinience caused!");
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}
}

abstract class shape {
	double area;
	int x;
	int y;
	int z;
	double positionVector;

	public void getlocation(int x, int y, int z) {
		try {
			this.x = x;
			this.y = y;
			this.z = z;
			positionVector = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurred during calcualting position vector!");
		} catch (Exception e) {
			System.out.println("Error occured during initializing location!");
			System.out.println(e.getMessage());
		}

	}

	public void getlocation(int x, int y) {
		try {
			this.x = x;
			this.y = y;
			positionVector = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurred during calcualting position vector!");
		} catch (Exception e) {
			System.out.println("Error occured during initializing location!");
			System.out.println(e.getMessage());
		}

	}

	public void display() {
		System.out.println(area);
	}

	public abstract void computearea();
}

abstract class twodimensionalshape extends shape {
	int x;
	int y;
	double positionVector;

	public void getlocation(int x, int y) {
		try {
			this.x = x;
			this.y = y;
			positionVector = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurred during calcualting position vector!");
		} catch (Exception e) {
			System.out.println("Error occured during initializing location!");
			System.out.println(e.getMessage());
		}
		
	}
}

abstract class threedimensionalshape extends shape {
	int x;
	int y;
	int z;
	double positionVector;

	public void getlocation(int x, int y, int z) {
		try {
			this.x = x;
			this.y = y;
			this.z = z;
			positionVector = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurred during calcualting position vector!");
		} catch (Exception e) {
			System.out.println("Error occured during initializing location!");
			System.out.println(e.getMessage());
		}
		
	}
}

class circle extends twodimensionalshape {

	@Override
	public void computearea() {
		try {
			area = 3.14 * positionVector * positionVector;
			super.display();
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurred during calculating circle area!");
		} catch (Exception e) {
			System.out.println("Error occured during calculating circle area!");
			System.out.println(e.getMessage());
		}
		
	}
}

class square extends twodimensionalshape {
	@Override
	public void computearea() {
		try {
			area = positionVector * positionVector;
			super.display();
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurred during calculating square area!");
		} catch (Exception e) {
			System.out.println("Error occured during calculating square area!");
			System.out.println(e.getMessage());
		}
		
	}
}

class sphere extends threedimensionalshape {
	@Override
	public void computearea() {
		try {
			area = 4 * 3.14 * positionVector * positionVector;
			super.display();
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurred during calculating sphere surface area!");
		} catch (Exception e) {
			System.out.println("Error occured during calculating sphere surface area!");
			System.out.println(e.getMessage());
		}
		
	}
}

class cube extends threedimensionalshape {
	@Override
	public void computearea() {
		try {
			area = 6 * positionVector * positionVector;
			super.display();
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurred during calculating cube surface area!");
		} catch (Exception e) {
			System.out.println("Error occured during calculating cube surface area!");
			System.out.println(e.getMessage());
		}
		
	}
}