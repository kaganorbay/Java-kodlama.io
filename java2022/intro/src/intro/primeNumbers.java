package intro;

public class primeNumbers {

	public static void main(String[] args) {
		
		int number = 12;
		
		boolean isPrime = true;
		
		for (int i = 2; i < number; i++) {
			if (number%i==0) {
				isPrime=false;
			}
		}
		if (isPrime==true) {
			System.out.println(number+":Prime number");
		}
		else if(number<1){
			System.out.println(number+":Invalid number");
		}
		
		else {
			System.out.println(number+":Not prime number");

		}
	

	}

}
