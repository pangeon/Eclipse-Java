package loop;

import java.util.Arrays;

public class NumPrinter {
	public static long Silnia(int n) {
		int i = 1;
		long sum = 1;
		long[] num = new long[n];
		while(i <= n) { //  np. 5
			num[i-1] = i++; // 1-4 do 5
			sum *= num[i-2]; // num[0-7]
		}
		System.out.println("Silnia: " + Arrays.toString(num) + " = " + sum);
		return sum;
	}
	public static void main(String[] args) {
		Silnia(10);
		Silnia(11);
		Silnia(12);
		Silnia(13);
		Silnia(20);
	}
}
