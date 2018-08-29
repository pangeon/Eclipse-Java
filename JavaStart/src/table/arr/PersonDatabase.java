package table.arr;

import java.util.Arrays;

/*
 * 
    add(Person p) - dodaje nową osobę na pierwsze, wolne miejsce w tablicy. W przypadku, 
    gdy wszystkie elementy tablicy są zapełnione, tablica powinna powiększyć swój rozmiar dwukrotnie
    
    remove(Person p) - usuwa z tablicy osobę, przekazaną jako parametr (dla której metoda equals() 
    zwróci true). Puste miejsce powinno być "usunięte" poprzez przesunięcie wszystkich 
    elementów tablicy o indeksach większych o jedno miejsce wstecz
    
    get(int index) - zwraca element tablicy o indeksie podanym jako parametr
    
    size() - zwraca ilość aktualnie przechowywanych elementów w tablicy (nie liczy wartości null)
 */
public class PersonDatabase {
	private Person[] person;
	private int startIndex;

	public PersonDatabase() {
		person = new Person[1];
		startIndex = 0;
	}
	public void add(Person p) {
		if(startIndex == person.length) {
			person = Arrays.copyOf(person, person.length*2);
		}
		person[startIndex] = p;
		startIndex++;
	}
	public void remove(Person p) {
		if (p == null)
			return;

		final int NOT_FOUND = -1;
		int found = NOT_FOUND;
		int i = 0;
		while (i < person.length && found == NOT_FOUND) {
			if (p.equals(person[i])) {
				found = i;
			} else {
				i++;
			}
		}

		if (found != NOT_FOUND) {
			System.arraycopy(person, found + 1, person, found, person.length - found - 1);
			startIndex--;
		}
	}
	public Person get(int index) throws ArrayIndexOutOfBoundsException {
		if (index >= startIndex || index < 0) {
			throw new ArrayIndexOutOfBoundsException("Błędny parametr");
		}
		return person[index];
	}
	public int size() {
		return startIndex;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonsDatabase size: " + size());
		builder.append("\n");
		for (int i = 0; i < startIndex; i++) {
			builder.append(person[i].toString());
			builder.append("\n");
		}
		return builder.toString();
	}
	
	
	
	
	
	
}
