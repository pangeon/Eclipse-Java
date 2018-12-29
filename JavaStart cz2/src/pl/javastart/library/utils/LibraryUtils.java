package pl.javastart.library.utils;

import pl.javastart.library.data.Book;
import pl.javastart.library.data.Library;
import pl.javastart.library.data.Magazine;

/**
 - lib.getPublications().values().stream() - zwraca strumień utworzony na podstawie zbioru wartości zwróconego przez
 metodę values() mapy publikacji z klasy Library.

 - isInstance() klasy Class. Jest to klasa, która pozwala pozwala uzyskać informację o klasie (nie obiekcie klasy),
 czyli np. ile dana klasa ma metod, konstruktorów, jaka jest jej nazwy itp. Metoda isInstance() sprawdza, czy
 obiekt przekazany jako argument jest obiektem tej klasy.

 Dwa poniższe zapisy są sobie równoważne:
 ----------------------------------------
 .filter(Magazine.class::isInstance)
 .filter(x -> x instanceof Magazine)
 - Strumień chcemy posortować, a można to zrobić wywołując na nim metodę sorted(new Library.AlphabeticalComparator()).
 Jej argumentem może być obiekt komparatora lub funkcja dwuargumentowa (BiFunction), która porówna ze sobą dwa argumenty.

 Drugiego sposobu użyliśmy przy porównywaniu użytkowników według nazwisk wywołując:
 .sorted((a, b) -> a.getLastName().compareTo(b.getLastName())).

 */

public class LibraryUtils {

	/*
	Problem powtarzalności kodu nadal jednak występuje między metodami printBooks() i printMagazines() - wydzielmy jedną
	prywatną metodę printPublications(), która będzie bardziej uniwersalna i wywołujmy ją z dwóch wcześniej wymienionych
	metod z odpowiednimi parametrami.
	 */

	/*
	stara wersja kodu
	-------------------
	public static void printBooks(Library lib) {
		long countBooks = lib.getPublications().values().stream().filter(Book.class::isInstance)
				.sorted(new Library.AlphabeticalComparator()).peek(System.out::println).count();

		if(countBooks == 0) {
			System.out.println("Brak książek w bibliotece.");
		}
	}

	public static void printMagazines(Library lib) {
		long countMagazines = lib.getPublications().values().stream()
				.filter(Magazine.class::isInstance).sorted(new Library.AlphabeticalComparator())
				.peek(System.out::println).count();

		if(countMagazines == 0) {
			System.out.println("Brak magazynów w bibliotece");
		}
	}
	*/

	//nowa wersja kodu
	public static void printBooks(Library lib) {
		printPublications(lib, Book.class);
	}
	public static void printMagazines(Library lib) {
		printPublications(lib, Magazine.class);
	}
	private static void printPublications(Library lib, Class cl) {
		long countPublications = lib.getPublications().values().stream()
				.filter(cl::isInstance).sorted(new Library.AlphabeticalComparator())
				.peek(System.out::println).count();

		if(countPublications == 0) {
			System.out.println("W bibliotece nie znaleziono publikacji typu: " + cl.getSimpleName());
		}
	}


	public static void printUsers(Library lib) {
		lib.getUsers().values().stream()
				.sorted((o1, o2) -> o1.getLastName().compareTo(o2.getFirstName()))
				.forEach(System.out::println);
	}
}
