package topic31.coparable;

import java.util.Comparator;

public class Product implements Comparable<Product> {

	private String producer;
	private String name;
	private String category;
	
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public Product(String producer, String name, String category) {
		setProducer(producer);
		setName(name);
		setCategory(category);
	}
	@Override
	public String toString() {
		return producer + ", " + name + ", " + category;
	}
	/*
	W metodzie compareTo(arg) musimy teraz zdefiniować zasady sortowania i zwrócić jedną z wartości:

    -wartość ujemną, jeśli obiekt przekazany jako argument (arg) jest "większy" (ma być następnikiem) 
    obiektu, z którym go porównujemy (this)
    -wartość 0 jeśli porównywane obiekty są sobie równe
    -wartość dodatnią, jeśli obiekt oryginalny (this) jest "większy" ma być następnikiem 
    obiektu przekazanego jako argument (arg)

	W przypadku sortowania w klasie takiej jak Product możemy zastosować następującą zasadę:

    -Sortujemy po nazwie kategorii produktu
    -Jeśli kilka produktów jest w tej samej kategorii, sortujemy po nazwie producenta
    -Jeśli nazwa producenta kilku produktów jest taka sama, to sortujemy po nazwie towaru

	 */
	@Override
	public int compareTo(Product o) {
		int categoryCompare = category.compareTo(o.getCategory());
		if(categoryCompare != 0) {
			return categoryCompare;
		}
		int producerCompare = producer.compareTo(o.getProducer());
		if(producerCompare != 0) {
			return producerCompare;
		}
		return name.compareTo(o.getName());
	}
	public static class productNameComparator implements Comparator<Product> {
		@Override
		public int compare(Product o1, Product o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}
	public static class categoryNameComparator implements Comparator<Product> {

		@Override
		public int compare(Product o1, Product o2) {
			return o1.getCategory().compareTo(o2.getCategory());
		}
	}
	public static class producerNameComparator implements Comparator<Product> {
		@Override
		public int compare(Product o1, Product o2) {
			return o1.getProducer().compareTo(o2.getProducer());
		}
	}
}
