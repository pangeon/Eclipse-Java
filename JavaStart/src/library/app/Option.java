package library.app;

public enum Option {
	EXIT(0, "Wyjœcie z programu"),
	ADD_BOOK(1, "Dodanie ksi¹¿ki"),
	ADD_MAGAZINE(2, "Dodanie gazety/magazynu"),
	PRINT_BOOKS(3, "Wyœwietlenie wszystkich ksi¹¿ek"),
	PRINT_MAGAZINES(4, "Wyœwietlenie wszystkich gazet/magazynów");
	
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
	 /* Metoda createFromInt(int option), która pozwala przekszta³ciæ wartoœæ typu int na odpowiedni¹ 
	 * wartoœæ typu Option. Wykorzystujemy tutaj metodê values(), która zwraca tablicê wszystkich 
	 * wartoœci, a poniewa¿ kolejne elementy numerujemy od 0, to zwracamy po prostu odpowiedni 
	 * element tej tablicy. */
	public static Option createFromInt(int option) {
		return Option.values()[option];
	}
	
	
}
