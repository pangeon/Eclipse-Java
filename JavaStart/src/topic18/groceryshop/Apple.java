package topic18.groceryshop;

public class Apple extends Fruit {
	private String kindName = "undefinded";
	
	public Apple(String kindName, String categoryName) {
		super(categoryName);
		this.kindName = kindName;		
	}

	public String getKindName() {
		return kindName;
	}

	public void setKindName(String kindName) {
		this.kindName = kindName;
	}
	public void printInfo() {
		super.printInfo();
		System.out.println("Apple [getKindName()=" + getKindName() + "]");	
	}	
}
