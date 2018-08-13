package topic28.tester;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Run {

	public static void main(String[] args) {
		double a = 0.7;
		double b = 0.3;
		
		System.out.println(a-b);
		
		BigDecimal aBig = BigDecimal.valueOf(a);
		BigDecimal bBig = BigDecimal.valueOf(b);
		System.out.println("aBig - bBig = " + aBig.subtract(bBig));
		
		int f1 = 123;
		int f2 = 1234;
		int f3 = 12345;
		BigInteger f4 = new BigInteger("123456789123456789");
		BigInteger f5 = new BigInteger("987654321987654321");

	}

}
