package topic32.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrTest {
	public static void main(String[] args) {
		Integer[] intsFib = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ,233, 377, 610, 987, 1597, 2584, 4181};
	
		List<Integer> fibList = Arrays.asList(intsFib);
		// List<Integer> fibList = List.of(5, 10, 15); dostępne od Java 9
		fibList.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return -(o1.compareTo(o2));
			}
			
		});
		for(Integer num : fibList) {
			System.out.print(num + " ");
		}
		
	}
}
