package stringtest;

import java.util.Arrays;

public class StringsTest {

	public static void main(String[] args) {
		long time1, time2;
		long startTime = System.nanoTime();
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			builder.append(i);
			builder.append(" ");
			
		}
		//String numbers = builder.toString();
		
		time1 = System.nanoTime() - startTime;
		
		System.out.println("Czas pierwszy: " + time1);
		//System.out.println(numbers);
		
		startTime = System.nanoTime();
		String numbers2 = "";
		for(int i=0; i<10000; i++) {
			numbers2 = numbers2 + i + " ";
		}
		
		time2 = System.nanoTime()-startTime;
		
		System.out.println("Czas drugi: " + time2);
		//System.out.println(numbers2);
		
		System.out.println("Różnica czasów: " + time2/time1);
		
		String words = "jeden dwa trzy cztery pięć sześć siedem ";
		System.out.println(words);
		
		System.out.println("words.substring(2, 7)"); 
		// od trzeciej do ósmej litery bez tej ostatniej 
		String sub1 = words.substring(2, 7);
		System.out.println(sub1);
		
		System.out.println("words.replaceAll(\"dwa\", \"hehe\")");
		String sub2 = words.replaceAll("dwa", "hehe");
		// zastępuje ciąg na inny ciąg (spacja to też ciąg !)
		System.out.println(sub2);
		
		System.out.println("words.trim()");
		String sub3 = words.trim();
		// usuwa białe znaki z początku i końca napisu
		System.out.println(sub3);
		
		System.out.println("words.charAt(2)");
		char charat = words.charAt(2);
		// pobiera trzeci znak, bo liczmy od zera
		System.out.println(charat);
		
		System.out.println("words.split()");
		String sub4[] = words.split(" ");
		// tworzy tablicę napisów z napisu (coś musi oddzielać napisy wyr. reg) 
		System.out.println(Arrays.toString(sub4));
	}

}
