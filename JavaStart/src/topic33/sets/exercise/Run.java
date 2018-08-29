package topic33.sets.exercise;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * W załączonym pliku namespl.txt znajduje się lista imiona, każde w nowej linii. 
 * Problem w tym, że imiona się powtarzają, a my w programie będziemy potrzebowali jedynie 
 * unikalnej listy dostępnych imion. Dodatkowo chcielibyśmy, aby imiona były automatycznie 
 * posortowane w kolejności odwrotnej niż alfabetyczna.

 * Po wybraniu odpowiedniego zbioru danych wyświetl na ekranie ilość imion w zbiorze, a także pierwszy 
 * i ostatni element.

 * Podpowiedź: wykorzystaj konstruktor odpowiedniego zbioru, który jako parametr przyjmuje obiekt 
 * komparatora. Wykorzystaj anonimową klasę wewnętrzną lub klasyczną klasę wewnętrzną do 
 * zdefiniowania odpowiedniego komparatora.
 */
public class Run {

	public static void main(String[] args) {
		
		System.out.println("Podaj nazwę pliku do wczytania.");
		Scanner in = new Scanner(System.in);
		String OPERATION = in.nextLine();
			try {
				FileUtils.fileReader(OPERATION);
			} catch (FileNotFoundException e) {
				System.err.println("Nie odnaleziono takiego pliku.");
				e.printStackTrace();
			} catch (IOException e) {
				System.err.println("Błąd odczytu.");
				e.printStackTrace();
			}
			in.close();
		}

	}
