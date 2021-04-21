import java.util.InputMismatchException;
import java.util.Scanner;

public class exception7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		try {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			if (num2 == 0) {
				throw new ArithmeticException("Cannot divide by zero");
			}
			if (num1 == 13 || num2 == 13) {
				throw new num13Exception("I dont like number 13");
			}
			if (num1 == 15 || num2 == 15) {
				throw new num15Exception("I dont like number 15");
			}
			System.out.println(num1 / num2);
		} catch (ArithmeticException e) { // catching arithmetic exception
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("Enter correct input");
		}

		//CORRECT
		// catch (myExceptionMain e) {
		// 	System.out.println(e.getMessage());
		// } 

		// CORRECT
		catch (num13Exception e) {
			System.out.println(e.getMessage());
		} catch (num15Exception e) {
			System.out.println(e.getMessage());
		} catch (myExceptionMain e) { //will never reach this
			System.out.println(e.getMessage());
		}

		//ANOTHER WAY
		// catch (myExceptionMain e) { //will never reach this
		// 	if (e instanceof num13Exception) {
		// 		System.out.println(" i dont like 13");
		// 	}
		// 	if (e instanceof num15Exception) {
		// 		System.out.println(" i dont like 15");
		// 	}

		// }


		//INCORRECT
		// catch (myExceptionMain e) {
		// 	System.out.println(e.getMessage());
		// } catch (num13Exception e) {
		// 	System.out.println(e.getMessage());
		// } catch (num15Exception e) {
		// 	System.out.println(e.getMessage());
		// } 



		catch (Exception e) { // ! Exception always last catch block
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

}

class myExceptionMain extends Exception {
	public myExceptionMain(String message) {
		super(message);

	}
}

class num13Exception extends myExceptionMain {
	public num13Exception(String s) {
		super(s);
	}
}

class num15Exception extends myExceptionMain {
	public num15Exception(String s) {
		super(s);
	}
}