import java.util.*;

public class qs8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean found=false;
		String arr[] =new String[5];
		for (int i=0; i<5; i++) {
			System.out.print("Enter Name "+(i+1)+": ");
			arr[i]=sc.nextLine();       
		}
		System.out.print("\nEnter a name to search for: ");
		String toSearch = sc.nextLine();
		if(!toSearch.startsWith("Dr."))
			toSearch = "Dr." + toSearch;
		for (String s : arr) {
			if (s.equals(toSearch)) {
				found = true;
				break;
			}
		}
		System.out.println(found ? "Name Found" : "Name Not Found");
		sc.close();
	}
}
