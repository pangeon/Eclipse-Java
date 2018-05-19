package topic19.computershop;

/*
 *     
    NotebookShop - klasa z metod� main. Utw�rz w niej co najmniej 5 laptop�w i dodaj je do bazy sklepu. 
    Co najmniej 2 komputery musz� by� takie same. Dla powtarzaj�cego si� egzemplarza sprawd� 
    dzia�anie metody checkAvailability(), a na ko�cu wy�wietl wszystkie notebooki dost�pne w sklepie

Ograniczenia: w sklepowym magazynie jest miejsce na maksymalnie 100 komputer�w.

 */

public class NotebookShop {

	public static void main(String[] args) {
		DataStore computers = new DataStore();
		computers.add("Asus", 3200);
		computers.add("Asus", 3200);
		computers.add("Lenovo", 140);
		computers.add("Apple", 3);
		computers.add("Sony", 900);
		
		computers.toString();
		Computer asus = new Computer("Asus", 3200);
		
		computers.checkAvailability(asus);
		
		System.out.println(computers);
		computers.printContent();
	}
}
