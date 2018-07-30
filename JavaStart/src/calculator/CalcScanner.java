package calculator;

import java.util.Scanner;

public class CalcScanner  {

	public static void main(String[] args) throws UnknownOperatorExeception {
		Scanner in = new Scanner(System.in);
		System.out.println("Zdefiniuj rodzaj wykonywanej operacji, dostępne: [+],[-],[*],[/]");
		String operator = in.nextLine();
		
		switch (operator) {
		case "+":
			System.out.println("Podaj dwie liczby będące składnikami sumy");
			Double a = in.nextDouble();
			Double b = in.nextDouble();
			System.out.println("Wynik: " + (a+b));
			break;
		case "-":
			System.out.println("Podaj dwie liczby odjemną i odjemnik by otrzymać różnicę");
			Double c = in.nextDouble();
			Double d = in.nextDouble();
			System.out.println("Wynik: " + (c-d));
			break;
		case "*":
			System.out.println("Podaj dwa czynniki by otrzymać wynik mnożenia");
			Double e = in.nextDouble();
			Double f = in.nextDouble();
			System.out.println("Wynik: " + (e*f));
			break;
		case "/":
			System.out.println("Podaj dwie liczby dzielną i dzielnik");
			System.out.println("Dzielnik nie może być zerem !");
			int g = in.nextInt();
			int h = in.nextInt();
			try {
				if(h == 0) { 
					System.out.println("Wynik: " + g/h);
				}
				System.out.println("Wynik: " + (double) g/h);
			} catch (ArithmeticException error) {
				error.getMessage();
				System.err.println("Nie można dzielić przez zero");
			}
			break;
		default:
			extracted();
		}
		in.close();
	}
	private static void extracted() throws UnknownOperatorExeception {
		throw new UnknownOperatorExeception("Niezdefiniowany typ operacji");
	}

}
