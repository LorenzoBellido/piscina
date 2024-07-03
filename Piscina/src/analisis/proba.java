package analisis;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;

public class proba{
  public static void main(String[] args) {
	  
	  Calendar c = Calendar.getInstance();
		String dia = Integer.toString(c.get(Calendar.DATE));
		String mes = Integer.toString(c.get(Calendar.MONTH) + 1);
		String annio = Integer.toString(c.get(Calendar.YEAR));
		
		System.out.println(dia + "/" + mes + "/" + annio);
		
    LocalDate Current_Date = LocalDate.now();

    DayOfWeek Week_Day = Current_Date.getDayOfWeek();

    System.out.println("The current day of the Week is :: " + Week_Day);
    System.out.println("The current day of the Week in Number is :: " + Week_Day.getValue());
    System.out.println("The current day of the Week in full format is :: "
        + Week_Day.getDisplayName(TextStyle.FULL, Locale.getDefault()));
    System.out.println("The current day of the Week in short format is :: "
        + Week_Day.getDisplayName(TextStyle.SHORT, Locale.getDefault()));
  }
}
