import java.io.*;
import java.util.*;

public class JavaLabFat {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		try {
			Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);
			System.out.print("Enter number of mobile phones: ");
			int n = sc.nextInt();
			mobile marr[] = new mobile[n];
			File obj = new File("/home/subham/Desktop/JAVA LAB FAT/mobilephone.txt");
			FileOutputStream fout = new FileOutputStream(obj);
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			System.out.println();
			for (int i = 0; i < n; i++) {
				System.out.println("-----ENTER DETAILS OF Mobile " + (i + 1) + " -----");
				System.out.print("Enter name of model: ");
				String modelName = sc1.nextLine();
				System.out.print("Enter number of model: ");
				String modelNumber = sc1.nextLine();
				System.out.print("Enter name of brand: ");
				String brandName = sc1.nextLine();
				System.out.print("Enter price of model: ");
				int price = sc.nextInt();
				System.out.print("Enter quantity of the model available: ");
				int quantityAvailable = sc.nextInt();
				marr[i] = new mobile(modelName, modelNumber, brandName, price, quantityAvailable);
				objout.writeObject(marr[i]);
				System.out.println();
			}
			objout.close();
			fout.close();

			System.out.println();

			FileInputStream fin = new FileInputStream(obj);
			ObjectInputStream objin = new ObjectInputStream(fin);
			mobile mInputArr[] = new mobile[n];
			for (int i = 0; i < n; i++) {
				mInputArr[i] = (mobile) objin.readObject();
			}
			objin.close();
			fin.close();

			System.out.println("---------SELECT AN OPTION-------");
			System.out.println("1.View details of mobile phone by brand name");
			System.out.println("2.View details of mobile phones within a price range");
			System.out.println("3.View the brand that has highest number of models with price less than Rs.10000/-");
			System.out.print("Enter you choice: ");
			int ch = sc.nextInt();
			switch (ch) {
				case 1:
					mobile.viewDetailsByBrandName(mInputArr);
					break;
				case 2:
					mobile.viewDetailsWithinPriceRange(mInputArr);
					break;
				case 3:
					mobile.viewBrandsWithHighestModelsLessThan10k(mInputArr);
					break;
				default:
					System.out.println("Enter a valid option");
			}
			sc.close();
			sc1.close();
		} catch (InputMismatchException e) {
			System.out.println("Please eneter the input of correct type");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class mobile implements Serializable {
	String modelName;
	String modelNumber;
	String brandName;
	int price;
	int quantityAvailable;

	public mobile(String modelName, String modelNumber, String brandName, int price, int quantityAvailable) {
		this.modelName = modelName;
		this.modelNumber = modelNumber;
		this.brandName = brandName;
		this.price = price;
		this.quantityAvailable = quantityAvailable;
	}

	public void viewDetails() {
		System.out.println("Model Name: " + modelName + ", Model Number: " + modelNumber + ", Brand Name: " + brandName
				+ ", Price: " + price + ", Quantity Available: " + quantityAvailable);
	}

	public static void viewDetailsByBrandName(mobile[] marr) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of brand: ");
		String brand = sc.nextLine();
		int flag = 0;
		for (mobile m : marr) {
			if (m.brandName.compareToIgnoreCase(brand) == 0) {
				m.viewDetails();
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("No mobiles of the brand were found");
		}
		sc.close();
	}

	public static void viewDetailsWithinPriceRange(mobile[] marr) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter lower range of the price: ");
		int low = sc.nextInt();
		System.out.print("Enter higher range of the price: ");
		int high = sc.nextInt();
		int flag = 0;
		for (mobile m : marr) {
			if (m.price >= low && m.price <= high) {
				m.viewDetails();
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("No mobiles in that price range were found");
		}
		sc.close();

	}

	public static void viewBrandsWithHighestModelsLessThan10k(mobile marr[]) {
		HashMap<String, Integer> mobileCount = new HashMap<>();
		int flag = 0;
		for (mobile m : marr) {
			if (m.price <= 10000) {
				if (mobileCount.containsKey(m.brandName)) {
					mobileCount.replace(m.brandName, mobileCount.get(m.brandName).intValue() + 1);
				} else {
					mobileCount.put(m.brandName, 1);
					flag = 1;
				}
			}
		}

		if (flag == 0) {

		} else {
			String highestBrand = "";
			int highestVal = 0;
			for (String b : mobileCount.keySet()) {
				String brand = b.toString();
				int val = mobileCount.get(brand).intValue();
				if (val > highestVal) {
					highestVal = val;
					highestBrand = brand;
				}
			}
			System.out.println(
					"The brand that has the highest number of Models with price lesser than Rs.10000: " + highestBrand);
		}

	}

}

