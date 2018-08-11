package topic26.files.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class CompanyFactory {
	public void createCompanyGroup(String companyName, int amountWorker) {
		try (
			Scanner in = new Scanner(System.in);
			FileOutputStream fos = new FileOutputStream(companyName);
			ObjectOutputStream oos = new ObjectOutputStream(fos)
			) {
			Company comarch = new Company(amountWorker);
				
			for (int i = 0; i < amountWorker; i++) {
				System.out.println("Wprowadź imię: ");
				String name = in.nextLine();
				System.out.println("Wprowadź nazwisko: ");
				String surname = in.nextLine();
				System.out.println("Określ wysokość wypłaty: ");
				double salary = in.nextDouble();
				in.nextLine();
				comarch.addWorker(new Employee(name, surname, salary), i);
			}
				oos.writeObject(comarch);
			} catch(FileNotFoundException e) {
				e.printStackTrace();
			} catch(IOException e) {
				e.printStackTrace();
			}
	}
	public void readCompanyGroup(String companyName, int amountWorker) {
		try (FileInputStream fis = new FileInputStream(companyName);
				ObjectInputStream ois = new ObjectInputStream(fis)
				) {
				Company readComarch = (Company) ois.readObject();
				for (int i = 0; i < amountWorker; i++) {
					System.out.println(readComarch.getEmployeeGroup()[i]);
				}
			} catch(FileNotFoundException e) {
				e.printStackTrace();
			} catch(IOException e) {
				e.printStackTrace();
			} catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
	}
}
