
import java.util.*;
import java.text.*;
class DatesInJava
{
	public static void main(String[] args) {
		
		Calendar code = Calendar.getInstance();
		int dd  = code.get(Calendar.MONTH);
		int year = code.get(Calendar.YEAR);

		System.out.println("MONTH : "+dd);
		System.out.println(" YEAR : "+year);

		///////////////////////////////////////////////////////###########
		Date d = new Date();

		DateFormat fmt  = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.SHORT,Locale.UK);
		String date = fmt.format(d);


		System.out.println("\n\n\ndate time : "+date);

	}
}