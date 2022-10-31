package intro;

public class reCapDemo2 {

	public static void main(String[] args) {
		
		double total=0;
		double[] myList={1.2,1.3,4.3,5.6};
		double max=myList[0];

		
		for(double list:myList) {
			System.out.println(list);
			total=total+list;
		    if (max<list) {
				max=list;
			}	
		}
		System.out.println(total);
		System.out.println("En Büyük =" + max);
	}

}
