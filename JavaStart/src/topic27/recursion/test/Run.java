package topic27.recursion.test;

public class Run {

	public static void main(String[] args) {
		MathUtil.add(1000000, false);
		MathUtil.factorial(0, false);
		System.out.println(MathUtil.addRecursion(1000));
		// 0+5+4+3+2+1 = 15
		System.out.println(MathUtil.factorialRecursion(0));
		// 3*2*1
	}
}
