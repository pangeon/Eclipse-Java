package topic26.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HTMLCreator {
	
	private static BufferedReader bufferedReader;
	//private static BufferedWriter bufferedWriter;
	//(ten sposób nie działa metoda nie działa)
	
	static void HTMLReader(String siteName) throws FileNotFoundException {
		File site = new File(siteName);
		
		Scanner in = new Scanner(site);
		
		int lines = 0;
		
		while(in.hasNext()) {
			String line = in.nextLine();
			System.out.println(line);
			lines++;
		}
		System.out.println("Ilość wierszy w pliku: " + lines);
		in.close();
	}
	static void HTMLFile(String webPageName) {
		File webPage = new File(webPageName);
		
		boolean pageExist = webPage.exists();
		
		if(!pageExist) {
			try {
				pageExist = webPage.createNewFile();
			} catch (IOException e) {
				System.out.println("Nie udało się utworzyć pliku. Przykro nam.");
			}
		} else {
			System.out.println("Strona: " + webPageName + " istnieje lub została już utworzona.");
		}
	}
	static void HTMLBufferedReader(String siteName) throws IOException {
		bufferedReader = new BufferedReader(new FileReader(siteName));
		
		String nextLine = null;
		int lines = 0;
		
		while((nextLine = bufferedReader.readLine()) != null) {
			System.out.println(nextLine);
			lines++;
		}
		System.out.println("Ilość wierszy w pliku: " + lines);	
	}
	static void HTMLBufferedWriter(String siteName, String HTMLtags) throws IOException {
         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(siteName));
         bufferedWriter.write(HTMLtags);
         bufferedWriter.newLine();
         bufferedWriter.close();
	}
}
