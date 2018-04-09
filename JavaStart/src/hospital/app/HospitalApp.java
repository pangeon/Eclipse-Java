package hospital.app;

import java.util.Scanner;

import hospital.data.Patient;
import hospital.logic.Hospital;

public class HospitalApp {
	public static final int EXIT = 0;
	public static final int ADD_PATIENT = 1;
	public static final int PRINT_PATIENTS = 2;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int option = -1;

		Hospital hospital = new Hospital();

		while (option != EXIT) {
			System.out.println("Dost�pne opcje: ");
			System.out.println("0 - wyj�cie z programu");
			System.out.println("1 - dodanie pacjenta");
			System.out.println("2 - wy�wietlenie listy pacjent�w");

			System.out.println("Wybierz opcj�: ");
			option = input.nextInt();
			input.nextLine();

			switch (option) {
			case ADD_PATIENT:
				Patient patient = new Patient();
				System.out.println("Imi�: ");
				patient.setFirstName(input.nextLine());
				System.out.println("Nazwisko: ");
				patient.setLastName(input.nextLine());
				System.out.println("PESEL: ");
				patient.setPesel(input.nextLine());
				hospital.addPatient(patient);
			break;
			case PRINT_PATIENTS:
				hospital.printPatients();
			break;
			case EXIT:
				System.out.println("Zamykam program!");
			break;
			default:
				System.out.println("Nie znaleziono takiej opcji");
			}
		}
		
		input.close();
	}
}