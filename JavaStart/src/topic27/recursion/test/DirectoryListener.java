package topic27.recursion.test;

import java.io.File;

public class DirectoryListener {

	public static void main(String[] args) {
		DirectoryListener dl = new DirectoryListener();
		File file = new File("/home/cecherz/eclipse-workspace/JavaStart");
		dl.showDirectories(file);
	}
	public void showDirectories(File file) {
			File[] files = file.listFiles();
			
			if(files != null) {
				for (File f : files) {
					if (f.isDirectory()) {
						System.out.println("Folder: " + f.getAbsolutePath());
						showDirectories(f);
					} else {
						System.out.println(" plik " + f.getAbsolutePath());
					}
				}
			}
	}
}
