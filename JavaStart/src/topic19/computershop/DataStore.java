package topic19.computershop;

import java.util.Arrays;

/*
 * DataStore - klasa przechowuje informacje o notebookach w tablicy. Pozwala na dodanie kolejnego 
   komputera do bazy poprzez metod� add() oraz wy�wietlenie informacji o wszystkich notebookach. 
   Powinna r�wnie� istnie� metoda checkAvailability(), kt�ra jako parametr przyjmuje obiekt 
   klasy Computer i zwraca ilo�� identycznych komputer�w w sklepie.
 */
public class DataStore {
	
	public final int LIMIT_OF_COMPUTER = 100;
	private static int nextNum = 1;
	private int compNum = 0;
	private Computer[] laptops = new Computer[LIMIT_OF_COMPUTER];
		
	public void add(String producerName, int modelNum) {		
		laptops[compNum] = new Computer(producerName, modelNum);
		compNum = nextNum;
		nextNum++;
	}
	public Computer[] getLaptops() {
		return laptops;
	}
	@Override
	public String toString() {
		return "DataStore [getLaptops()=" + Arrays.toString(getLaptops()) + "]";
	}
	public void checkAvailability(Computer obj) {
		int num = 0;
		for (int i = 0; i < laptops.length-1; i++) {
			if(obj.equals(laptops[i])) {
				num++;	
			}
		}
		System.out.println("Ilo�� identycznych komputer�w: " + num);
	}
	public void printContent() {
		for (int i = 0; i < laptops.length-1; i++) {
			if(laptops[i] != null) {
				System.out.println(laptops[i]);
			}
		}
	}
}
