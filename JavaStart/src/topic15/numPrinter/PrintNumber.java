package topic15.numPrinter;

import java.util.Scanner;
import static java.lang.System.*;

public class PrintNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int start, end, open;
		
		do {
			out.println("Koniec programu, wprowadŸ 0");
			out.println("Otwarcie pêtli programu, wprowadŸ 1");
			
			open = sc.nextInt();

				
			if ((open == PrintUtils.OPEN) && (open != PrintUtils.EXIT)) {
				out.println("Podaj liczbê A:");
				start = sc.nextInt();
				out.println("Podaj liczbê B (wiêksz¹ od A):");
				end = sc.nextInt();
				PrintUtils.Num(start, end);
				out.println("W celu kontynuacji wybierz dowoln¹ liczbê lub 0 - zakoñcz");
			} else {
				out.println("Program zakoñczy³ dzia³anie");
				sc.close();
				break;
			}
		} while (sc.nextInt() != PrintUtils.EXIT);
		
		sc.close();
		
	}
}



