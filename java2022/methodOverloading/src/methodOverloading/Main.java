package methodOverloading;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int eq =calculator.total(10, 15);
		int eq2 = calculator.total2(5, 5, 5);
		System.out.println(eq2);
		System.out.println(eq);
	}

}
