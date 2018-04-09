package table;

import java.util.Arrays;

/*
 * Napisz program, w którym zadeklarujesz dwie tablice typu ca³kowitoliczbowego, które bêd¹ przechowywa³y 
 * po 3 dowolne liczby typu int. Program powinien wyœwietliæ sumê wszystkich liczb z obu tablic.
 */
public class App {

	public static void main(String[] args) {
		int[] tab1 = new int[3];
		tab1[0] = 1;
		tab1[1] = 4;
		tab1[2] = 7;
		
		long[] tab2 = {(int) 3, (int) 4, (int) 5};
		
		// konkatenacja na wy¿szy priorytet ni¿ dodawanie, potrzebne s¹ nawiasy
		System.out.println("Suma = " + (tab1[0] + tab1[1] + tab1[2] + tab2[0] + tab2[1] + tab2[2]));
		
		String[] firstNames = {"Karol", "Basia", "Kasia"};
        String[] lastNames = {"Kowalski", "Nowakowska", "Wadecka"};
         
        String[][] firstLast = {firstNames, lastNames};
         
        System.out.println("Pierwsza osoba to: ");
        System.out.println(firstLast[0][0] + " " + firstLast[1][0]);
        System.out.println("Druga osoba to: ");
        System.out.println(firstLast[0][1] + " " + firstLast[1][1]);
        System.out.println("Trzecia osoba to: ");
        System.out.println(firstLast[0][2] + " " + firstLast[1][2]);
        
        String names[][] = new String[3][];
        names[0] = new String[3];
        names[1] = new String[2];
        names[2] = new String[1];
        
        names[0][0] = "Ana";
        names[0][1] = "Ola";
        names[0][2] = "Koksik";
        
        names[1][0] = "Kusy";
        names[1][1] = "Milka";
        
        names[2][0] = "Roxa";
        
        System.out.print(Arrays.deepToString(names));
        

	}

}
