package topic25.innerClass;

public class Outer {
	public int x;
	
	public void doSometing() {
		int localVar = x;
		
		class Inner {
			public void innerMethod() {
				x = 5;
				System.out.println(localVar);
			}
		}
		/* w przpadku zmiennych lokalnych w klasach wewnętrznych 
		nie można utworzyć instancji obiektu poprzez klasę w metodzie*/
		Inner instance = new Inner();
		instance.innerMethod();
	}
	public void someMethod() {
	    final String finalVariable = "final variable";
	    String effectivelyFinalVariable = "effectively final variable";
	    // użycie zmiennej nonFinalVariable nie jest dozwolone ponieważ jej wartość jest zmieniana.
	    String nonFinalVariable = "non final variable";
	 
	    class InnerClass {         
	        public void saySomething() {        
	            System.out.println(finalVariable);
	            System.out.println(effectivelyFinalVariable);
	        }   
	    }   
	 
	    InnerClass instance = new InnerClass();
	    instance.saySomething();            
	 
	    nonFinalVariable = "new value";
	}

}
	
