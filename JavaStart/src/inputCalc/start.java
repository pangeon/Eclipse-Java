package inputCalc;

import java.util.Locale;
import java.util.Scanner;

public class start {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.println("Podaj pierwsz� liczb�");
		double a = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Zdefiniuj operacje arytetyczn� podaj znak: + , -, *, /");
		String operation = sc.next();
		sc.nextLine();
		
		System.out.println("Podaj pierwsz� drug�");
		double b = sc.nextDouble();
		sc.nextLine();
		
		sc.close();
		
		switch(operation) {
			case "+":
				System.out.println("Wynik dodawania: " + Calc.sum(a, b));
				break;
			case "-":
				System.out.println("Wynik dodawania: " + Calc.subtr(a, b));
				break;
			case "*":
				System.out.println("Wynik dodawania: " + Calc.mult(a, b));
				break;
			case "/":
				System.out.println("Wynik dodawania: " + Calc.div(a, b));
				break;
			default:
				System.out.println("Wprowadzi�e� b��dny znak");
				break;
			
		}
		
	}

}
