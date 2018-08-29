package topic31.coparable;

import java.util.Arrays;
import java.util.Comparator;

public class ProductCatalog {
	public static void main(String[] args) {
		Product[] products = new Product[7];
		products[0] = new Product("Amino", "Zupa pomidorowa", "Zupy");
		products[1] = new Product("Amino", "Zupa ogórkowa", "Zupy");
		products[2] = new Product("WINIARY", "Zupa pomidorowa", "Zupy");
		products[3] = new Product("WINIARY", "Zupa pomidorowa", "Zupy błyskawiczne");
		products[4] = new Product("WINIARY", "Rosół", "Zupy");
		products[5] = new Product("Knorr", "Placki ziemniaczane", "Dania obiadowe");
		products[6] = new Product("Knorr", "Racuchy", "Dania obiadowe");
		
		System.out.println("Nieposortowana: ");
		for(Product p: products) {
			System.out.println(p);
		}
		System.out.println();
		Arrays.sort(products);
		System.out.println("Posortowana: ");
		for(Product p: products) {
			System.out.println(p);
		}
		System.out.println();
		Arrays.sort(products, new Product.categoryNameComparator());
		Arrays.sort(products);
		System.out.println("Posortowana 2: ");
		for(Product p: products) {
			System.out.println(p);
		}
		Arrays.sort(products, new Comparator<Product>() {
			public int compare(Product o1, Product o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
	}
}
