package topic17.wholesale;

public class Tire extends CarPart {
	private double circleDec = 0;
	private double widthDec = 0;
	
	public Tire() {
		super();
	}
	public Tire(String producerName, String modelName, int serialNum_OF_modelName, 
			    double circleDec, double widthDec) 
	{
		super(producerName, modelName, serialNum_OF_modelName);
		this.circleDec = circleDec;
		this.widthDec = widthDec;
	}
	public double getCircleDec() {
		return circleDec;
	}
	public void setCircleDec(double circleDec) {
		this.circleDec = circleDec;
	}
	public double getWidthDec() {
		return widthDec;
	}
	public void setWidthDec(double widthDec) {
		this.widthDec = widthDec;
	}
	@Override
	public String toString() {
		return "Tire [getCircleDec()=" + getCircleDec() + ", getWidthDec()=" + getWidthDec() + ", getIdNum()="
				+ getIdNum() + ", getProducerName()=" + getProducerName() + ", getSerialAndModelCarPart()="
				+ getSerialAndModelCarPart() + "]";
	}
	
	
	
	
}
