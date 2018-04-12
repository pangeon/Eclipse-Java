package topic15.unisys;


/**
Utw�rz program sk�adaj�cy si� z dw�ch klas:

Student - pozwala przechowywa� informacj� o imieniu, nazwisku i numerze indeksu studenta
University - klasa z metod� main, w kt�rej utworzysz kilku (co najmniej 2 student�w)

W klasie Student zdefiniuj zmienn� statyczn�, kt�ra wraz z tworzeniem nowego obiektu tej klasy 
b�dzie zwi�kszana, a tym samym pozwoli �ledzi� ilo�� student�w na uczelni.

Po utworzeniu co najmniej dw�ch student�w w klasie university, wy�wietl liczb� student�w na uczelni.
*/

public class University {
	public static void main(String[] args) {
		Student[] students = new Student[2];
		students[0] = new Student("Kamil", "Cecherz", 82739);
		students[1] = new Student("�ukasz", "Bednarski", 83312);
		students[0].printAll();
		students[1].printAll();
		
		Student student3 = new Student("Julita", "Sobieraj", 76512);
		Student student4 = new Student("Dominik", "Gawrych", 86818);
		student3.printAll();
		student4.printAll();
		
	}

}
