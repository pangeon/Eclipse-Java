package loop;

import java.util.Scanner;

public class ForEachProblem {

	/*
	 * Bardzo wa�ne jest to, �e zmienna (w tym przypadku i) 
	 * nie jest tym samym co odwo�anie si� bezpo�rednio do elementu tablicy 
	 * (np. numbers[2]). Jest to zmienna, do kt�rej przypisywana jest kopia warto�ci 
	 * odpowiedniej kom�rki tablicy i wewn�trz p�tli operujemy tak naprawd� na kopii warto�ci, 
	 * a nie na jej oryginale.
	 */
	public static void main(String[] args) {
		int numbers[] = new int[3];
		Scanner in = new Scanner(System.in);
		
		for (@SuppressWarnings("unused") int i : numbers) {
			System.out.println("Podaj liczb�:");
			i = in.nextInt();
		}
		/* tak jest okej
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextInt(); 
			
		}*/
		for (int i : numbers) {
			System.out.println(i); // wynik 0, 0, 0
		}
		in.close();

	}

}
