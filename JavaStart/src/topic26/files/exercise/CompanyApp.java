package topic26.files.exercise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CompanyApp {

	public static void main(String[] args) {
		String companyName = "Comarch.obj";
		
		/* Zapis */
		try (FileOutputStream fos = new FileOutputStream(companyName);
			ObjectOutputStream oos = new ObjectOutputStream(fos)
			) {
			Company comarch = new Company(3);
			comarch.setEmployeeGroup(0, "Adam", "Kowacz", 4320.88);
			comarch.setEmployeeGroup(1, "Maria", "Rubień", 9920.48);
			comarch.setEmployeeGroup(2, "Robert", "Ptah", 3515.22);
			oos.writeObject(comarch);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		/* Odczyt */
	}
}
