package letters;

public class Main {

	public static void main(String[] args) {
		char letter ='A';
		
		switch (letter) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':{
			System.out.println("Kalın sesli harf");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + letter);
		}
	}

}
