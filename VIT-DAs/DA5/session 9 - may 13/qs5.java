import java.util.*;

public class qs5 {
	public static void main(String[] args) {
		LinkedList<Customer> cl = new LinkedList<Customer>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("-----CUSTOMER " + (i + 1) + " -----");
			System.out.print("Enter name: ");
			String name = sc.next();
			System.out.print("Enter purchase amount: ");
			double p = sc.nextDouble();
			cl.add(new Customer(name, p));
		}
		Iterator<Customer> iterator = cl.descendingIterator();
		int count = 0;
		while (iterator.hasNext()) {
			Customer itr = iterator.next();
			System.out.println("Nmae of Customer "+(count++)+": "+itr.name+", Amount of purchase: "+itr.purchase);
		}
		sc.close();
	}
}

class Customer {
	String name;
	double purchase;

	public Customer(String name, double amount) {
		this.name = name;
		this.purchase = amount;
	}
}