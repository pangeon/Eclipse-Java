package topic26.files.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyApp {

	public static void main(String[] args) {
		CompanyFactory companyFactory = new CompanyFactory();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Określ nazwę firmy");
		String companyName = in.nextLine();
		
		System.out.println("Określ liczbę pracowników grupy");
		int amountWorkers = in.nextInt();
		in.nextLine();
		System.out.println("Zdefiniuj rodzaj operacji - [write] lub [read]");
		String operation = in.nextLine();
		
		switch (operation) {
		case "write":
			try {
			companyFactory.createCompanyGroup(companyName + ".obj", amountWorkers);
			} catch(InputMismatchException e) {
				System.out.println("Nieprawidłowy format danych");
				System.out.println("Być może użyłeś [.] zamiast [,]");
			}
			System.out.println("Operacja zapisu zakończona.");
			break;
		case "read":
			try {
				companyFactory.readCompanyGroup(companyName + ".obj", amountWorkers);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Ta firma nie ma " + amountWorkers + " pracowników");
			}
			break;
		default:
			System.out.println("Błąd programu lub niepoprawna instrukcja.");
			System.out.println("Zacznij ponownie");
		}
		in.close();
	}
}
