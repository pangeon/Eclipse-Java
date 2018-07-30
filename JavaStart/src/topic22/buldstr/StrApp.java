package topic22.buldstr;

import java.util.Arrays;
import java.util.Scanner;

public class StrApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Podaj liczbę wyrazów, które chcesz wprowadzić.");
		int strNum = in.nextInt();
		in.nextLine();
		
		String strSeq[] = new String[strNum];
		
		for (int i = 0; i < strNum; i++) {
			strSeq[i] = in.nextLine();
		}
		System.out.println("Tablica słów: " + Arrays.toString(strSeq));
		
		
		StringBuilder strBuild = new StringBuilder();
		for (int i = 0; i < strNum; i++) {
			strBuild.append(strSeq[i].charAt(strSeq[i].length() - 1));
		}
		System.out.println("Nowe słowo: " + strBuild.toString());
		
		in.close();
		

	}

}
