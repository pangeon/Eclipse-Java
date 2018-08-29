package topic29.generics;

public class Pair<T, V> {
	private T arg_T;
	private V arg_V;
	
	public Pair(T arg_T, V arg_V) {
		this.arg_T = arg_T;
		this.arg_V = arg_V;
	}
	public Pair() {
		
	}
	public T get_T() {
		return arg_T;
	}

	public void set_T(T arg_T) {
		this.arg_T = arg_T;
	}
	public V get_V() {
		return arg_V;
	}

	public void set_V(V arg_V) {
		this.arg_V = arg_V;
	}
	static <T, V> void printPair(Pair<T, V> pair) {
		System.out.println("<" + pair.get_T() + " ; " + pair.get_V() + ">");
	}
	
	
	
	
}
