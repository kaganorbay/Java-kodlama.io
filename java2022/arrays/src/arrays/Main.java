package arrays;

public class Main {

	public static void main(String[] args) {
		String[] students= new String[4];
		students[0]="Kağan";
		students[1]="Orbay";
		students[2]="Engin";
		students[3]="Derin";
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		for(String student:students) {
			System.out.println(student);
		}
	

	}

}
