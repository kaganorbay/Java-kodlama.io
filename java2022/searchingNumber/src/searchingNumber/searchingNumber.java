package searchingNumber;

public class searchingNumber {

	public static void main(String[] args) {
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
			System.out.println(callNumber+" is here");
		}
		else {
			System.out.println(callNumber+" not here");
		}
		
	}

}
