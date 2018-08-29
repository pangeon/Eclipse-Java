package table.arr;

public class ArraysCopyExample {
	public static void main(String[] args) {
		int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int[] numbers2 = new int[numbers1.length];
		int[] numbers3 = new int[numbers1.length];
		
		System.arraycopy(numbers1, 4, numbers2, 0, numbers1.length-4);
		System.arraycopy(numbers1, 0, numbers3, 0, numbers1.length-4);
		
		for(int num: numbers2) {
			System.out.print(num + " ");
		}
		System.out.println();
		for(int num: numbers3) {
			System.out.print(num + " ");
		}
	}
}
/*
 * Statyczna metoda System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
 * przyjmuje 5 parametrów:

   -tablicę źródłową (src)
   -indeks od którego chcemy skopiować elementy z tablicy źródłowej (srcPos)
   -tablicę, do której kopiujemy (dest)
   -indeks od którego mają być wstawiane skopiowane elementy w tablicy wynikowej (destPos)
   -ilość elementów do skopiowania (length)
*/
