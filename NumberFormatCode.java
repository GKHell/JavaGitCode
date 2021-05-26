import java.util.*;
import java.text.*;
class NumberFormatCode
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the ammount : ");
		double number = sc.nextDouble();

		NumberFormat obj =  NumberFormat.getNumberInstance();

		obj.setMaximumFractionDigits(2);
		obj.setMinimumIntegerDigits(10);

		String s = obj.format(number);

		System.out.println("ammount : "+s);
			
	}
}