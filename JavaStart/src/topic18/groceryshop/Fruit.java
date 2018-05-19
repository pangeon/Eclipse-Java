package topic18.groceryshop;

public class Fruit {
	private String categoryName = "undefinded";
	
	public Fruit(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public void printInfo() {
		System.out.println("Fruit [getCategoryName()=" + getCategoryName() + "]");
	}
}
