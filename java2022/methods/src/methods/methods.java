package methods;

public class methods {

	public static void main(String[] args) {
		searchNumber();
	}
	
	public static void searchNumber() {
		int[] numbers= new int[] {1,2,5,7,9,0};
		int  callNumber=9;
		boolean isHere=false;
		
		for (int i : numbers) {
			if (i == callNumber) {
				isHere=true;
				break;
			}
			
		}
		if (isHere) {
			giveMessage(callNumber);
		}
		else {
			System.out.println(callNumber+" not here");
		}
		
	
	}
	public static void giveMessage(int callNumber) {
		System.out.println(callNumber+" is here");
	}
}
