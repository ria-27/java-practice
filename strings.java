package S1;

public class strings {
	public static void main() {
		String message=" Hello World."+" How are you?";
		System.out.println(message.endsWith("?"));  // a method that returns boolean value
		System.out.println(message.startsWith("?"));
		System.out.println(message.length());
		System.out.println(message.indexOf("o"));   // returns index of the first o
		System.out.println(message.indexOf("sky")); // returns -1 if the string is not present
		System.out.println(message.replace("?","!"));  //does not modify the ORIGINAL string
		System.out.println(message);  // strings are immutable in java- cannot be changed
		System.out.println(message.toLowerCase());
		System.out.println(message.trim());  //removes white spaces
	}
}
