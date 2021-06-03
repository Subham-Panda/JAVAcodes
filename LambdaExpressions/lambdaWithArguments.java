package LambdaExpressions;

public class lambdaWithArguments {
	public static void main(String[] args) {
		employee2 e = (n, a) -> {
			System.out.println("HELLO "+n+" of AGE "+a);
		};
		e.display("SUBHAM", 20);
	}
}

interface employee2 {
	void display(String name, int age);
}
