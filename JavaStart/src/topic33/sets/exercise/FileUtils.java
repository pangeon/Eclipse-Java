package topic33.sets.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

public class FileUtils {
	public static TreeSet<String> fileReader(String fileName) throws IOException {
		BufferedReader file = new BufferedReader(new FileReader(fileName));
		
		TreeSet<String> lineListName = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return -(o1.compareTo(o2));
			}
		});
		
		int linesAmount = 0;

		String name;
		while((name = file.readLine()) != null) { 
			lineListName.add(name);
			linesAmount++;
			
		}
		file.close();
		for(String s : lineListName) {
			System.out.println(s);
		}
		System.out.println("Ilość linii w pliku " + linesAmount);
		System.out.println("Ilość imion w zbiorze: " + lineListName.size());
		
		
		return lineListName;
	}
}
