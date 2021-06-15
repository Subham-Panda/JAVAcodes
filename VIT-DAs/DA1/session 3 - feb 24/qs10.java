/* product class*/
class Products {
	private String productId;
	private String name;
	private int serialNumber;
	private String company;
	private String manufacturedDate;
	int price;

	/* constructor */
	Products(String pId, String name, int serialNumber, String company, String manufacturedDate, int price) {
		this.productId = pId;
		this.name = name;
		this.serialNumber = serialNumber;
		this.company = company;
		this.manufacturedDate = manufacturedDate;
		this.price = price;

	}

	/* geter methods */
	public String getproductId() {
		return productId;
	}

	public String getName() {
		return name;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public String getCompany() {
		return company;
	}

	public String getManufacturedDate() {
		return manufacturedDate;
	}

	public int getPrice() {
		return price;
	}

}

public class qs10 {
	public static void main(String[] args) {
		/* Creating array of proucts */
		Products prod[] = new Products[5];

		/* assigning values */
		prod[0] = new Products("1", "Mobile", 123, "Samsung", "20july2017", 20000);
		prod[1] = new Products("2", "laptop", 223, "Lenovo", "1jan2014", 50000);
		prod[2] = new Products("3", "Earphone", 323, "Boat", "10oct2020", 500);
		prod[3] = new Products("4", "Bluetooth Earphone", 423, "Sony", "5may2020", 900);
		prod[4] = new Products("5", "Bike", 523, "Honda", "15april2015", 90000);

		/* methods call */
		displaySamsung(prod);
		displayManufacturedBW2012and2019(prod);
		displayPriceGreater10000(prod);
		displayLaptop(prod);
	}

	/* It Will display all Samsung produtcs */
	static void displaySamsung(Products p[]) {

		System.out.println("\nAll Samsung");
		/* loop running till product array length */
		for (int i = 0; i < p.length; i++) {
			/* chechking company name */
			if (p[i].getCompany().equals("Samsung")) {
				System.out.println("Id = " + p[i].getproductId() + " Name = " + p[i].getName() + " SerialNumber = "
						+ p[i].getSerialNumber() + " Company = " + p[i].getCompany() + " ManufacturedDate = "
						+ p[i].getManufacturedDate() + " Price = " + p[i].getPrice());
			}
		}
	}

	/* It Will display all produtcs which Manufactured between 2012 and 2019 */
	static void displayManufacturedBW2012and2019(Products p[]) {
		System.out.println("\nManufactured between 2012 and 2019");
		/* loop running till product array length */
		for (int i = 0; i < p.length; i++) {
			char c[] = p[i].getManufacturedDate().toCharArray();
			int len = c.length;
			String year = "" + (char) c[len - 4] + (char) c[len - 3] + (char) c[len - 2] + (char) c[len - 1];
			int y = Integer.parseInt(year);
			/* chechking year */
			if ((y > 2012) && (y < 2019)) {
				System.out.println("Id = " + p[i].getproductId() + " Name = " + p[i].getName() + " SerialNumber = "
						+ p[i].getSerialNumber() + " Company = " + p[i].getCompany() + " ManufacturedDate = "
						+ p[i].getManufacturedDate() + " Price = " + p[i].getPrice());
			}
		}
	}

	/* It Will display product which price is greater then 10000 */
	static void displayPriceGreater10000(Products p[]) {
		System.out.println("\nPrice Greater then 10000");
		/* loop running till product array length */
		for (int i = 0; i < p.length; i++) {

			int pr = p[i].getPrice();
			/* chechking price */
			if (pr > 10000) {
				System.out.println("Id = " + p[i].getproductId() + " Name = " + p[i].getName() + " SerialNumber = "
						+ p[i].getSerialNumber() + " Company = " + p[i].getCompany() + " ManufacturedDate = "
						+ p[i].getManufacturedDate() + " Price = " + p[i].getPrice());
			}
		}
	}

	/* It Will display all laptop produtcs */
	static void displayLaptop(Products p[]) {
		System.out.println("\nLaptops");
		/* loop running till product array length */
		for (int i = 0; i < p.length; i++) {

			/* chechking name of product */
			if (p[i].getName().equals("laptop")) {
				System.out.println("Id = " + p[i].getproductId() + " Name = " + p[i].getName() + " SerialNumber = "
						+ p[i].getSerialNumber() + " Company = " + p[i].getCompany() + " ManufacturedDate = "
						+ p[i].getManufacturedDate() + " Price = " + p[i].getPrice());
			}
		}
	}
}