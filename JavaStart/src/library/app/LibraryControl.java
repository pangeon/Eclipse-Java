package library.app;

import library.data.Book;
import library.data.Library;
import library.data.Magazine;
import library.utils.DataReader;

public class LibraryControl {
	
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
		Option optionEnum;
		printOptions();
		while((optionEnum = Option.createFromInt(dataReader.getInt())) != Option.EXIT) {
			switch(optionEnum) {
			case ADD_BOOK:
				addBook();
				break;
			case ADD_MAGAZINE:
				addMagazine();
				break;
			case PRINT_BOOKS:
				printBooks();
				break;
			case PRINT_MAGAZINES:
				printMagazines();
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
		for (Option i_optionEnum : Option.values()) {
			System.out.println(i_optionEnum);
		}
	}
	private void addBook() {
		Book book = dataReader.readAndCreateBook();
		library.addBook(book);
	}
	private void addMagazine() {
		Magazine magazine = dataReader.readAndCreateMagazine();
		library.addMagazine(magazine);
	}

	private void printBooks() {
		library.printBooks();
	}
	private void printMagazines() {
		library.printMagazines();
	}
}
