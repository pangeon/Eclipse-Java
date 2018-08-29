package topic29.generics;

public class Run {

	public static void main(String[] args) {
		/* KLASA Z TYPEM OBJECT */
		System.out.println("");
		Container table = new Container();

		table.setArray(new Object[5]);
		table.getArray()[0] = 5;
		table.getArray()[1] = "Napis";
		
		// konieczne rzutowanie, nie wiem co otrzymam za typ
		Integer nums = (Integer) table.get(0);
		String strs = (String) table.get(1);
		System.out.println(nums + " " + strs);
		
		table.printObjects();
		
		/* KLASA Z TYPEM GENERYCZNYM */
		System.out.println("");
		ContainerGen<Object> table_gen = new ContainerGen<Object>();
		
		table_gen.setArray(new Object[5]);
		table_gen.getArray()[0] = 5;
		table_gen.getArray()[1] = "Napis";
		table_gen.printObjects();
		
		System.out.println("");
		ContainerGen<Integer> integers = new ContainerGen<Integer>();
		integers.setArray(new Integer[5]);
		integers.getArray()[0] = 5;
		// integers.getArray()[1] = "Napis"; (niezgodny typ)
		integers.printObjects();
		
		System.out.println("");
		ContainerGen<String> strings = new ContainerGen<String>();
		strings.setArray(new String[5]);
		//strings.getArray()[0] = 5; (niezgodny typ)
		strings.getArray()[1] = "Napis";
		strings.getArray()[2] = "Ania";
		strings.getArray()[3] = "Basia";
		
		// unikam rzutowania - wiadomo jaki obiekt otrzymam
		Integer num = integers.get(0);
		String str = strings.get(2);
		System.out.println(num + " " + str);
		
		strings.printObjects();
		
		print5Times(strings.get(3));
		System.out.println();
		Pair<Integer, Boolean> p2 = new Pair<>(5, false);
		Pair<Double, Double> p3 = new Pair<>(20.5, 31.7);
		Pair<String, String> p4 = new Pair<>("Jan", "Kowalski");
		
		Pair.printPair(p2);
		Pair.printPair(p3);
		Pair.printPair(p4);
		
	}
	public static <T> void print5Times(T arg) {
		System.out.println("");
		for(int i=0; i<5; i++)
			System.out.print(arg + " <-> ");
	}
}
