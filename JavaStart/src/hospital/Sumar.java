package hospital;

import java.util.Scanner;

public class Sumar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj ile liczb chcesz wprowadziæ");
		int a = sc.nextInt();
		int b = 0;
		
		for (int i = 0; i < a; i++) {
			System.out.print("Podaj liczbê nr " + (i+1) + ": ");
			b += sc.nextInt();
		}
		System.out.println("Suma liczb = " + b);
		sc.close();		
	}
}
