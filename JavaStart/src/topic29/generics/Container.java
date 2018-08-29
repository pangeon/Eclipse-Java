package topic29.generics;

public class Container {
	private Object array[];

	public Object[] getArray() {
		return array;
	}
	public void setArray(Object array[]) {
		this.array = array;
	}
	public Object get(int index) {
		return array[index];
	}
	public void printObjects() {
		for (Object o: array) {
			System.out.print(o + " ");
		}
	}
}
