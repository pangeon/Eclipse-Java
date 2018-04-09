package r4.s2_3;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalendarTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.GERMAN); // nazwy dni tygodnia jako skróty nazw niemieckich
		
		// Konstrukcja i ustawienie obiektu calendar z jego aktualn¹ dat¹
		GregorianCalendar d = new GregorianCalendar();

		int today = d.get(Calendar.DAY_OF_MONTH); // 20
		int month = d.get(Calendar.MONTH); // 2

		// Ustawienie calendar na pocz¹tek m-ca
		d.set(Calendar.DAY_OF_MONTH, 1);
		

		int weekday = d.get(Calendar.DAY_OF_WEEK); // 5
		// Pobranie pierwszego dnia tygodnia (pon - polska)
		int firstDayOfWeek = d.getFirstDayOfWeek(); // 2

		// Okreœlenie odpowiedniego wciêcia wiersza
		int indent = 0;
		while (weekday != firstDayOfWeek) { // dopóki dzieñ tygodnia nie bêdzie pierwszym dniem 
			indent++;
			d.add(Calendar.DAY_OF_MONTH, -1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		}
		// Drukowanie nazwy dni tygodni
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		do {
			System.out.printf("%4s", weekdayNames[weekday]);
			d.add(Calendar.DAY_OF_MONTH, 1); // uwaga na metodê add, nie set !
			weekday = d.get(Calendar.DAY_OF_WEEK);
		} while (weekday != firstDayOfWeek);

		System.out.println();
		
		for (int i = 1; i <= indent; i++) {
			System.out.print("    ");
		}
		d.set(Calendar.DAY_OF_MONTH, 1);
		
		do {
			// Drukowanie dnia
			int day = d.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);

			// Oznaczenie bierz¹cego dnia znakiem
			if (day == today) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			// Ustawienie day na kolejny dzieñ
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);

			// Rozpoczêcie nowego wiersza na pocz¹tku tygodnia
			if (weekday == firstDayOfWeek) {
				System.out.println();
			}
		} while (d.get(Calendar.MONTH) == month);

		// Wydruk koñcowego znaku wiersza w razie potrzeby
		if (weekday != firstDayOfWeek) {
			System.out.println();
		}
	}
}
