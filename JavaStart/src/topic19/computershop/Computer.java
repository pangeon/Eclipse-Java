package topic19.computershop;

/*
 * Computer - klasa posiada pola producer i model - czyli informacje o producencie i modelu laptopa, 
   przy czym model jest reprezentowany za pomoc� liczby ca�kowitej. Zdefiniuj w niej metod� equals(), 
   kt�ra pozwoli na zweryfikowanie, czy jest to jedyny taki egzemplarz w sklepie. Przes�o� tak�e 
   metod� toString(), kt�ra pozwoli uzyska� czyteln� informacj� o danym egzemplarzu.
 */

public class Computer {
	private String producerName = "undefinded";
	private int modelNum = 0;
	
	public Computer(String producerName, int modelNum) {
		this.producerName = producerName;
		this.modelNum = modelNum;
	}
	public String getProducerName() {
		return producerName;
	}
	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}
	public int getModelNum() {
		return modelNum;
	}
	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (modelNum != other.modelNum)
			return false;
		if (producerName == null) {
			if (other.producerName != null)
				return false;
		} else if (!producerName.equals(other.producerName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return producerName + " " + modelNum;
	}
	
	
	
}
