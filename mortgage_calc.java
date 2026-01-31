package S1;
import java.util.Scanner;
import java.text.NumberFormat;
public class mortgage_calc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter prinipal amount: ");
		double pr=sc.nextDouble();
		
		System.out.print("Enter annual rate of interest (in %): ");
		double annualrate=sc.nextDouble();
		double monthlyrate=annualrate/100/12;
		
		System.out.print("Enter period: ");
		int years=sc.nextInt();
		int numberOfPayments=years*12;
		
		double mortgage=pr*(monthlyrate*Math.pow(1+monthlyrate,numberOfPayments))/
				(Math.pow(1+monthlyrate, numberOfPayments)-1)
				;
		NumberFormat currency=NumberFormat.getCurrencyInstance();
		String Result=currency.format(mortgage);
		System.out.println("Monthly Mortgage: "+Result);	
	}
}
