package library.app;

import library.data.Book;
import library.data.Library;
import library.utils.DataReader;

public class LibraryControl {
	// zmienne do kontrolowania programu
	public final int EXIT = 0;
	public final int ADD = 1;
	public final int PRINT = 2;
	
	// zmienna do komunikacji z u¿ytkownikiem
	private DataReader dataReader;
	
	// "biblioteka" przechowuj¹ca dane
	private Library library;
	
	public LibraryControl() {
		dataReader = new DataReader();
		library = new Library();
	}
	
	/*
	 * G³ówna pêtla programu, która pozwala na wybór opcji i interakcjê
	 */
	public void controlLoop() {
		int option;
		printOptions();
		while((option = dataReader.getInt()) != EXIT) {
			switch(option) {
			case ADD:
				addBook();
				break;
			case PRINT:
				printBooks();
				break;
			default:
				System.out.println("Nie ma takiej opcji, wprowadŸ ponownie: ");
				
			}
			printOptions();	
		}
		// zamykamy strumieñ wejœcia
		dataReader.close();
		
	}
	private void printOptions() {
		System.out.println("Wybierz opcjê: ");
		System.out.println("0 - wyjœcie z programu");
		System.out.println("1 - dodanie nowej ksi¹¿ki");
		System.out.println("2 - wyœwietl dostêpne ksi¹¿ki");
	}
	private void addBook() {
		Book book = dataReader.readAndCreateBook();
		library.addBook(book);
	}

	private void printBooks() {
		library.printBooks();
	}
}
