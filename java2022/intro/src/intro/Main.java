package intro;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		String ortaMetin ="İlginizi çekebilir:";
		String altMetin ="Vade";
		System.out.println(ortaMetin);
		
		int vade = 12;
		double dolarDun = 18.25;
		double dolarBugun = 18.20;
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {
			
			okYonu = "down.svg";
			System.out.println(okYonu);
			
		}
		else if(dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
			
		}
		
		String[] credits= {"kredi1","kredi2","kredi3"};
		
		for (int i = 0; i < credits.length; i++) {
			System.out.println(credits[i]);
		}
		
	}

}
