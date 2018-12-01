package pl.javastart.library.app;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import pl.javastart.library.data.Book;
import pl.javastart.library.data.Library;
import pl.javastart.library.data.LibraryUser;
import pl.javastart.library.data.Magazine;
import pl.javastart.library.utils.DataReader;
import pl.javastart.library.utils.FileManager;
import pl.javastart.library.utils.LibraryUtils;

public class LibraryControl {
	
	// zmienna do komunikacji z użytkownikiem
	private DataReader dataReader;
	private FileManager fileManager;
	
	// "biblioteka" przechowująca dane
	private Library library;
	
	public LibraryControl() {
		dataReader = new DataReader();
		//library = new Library();
		fileManager = new FileManager();
		try {
			library = fileManager.readLibraryFromFile();
			System.out.println("Wczytano dane z biblioteki pliku.");
		} catch (ClassNotFoundException e) {
			library = new Library();
			System.out.println("Utworzono nową bazę biblioteki.");
		} catch(IOException e) {
			library = new Library();
			System.out.println("Utworzono nową bazę biblioteki.");
		}
	}
	
	/*
	 * Główna pętla programu, która pozwala na wybór opcji i interakcji
	 */
	public void controlLoop() {
		Option option = null;
		while (option != Option.EXIT) {
			try {
				printOptions();
				option = Option.createFromInt(dataReader.getInt());
				switch (option) {
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
					case ADD_USER:
						addUser();
						break;
					case PRINT_USERS:
						printUsers();
						break;
					case EXIT:
						exit();
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
	private void addUser() {
		LibraryUser user = dataReader.readAndCreateLiblaryUser();
		library.addUser(user);
	}
	private void printUsers() {
		LibraryUtils.printUsers(library);
	}

	private void exit() {
    	fileManager.writeLibraryToFile(library);
    }
	/*prywatna klasa wenętrzna*/
	private enum Option {
		EXIT(0, "Wyjście z programu"),
		ADD_BOOK(1, "Dodanie książki"),
		ADD_MAGAZINE(2, "Dodanie gazety/magazynu"),
		PRINT_BOOKS(3, "Wyświetlenie wszystkich książek"),
		PRINT_MAGAZINES(4, "Wyświetlenie wszystkich gazet/magazynów"),
		ADD_USER(5, "Dodanie nowego użytkownika"),
		PRINT_USERS(6, "Wyświetlenie listy użytkowników.");

		private int value;
		private String description;
		
		Option(int value, String description) {
			this.value = value;
			this.description = description;
		}
		@Override
		public String toString() {
			return value + "-" + description;
		}
		 /* Metoda createFromInt(int option), która pozwala przekształcić wartość typu int na odpowiednią 
		 * wartość typu Option. Wykorzystujemy tutaj metodą values(), która zwraca tablicę wszystkich 
		 * wartości, a ponieważ kolejne elementy numerujemy od 0, to zwracamy po prostu odpowiedni 
		 * element tej tablicy. */
		public static Option createFromInt(int option) throws NoSuchElementException {
			Option result = null;
			try {
				result = Option.values()[option];
			} catch (ArrayIndexOutOfBoundsException e) {
				throw new NoSuchElementException("Brak elementu o wskazanym ID");
			}
			return result;
			
		}
	}
}
