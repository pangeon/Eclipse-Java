package topic31.coparable;

public class RunNumber {

	public static void main(String[] args) {
		NumSorter tab = new NumSorter();
		tab.setSize(30);
		tab.print();
		tab.fill();
		tab.print();
		NumSorter.sort(tab.getTab());
		tab.print();
		

	}

}
