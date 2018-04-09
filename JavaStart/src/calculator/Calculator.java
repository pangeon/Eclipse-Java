package calculator;

class Calculator {

	public static void main(String[] args) {
		Calculate c = new Calculate();
		System.out.println(c.add(1, 1));
		System.out.println(c.add(1, 1, 1)); /* przeci¹¿ona wersja metody add */ 
		
		c.printAll(8.5, 3.5);
	}

}
