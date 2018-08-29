package topic28.tester;

import java.math.BigDecimal;

public class Run {

	public static void main(String[] args) {
		double a = 0.7;
		double b = 0.3;
		
		System.out.println(a-b);
		
		BigDecimal aBig = BigDecimal.valueOf(a);
		BigDecimal bBig = BigDecimal.valueOf(b);
		System.out.println("aBig - bBig = " + aBig.subtract(bBig));
		
		

	}

}
