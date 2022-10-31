package classes;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager= new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		int [] numbers=new int [] {1,2,3};
		int [] numbers2=new int [] {4,5,6};
		numbers2=numbers;
		numbers[0]=10;
		System.out.println(numbers2[0]);
		
	}

}
