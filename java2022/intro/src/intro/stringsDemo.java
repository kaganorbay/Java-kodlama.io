package intro;

public class stringsDemo {

	public static void main(String[] args) {
		String message="Today wheather is good.";
		System.out.println(message);
	/*	
		System.out.println("Number of Letters: "+message.length());
		System.out.println("Number of 5.Letter: "+message.charAt(4));
		System.out.println(message.concat(" Its a good new!"));
		System.out.println(message.startsWith("T"));
		System.out.println(message.endsWith("."));
		char[] charachters=new char[5];
		message.getChars(0, 5, charachters, 0);
		System.out.println(charachters);
		System.out.println(message.indexOf("a"));
		System.out.println(message.lastIndexOf("o")); */
		
		String newMessage=message.replace(' ','-');
		System.out.println(newMessage);
		System.out.println(message.substring(2,4));
		
		for (String word : message.split(" ")) {
			
			System.out.println(word);
		}
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());
		
		
	}

}
