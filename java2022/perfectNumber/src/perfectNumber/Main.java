package perfectNumber;

public class Main {

	public static void main(String[] args) {
		int number =28, x=0;
		for (int i = number-1; i > 0; i--) {
			if (number%i==0) {
				x=x+i;						
			}
		}
		if (x==number) {
			System.out.println(number+": Perfect Number");
		}
		else {
			System.out.println(number+":Not a Perfect Number");

		}
	}

}
