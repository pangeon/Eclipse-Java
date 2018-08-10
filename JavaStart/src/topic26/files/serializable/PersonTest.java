package topic26.files.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PersonTest implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private transient String firstName;
	private String lastName;
	
	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) { this.firstName = firstName; }
	public String getLastName() { return lastName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	
	public PersonTest(String firstName, String lastName) { 
		setFirstName(firstName);
		setLastName(lastName);
	}
	public static void main(String[] args) {
		String fileName = "person.obj";
		PersonTest p1 = new PersonTest("Kamil", "Cecherz");
		
		try (
			FileOutputStream fs = new FileOutputStream(fileName);
			ObjectOutputStream os = new ObjectOutputStream(fs);
			) {
			os.writeObject(p1);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Zapisano obiekt do pliku");
		
		PersonTest p2 = null;
		
		try (
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			) {
			p2 = (PersonTest) ois.readObject();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		if(p2 != null) {
			System.out.println("Wczytano dane o: ");
			System.out.println(p1.getFirstName() + " " + p1.getLastName());
		}
		
	}
}
