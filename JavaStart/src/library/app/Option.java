package library.app;

import java.util.NoSuchElementException;

public enum Option {
	EXIT(0, "Wyjście z programu"),
	ADD_BOOK(1, "Dodanie książki"),
	ADD_MAGAZINE(2, "Dodanie gazety/magazynu"),
	PRINT_BOOKS(3, "Wyświetlenie wszystkich książek"),
	PRINT_MAGAZINES(4, "Wyświetlenie wszystkich gazet/magazynów");
	
	private int value;
	private String description;
	
	public int getValue() {
		return value;
	}
	public String getDescription() {
		return description;
	}
	private Option(int value, String description) {
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
