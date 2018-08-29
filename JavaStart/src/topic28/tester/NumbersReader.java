package topic28.tester;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class NumbersReader {

	public static void main(String[] args) {
		String fileName = "number.txt";
		int f1 = 0, f2 = 0, f3 = 0;
		BigInteger f4 = null, f5 = null;
		
		try (FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader)
			) {
			f1 = Integer.parseInt(bufferedReader.readLine());
			f2 = Integer.parseInt(bufferedReader.readLine());
			f3 = Integer.parseInt(bufferedReader.readLine());
			f4 = new BigInteger(bufferedReader.readLine());
			f5 = new BigInteger(bufferedReader.readLine());
			
		} catch(FileNotFoundException e) {
			System.out.println("Nie znaleziono takiego pliku");
		} catch(IOException e) {
			System.out.println("Błąd odczytu danych");
		}
		System.out.println("f1+f2+f3 = " + (f1+f2+f3));
		System.out.println("f4+f5 = " + f4.add(f5));

	}

}
