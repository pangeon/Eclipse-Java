package topic33.sets;

import java.util.HashSet;

public class PersonSet {

	public static void main(String[] args) {
		HashSet<Object> map = new HashSet<>();
		map.add(new Person("Jan", "Kowalski"));
		map.add(new Person("Marian", "Branicki"));
		map.add(new Person("Zuzanna", "Trzmiel"));
		map.add(new Person("Izabela", "Aścik")); // Hashcode: -2076450844
		map.add(new Person("Małgorza", "Trela"));
		
		
		System.out.println("Rozmiar: " + map.size());
		System.out.println("Czy zwiera \"Jan Kowalski\" ? " + map.contains(new Person("Jan", "Kowalski")));
		map.remove(new Person("Izabela", "Aścik")); // obiekt identyfikuje hascode
		System.out.println("Rozmiar: " + map.size());
		
		Person p = new Person("Izabela", "Aścik"); // Hashcode: -2076450844

			if(!(p == new Person("Izabela", "Aścik"))) {
				System.out.println("Obiekty są identyczne i równe");
				System.out.println("Hashcode Izabela Aścik (obiekt): " + p.hashCode());
				System.out.println("Hashcode Izabela Aścik: " + new Person("Izabela", "Aścik").hashCode());
			} 
			if(p.equals(new Person("Izabela", "Aścik"))) {
				System.out.println("Obiekty są identyczne.");
			}
		for (Object o : map) {
			System.out.println(o.toString());
		}
			
			
		
	
		

	}

}
