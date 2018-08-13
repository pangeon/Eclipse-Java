package topic27.recursion.test;

public class MathUtil {
	public static int add(int n, boolean flag) {
		int sum = 0;
		while(n > 0) { 
			sum = sum + n;
			if(flag == true) {
				System.out.println("n = " + n);
				System.out.println("sum = " + sum);
			}
			n--;
			/* (((((0
					+5)
						+4)
							+3)
								+2)
									+1)*/
		}
		System.out.println("Wynik: " + sum);
		return sum;
	}
	public static int addRecursion(int n) {
		return n > 1 ? n + addRecursion(n -1) : n;
		/*if(n > 0) { 
			//System.out.println(n + " + " + "addRecursion(" + (n-1) + ")");
			return n + addRecusion(n - 1);
			
			/*
			 addRecursion(3)
			 3 + addRecursion(2)
			 3 + 2 + addRecursion(1) 
			 3 + 2 + 1 + addRecursion(0)
			 3 + 2 + 1 + 1 = 6 
			 
		} else {
			return n;
		}*/
		
	}
	public static int factorial(int n, boolean flag) {
		int pow = 1;
		while(n > 0) { 
			pow = pow * n;
			if(flag == true) {
				System.out.println("n = " + n);
				System.out.println("pow = " + pow);
			}
			n--;
			/* (((((1
					*5)
						*4)
							*3)
								*2)
									*1)*/
		}
		System.out.println("Wynik: " + pow);
		return pow;
	}
	public static int factorialRecursion(int n) {
		return n > 1 ? n * factorialRecursion(n - 1) : 1;
		/*if(n > 1) { 
			//System.out.println(n + " + " + "factorialRecursion(" + (n-1) + ")");
			return n * factorialRecusion(n - 1);
			
			/*
			 factorialRecursion(3)
			 3 * factorialRecursion(2)
			 3 * 2 * factorialRecursion(1) 
			 3 * 2 * 1 = 6 
			 
		} else {
			return n;
		}*/
		
	}
}
