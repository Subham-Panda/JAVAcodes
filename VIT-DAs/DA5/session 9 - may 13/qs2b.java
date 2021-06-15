import java.util.*;

public class qs2b {
	public static void main(String[] args) {
		LinkedList<car> cll = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 4; i++) {
			System.out.println("----ENTER DETAILS FOR CAR " + i + " ----");
			System.out.print("Enter ID:  ");
			String car_id = sc.nextLine();
			System.out.print("Enter Name: ");
			String car_name = sc.nextLine();
			System.out.print("Enter Brand: ");
			String car_brand = sc.nextLine();
			cll.add(new car(car_id, car_name, car_brand));
			System.out.println();
		}
		System.out.println();
		ListIterator<car> itr = cll.listIterator();
		while (itr.hasNext()) {
			car c = itr.next();
			if (c.car_brand.compareToIgnoreCase("ford") == 0) {
				c.displayInfo();
			}
		}
		sc.close();
	}
}

class car {
	String car_id;
	String car_name;
	String car_brand;

	car(String car_id, String car_name, String car_brand) {
		this.car_id = car_id;
		this.car_name = car_name;
		this.car_brand = car_brand;
	}

	public void displayInfo() {
		System.out.println("Car ID: " + car_id + ", Car Name: " + car_name + ", Car Brand: " + car_brand);
	}
}
