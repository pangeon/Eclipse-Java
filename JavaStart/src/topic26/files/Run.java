package topic26.files;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Run {
	
	static final String URL = "index.html";
	
	static final String TAGS = 
	"<html>\n" + 
	"	<head>\n" + 
	"		<title>Hello</title>\n" + 
	"	</head>\n" + 
	"	<body>\n" + 
	"		<h1>Hello World - Java</h1>\n" +
	"		<p>Strumienie</p>\n" +
	"	</body>\n" + 
	"</html>";
	
	
	public static void main(String[] args) {
		try {
			//HTMLCreator.HTMLFile(URL);
			HTMLCreator.HTMLBufferedWriter(URL, TAGS);
			//HTMLCreator.HTMLReader(URL);
			HTMLCreator.HTMLBufferedReader(URL);
		} catch (FileNotFoundException e) {
			System.out.println("Plik niedostępny.");
		} catch (IOException f) {
			System.out.println("Błąd podczas wczytywania pliku.");
		}
	}
}
