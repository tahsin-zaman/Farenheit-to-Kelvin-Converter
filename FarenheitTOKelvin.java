import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class FarenheitTOKelvin {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Please enter a temperature in Farenheit: ");  
		double f = sc.nextDouble();  

		
		
		
		double k = (f + 459.67) * 5/9;
		
		NumberFormat x = new DecimalFormat("#.00");
		

		System.out.println(f + "° farenheit is " + x.format(k) + " kelvin");
	}

}
