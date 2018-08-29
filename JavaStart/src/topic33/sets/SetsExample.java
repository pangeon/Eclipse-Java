package topic33.sets;

import java.util.TreeSet;

public class SetsExample {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>();
		tree.add("Adam");
		tree.add("Adam");
		tree.add("Bartek");
		tree.add("Joanna");
		System.out.println("Rozmiar " + tree.size());
		System.out.println("Pierwszy " + tree.first());
		System.out.println("Ostatni " + tree.last());
		System.out.println("Czy zawiera ciąg Adam ?"); 
				
			if(tree.contains("adam")) {
				System.out.println("Tak");
			} else {
				System.out.println("Nie");
			}
			for(String s : tree) {
				// pętla foreach niejawnie korzysta z Iteratora
				System.out.println(s);
			}
	}

}
