package topic15.unisys;


/**
Utwórz program sk³adaj¹cy siê z dwóch klas:

Student - pozwala przechowywaæ informacjê o imieniu, nazwisku i numerze indeksu studenta
University - klasa z metod¹ main, w której utworzysz kilku (co najmniej 2 studentów)

W klasie Student zdefiniuj zmienn¹ statyczn¹, która wraz z tworzeniem nowego obiektu tej klasy 
bêdzie zwiêkszana, a tym samym pozwoli œledziæ iloœæ studentów na uczelni.

Po utworzeniu co najmniej dwóch studentów w klasie university, wyœwietl liczbê studentów na uczelni.
*/

public class University {
	public static void main(String[] args) {
		Student[] students = new Student[2];
		students[0] = new Student("Kamil", "Cecherz", 82739);
		students[1] = new Student("£ukasz", "Bednarski", 83312);
		students[0].printAll();
		students[1].printAll();
		
		Student student3 = new Student("Julita", "Sobieraj", 76512);
		Student student4 = new Student("Dominik", "Gawrych", 86818);
		student3.printAll();
		student4.printAll();
		
	}

}
