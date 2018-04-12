package topic15.numPrinter;

import java.util.Scanner;
import static java.lang.System.*;

public class PrintNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int start, end, open;
		
		do {
			out.println("Koniec programu, wprowad� 0");
			out.println("Otwarcie p�tli programu, wprowad� 1");
			
			open = sc.nextInt();

				
			if ((open == PrintUtils.OPEN) && (open != PrintUtils.EXIT)) {
				out.println("Podaj liczb� A:");
				start = sc.nextInt();
				out.println("Podaj liczb� B (wi�ksz� od A):");
				end = sc.nextInt();
				PrintUtils.Num(start, end);
				out.println("W celu kontynuacji wybierz dowoln� liczb� lub 0 - zako�cz");
			} else {
				out.println("Program zako�czy� dzia�anie");
				sc.close();
				break;
			}
		} while (sc.nextInt() != PrintUtils.EXIT);
		
		sc.close();
		
	}
}



