package library.app;

import library.data.Book;
import library.data.Library;
import library.data.Magazine;
import library.utils.DataReader;

public class LibraryControl {
	
	// zmienna do komunikacji z u�ytkownikiem
	private DataReader dataReader;
	
	// "biblioteka" przechowuj�ca dane
	private Library library;
	
	public LibraryControl() {
		dataReader = new DataReader();
		library = new Library();
	}
	
	/*
	 * G��wna p�tla programu, kt�ra pozwala na wyb�r opcji i interakcj�
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
				System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
			}
			printOptions();	
		}
		// zamykamy strumie� wej�cia
		dataReader.close();
		
	}
	private void printOptions() {
		System.out.println("Wybierz opcji: ");
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
