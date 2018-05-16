package library.app;

import library.data.Book;
import library.data.Library;
import library.data.Magazine;
import library.utils.DataReader;

public class LibraryControl {
	// zmienne do kontrolowania programu
	public static final int EXIT = 0;
	public static final int ADD_BOOK = 1;
	public static final int ADD_MAGAZINE = 2;
	public static final int PRINT_BOOKS = 3;
	public static final int PRINT_MAGAZINES = 4;
	
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
		int option;
		printOptions();
		while((option = dataReader.getInt()) != EXIT) {
			switch(option) {
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
				System.out.println("Nie ma takiej opcji, wprowad� ponownie: ");
			}
			printOptions();	
		}
		// zamykamy strumie� wej�cia
		dataReader.close();
		
	}
	private void printOptions() {
		System.out.println("Wybierz opcj�: ");
		System.out.println(EXIT + " - wyj�cie z programu");
		System.out.println(ADD_BOOK + " - dodanie nowej ksi��ki");
		System.out.println(ADD_MAGAZINE + " - dodanie nowego magazynu");
		System.out.println(PRINT_BOOKS + " - wy�wietl dost�pne ksi��ki");
		System.out.println(PRINT_MAGAZINES + " - wy�wietl dost�pne magazyny");
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
