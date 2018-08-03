package library.app;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import library.data.Book;
import library.data.Library;
import library.data.Magazine;
import library.utils.DataReader;
import library.utils.LibraryUtils;

public class LibraryControl {
	
	// zmienna do komunikacji z użytkownikiem
	private DataReader dataReader;
	
	// "biblioteka" przechowująca dane
	private Library library;
	
	public LibraryControl() {
		dataReader = new DataReader();
		library = new Library();
	}
	
	/*
	 * Główna pętla programu, która pozwala na wybór opcji i interakcji
	 */
	public void controlLoop() {
		Option option = null;
				
		while(option != Option.EXIT) {
			try {
				printOptions();
				option = Option.createFromInt(dataReader.getInt());
				
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
				case EXIT:
					;
				}
			} catch(InputMismatchException e) {
				System.out.println("Wprowadzono niepoprawne dane, publikacji nie dodano");
			} catch(NumberFormatException | NoSuchElementException e) {
				System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
			}

		}
		// zamykamy strumień wejścia
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
		LibraryUtils.printBooks(library);
	}
	private void printMagazines() {
		LibraryUtils.printMagazines(library);
	}
}
