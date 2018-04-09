package loop;

import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int number = (int) (Math.random()*100);
		int userInput;
		System.out.println("Zgadnij liczb�");
		
		while((userInput = reader.nextInt()) != number) {
			if(userInput > number) {
				System.out.println("Podana liczba jest za du�a, zgaduj dalej!");
			} else {
				System.out.println("Podana liczba jest za ma�a, zgaduj dalej!");
			}
		}
		
		System.out.println("Brawo, zgad�e� o jak� liczb� chodzi�o, wygrywasz z�ote kalesony");
		System.out.println("Ta liczba to : " + number);
		
		reader.close();
	}
}
