package topic20.presto;

import java.util.Scanner;

public class Pizzeria {
	
	public static void main(String[] args) {
		
		/* informacje dla u¿ytkownika */
		System.out.println("Dostêpne Pizze:");
		
		// Pizza[] p = Pizza.values();
		// pola enum przekazane do tablicy
		for (Pizza i_kindEnum: Pizza.values()) {
			System.out.println(i_kindEnum);
			// wyœwietla wszystkie rodzaje potraw
		}
		
		/* odbiór danych od u¿ytkownika */
		Scanner input = new Scanner(System.in);
		System.out.println("Jak¹ pizzê wybierasz ?");
		boolean IS_EXIT_ORDER = true;
		while(IS_EXIT_ORDER) {
			try {
				Pizza kindEnum = Pizza.valueOf(input.nextLine());
				System.out.println("Dziêkujemy za zamówienie pizzy " + kindEnum.name());
				System.out.println("Transakcja zakoñczona !");
				IS_EXIT_ORDER = false;
			} catch(IllegalArgumentException e) {
				System.out.println("Nie ma pizzy o podanej nazwie.");
				System.out.println("Wpisz inn¹ nazwê");
			}
		}
		input.close();
	}
}
