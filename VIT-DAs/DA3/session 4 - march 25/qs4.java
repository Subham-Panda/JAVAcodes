// import java.lang.Math;
// import java.util.Scanner;

// public class qs4 {
// 	public static void main(String[] args) {
// 		int x,y,z;
// 		Scanner sc = new Scanner(System.in);
// 		shape s[] = new shape[4]; 
// 		s[0] = new square();
// 		System.out.print("Enter x coordinate for square: ");
// 		x = sc.nextInt();
// 		System.out.print("Enter y coordinate for square: ");
// 		y = sc.nextInt();
// 		s[0].getlocation(x, y);
// 		s[0].computearea();
// 		s[1] = new circle();
// 		System.out.print("Enter x coordinate for circle: ");
// 		x = sc.nextInt();
// 		System.out.print("Enter y coordinate for circle: ");
// 		y = sc.nextInt();
// 		s[1].getlocation(x, y);
// 		s[1].computearea();
// 		s[2] = new sphere();
// 		System.out.print("Enter x coordinate for sphere: ");
// 		x = sc.nextInt();
// 		System.out.print("Enter y coordinate for sphere: ");
// 		y = sc.nextInt();
// 		System.out.print("Enter z coordinate for sphere: ");
// 		z = sc.nextInt();
// 		s[2].getlocation(x, y, z);
// 		s[2].computearea();
// 		s[3] = new cube();
// 		System.out.print("Enter x coordinate for cube: ");
// 		x = sc.nextInt();
// 		System.out.print("Enter y coordinate for cube: ");
// 		y = sc.nextInt();
// 		System.out.print("Enter z coordinate for cube: ");
// 		z = sc.nextInt();
// 		s[3].getlocation(x, y, z);
// 		s[3].computearea();
// 		sc.close();
// 	}
// }

// abstract class shape {
// 	double area;
// 	int x;
// 	int y;
// 	int z;
// 	double positionVector;

// 	public void getlocation(int x, int y, int z) {
// 		this.x = x;
// 		this.y = y;
// 		this.z = z;
// 		positionVector = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
// 	}

// 	public void getlocation(int x, int y) {
// 		this.x = x;
// 		this.y = y;
// 		positionVector = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
// 	}

// 	public void display() {
// 		System.out.println(area);
// 	}
	
	
// 	public abstract void computearea();
// }

// abstract class twodimensionalshape extends shape {
// 	int x;
// 	int y;
// 	double positionVector;

// 	public void getlocation(int x, int y) {
// 		this.x = x;
// 		this.y = y;
// 		positionVector = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
// 	}
// }

// abstract class threedimensionalshape extends shape {
// 	int x;
// 	int y;
// 	int z;
// 	double positionVector;

// 	public void getlocation(int x, int y, int z) {
// 		this.x = x;
// 		this.y = y;
// 		this.z = z;
// 		positionVector = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
// 	}
// }

// class circle extends twodimensionalshape {
// 	@Override
// 	public void computearea() {
// 		area = 3.14 * positionVector * positionVector;
// 		super.display();
// 	}
// }

// class square extends twodimensionalshape {
// 	@Override
// 	public void computearea() {
// 		area = positionVector * positionVector;
// 		super.display();
// 	}
// }

// class sphere extends threedimensionalshape {
// 	@Override
// 	public void computearea() {
// 		area = 4 * 3.14 * positionVector * positionVector;
// 		super.display();
// 	}
// }

// class cube extends threedimensionalshape {
// 	@Override
// 	public void computearea() {
// 		area = 6 * positionVector * positionVector;
// 		super.display();
// 	}
// }