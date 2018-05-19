package topic19.computershop;

/*
 *     
    NotebookShop - klasa z metod¹ main. Utwórz w niej co najmniej 5 laptopów i dodaj je do bazy sklepu. 
    Co najmniej 2 komputery musz¹ był takie same. Dla powtarzaj¹cego siê egzemplarza sprawdŸ 
    dzia³anie metody checkAvailability(), a na koñcu wyœwietl wszystkie notebooki dostêpne w sklepie

Ograniczenia: w sklepowym magazynie jest miejsce na maksymalnie 100 komputerów.

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
