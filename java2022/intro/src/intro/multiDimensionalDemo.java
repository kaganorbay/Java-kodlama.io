package intro;

public class multiDimensionalDemo {

	public static void main(String[] args) {
		String[][] cities = new String[3][3];
		cities[0][0]="İstanbul";
		cities[0][1]="Bursa";
		cities[0][2]="Kocaeli";
		cities[1][0]="Ankara";
		cities[1][1]="Konya";
		cities[1][2]="Kayseri";
		cities[2][0]="Diyarbakır";
		cities[2][1]="Şanlıurfa";
		cities[2][2]="Gaziantep";
	
		for (int i = 0; i < cities.length; i++) {
			System.out.println("------------");
			for (int j = 0; j < cities.length; j++) {
				System.out.println(cities[i][j]);
			}
		}
	}

}
