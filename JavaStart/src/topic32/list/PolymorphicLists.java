package topic32.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PolymorphicLists {

	public static void main(String[] args) {
		Benchmark testLinkedList = new Benchmark();
		Benchmark testArrayList = new Benchmark();
		List<Integer> ints1 = new LinkedList<>();
		List<Integer> ints2 = new ArrayList<>();
		
		testLinkedList.setStart();
		for(int i=0; i<10000000; i++) {
			ints1.add(i);
		}
		testLinkedList.setEnd();
		
		testArrayList.setStart();
		for(int i=0; i<10000000; i++) {
			ints2.add(i);
		}
		testArrayList.setEnd();
		// arayList dodaje szybciej elementy
		
		System.out.println("Lista 1 czas dodawania elementów");
		testLinkedList.printTime();
		//printList(ints1);
		System.out.println();
		System.out.println("Lista 2 czas dodawania elementów");
		testArrayList.printTime();
		//printList(ints2);
		
	}
	
	
	static void printList(List<Integer> list) {
		for(Integer n: list) {
			System.out.print(n + " ");
		}
	}
}
