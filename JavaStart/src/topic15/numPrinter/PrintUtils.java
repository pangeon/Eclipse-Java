package topic15.numPrinter;

import static java.lang.System.*;

class PrintUtils {
	public static final int EXIT = 0;
	public static final int OPEN = 1;
	
	public static void Num(int start, int end) {
		for (int i = start; i <= end; i++) {
			out.println(i + " ");
		}
		out.println();
	}
}
