package topic32.list;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		Benchmark test = new Benchmark();
		test.setStart();
		List<String> imiona = new LinkedList<>();
		imiona.add("Adam");
		imiona.add("Bartek");
		imiona.add("Stefan");
		imiona.add("Bonifacy");
		imiona.add("Cyryl");
		imiona.add("Zbigniew");
		imiona.add("Monika");
		imiona.add("Joanna");
		imiona.add("Waldek");
		imiona.add("Sabina");
		imiona.add("Mietek");
		System.out.println(imiona);
		imiona.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return -(o1.compareTo(o2));
			}
			
		});
		imiona.remove("Mietek");
		imiona.add(null);
		System.out.println(imiona);
		System.out.println("Ilość osób " + (imiona.size() - 1));
		while (imiona.get((int) (Math.random()*10)) != "Monika") {
			System.out.println("Witaj Monika");
		}
		imiona.clear();
		System.out.println(imiona);
		test.setEnd();
		test.printTime();
		

	}

}
