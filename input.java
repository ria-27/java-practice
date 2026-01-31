package S1;
import java.util.Scanner;
public class input {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Age: ");  //only print so that input doesn't appear in next line
		byte age=sc.nextByte();//methods for reading data--start with next
		System.out.println("You are "+age); //java itself will convert the byte variable to string so that they can be added together--implicit
		
		System.out.print("Name: ");
		String name=sc.next(); //next method reads only 1 token--(mosh lynn)--reads only mosh
		sc.nextLine();
		System.out.println("You are "+name);
		
		System.out.print("From: ");
		String place=sc.nextLine().trim(); //to remove white spaces
		System.out.println("You are from "+place);
		
	}

}
