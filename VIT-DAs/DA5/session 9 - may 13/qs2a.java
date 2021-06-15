import java.io.*;

public class qs2a {
	public static void main(String[] args) throws IOException {
		int sum1 = operationFile1();
		int sum2 = operationFile2();
		int sum3 = operationFile3();
		int sum4 = operationFile4();
		System.out.println("The sum of all numbers from all files is "+(sum1+sum2+sum3+sum4));
	}

	public static int operationFile1() throws IOException {
		FileInputStream fstream = new FileInputStream("file1.txt");
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String data;
		int sumMain = 0, sumFile = 0;
		while ((data = br.readLine()) != null) {
			String[] tmp = data.split(" ");

			for (String s : tmp) {
				sumMain += Integer.parseInt(s);
				if (s.contains("9") || s.contains("7")) {
					sumFile += Integer.parseInt(s);
				}
			}
		}
		System.out.println("From file 1: Sum of numbers that contain 7 or 9 is " + sumFile);
		br.close();
		return sumMain;
	}

	public static int operationFile2() throws IOException {
		FileInputStream fstream = new FileInputStream("file2.txt");
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String data;
		int sumMain = 0, sumFile = 0;
		while ((data = br.readLine()) != null) {
			String[] tmp = data.split(" ");

			for (String s : tmp) {
				sumMain += Integer.parseInt(s);
				if (Integer.parseInt(s) % 9 == 0 || Integer.parseInt(s) % 11 == 0) {
					sumFile += Integer.parseInt(s);
				}
			}
		}
		System.out.println("From file 2: Sum of numbers that is divisible by 9 or 11 is " + sumFile);
		br.close();
		return sumMain;
	}

	public static int operationFile3() throws IOException {
		FileInputStream fstream = new FileInputStream("file3.txt");
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String data;
		int sumMain = 0, sumFile = 0;
		while ((data = br.readLine()) != null) {
			String[] tmp = data.split(" ");

			for (String s : tmp) {
				sumMain += Integer.parseInt(s);
				if (s.length() == 4 || s.endsWith("8")) {
					sumFile += Integer.parseInt(s);
				}
			}
		}
		System.out.println("From file 3: Sum of numbers that are 4 digits long and end with 8 is " + sumFile);
		br.close();
		return sumMain;
	}
	
	public static int operationFile4() throws IOException {
		FileInputStream fstream = new FileInputStream("file4.txt");
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String data;
		int sumMain = 0;
		while ((data = br.readLine()) != null) {
			String[] tmp = data.split(" ");

			for (String s : tmp) {
				sumMain += Integer.parseInt(s);
			}
		}
		br.close();
		return sumMain;
	}

}
