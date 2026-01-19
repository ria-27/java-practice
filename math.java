package S1;

public class math {
	public static void main(String[] args) {
		int result=Math.round(1.1F);  // rounds double and float value
		System.out.println(result);
		int result2=(int)Math.ceil(1.1F); //rounds up
		System.out.println(result2); 
		int result3=Math.max(1,2);
		System.out.println(result3);
		double result4=Math.random(); // returns random double between 0 and 1
		System.out.println(result4);
		double result5=Math.random()*100; // between 1 and 100
		System.out.println(result5);
		// if we don't want floating point value for the above,
		double result6=Math.round(Math.random()*100); // returns random double between 0 and 1
		System.out.println(result6);
		// to convert into integer type-explicit casting
		int result7=(int)Math.round(Math.random()*100); 
		System.out.println(result7);
		//or
		int result8=(int)(Math.random()*100); 
		System.out.println(result8);
	}
}
