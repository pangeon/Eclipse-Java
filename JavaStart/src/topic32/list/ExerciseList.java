package topic32.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		// try with resource nie trzeba zamykać metodami scanner'a
		try (Scanner in = new Scanner(System.in);
		)
		 {
			readDataFromList(list, in);
		 }
		calculateAndPrint(list);
		
	}
	public static void readDataFromList(ArrayList<Integer> list, Scanner in) {
		System.out.println("Podaj kolejny czynnik lub zakończ (polecenie exit)");
		String s = in.nextLine();
		if(s.equals("exit")) {
			return ;
		}
		try {
			Integer d = Integer.parseInt(s);
			list.add(d);
		} catch(NumberFormatException e) {
			System.err.println("Liczba w niepoprawnym formacie");
		}
		readDataFromList(list, in);
	}
	public static void calculateAndPrint(ArrayList<Integer> list) {
		StringBuilder builder = new StringBuilder();
		int mult = 1; // przy mnożeniu zaczynamy od jedynki
		for(Integer i : list) {
			builder.append(i);
			builder.append(" * ");
			mult *= i; // ta linijka odpowiada za działania matematyczne, reszta odpowiada za interakcję
					  // z użytkownikiem
		}
		try {
		// przy wpisaniu (exit - 3) przekraczamy długość słowa
		builder.replace(builder.length() - 3, builder.length(), " = ");
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("Program zakończył działanie bez wykonywania żadnych operacji.");
		}
		builder.append(mult);
		System.out.println(builder.toString());
	}

}
