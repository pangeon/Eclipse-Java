import java.nio.file.Paths;
import java.io.IOException;
import java.util.Scanner;


public class File {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(Paths.get("file.txt"));
        String grupa;
        while(in.hasNext()) {
            grupa = in.nextLine();
            System.out.println(grupa);
        }
    }
}