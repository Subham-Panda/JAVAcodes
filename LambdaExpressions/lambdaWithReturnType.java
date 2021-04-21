public class lambdaWithReturnType {
	public static void main(String[] args) {
		test3 t = (p, q) -> {
			return p + q;
		};
		int ans = t.add(10,2);
		System.out.println(ans);
	}
}

interface test3 {
	int add(int a, int b);
}
