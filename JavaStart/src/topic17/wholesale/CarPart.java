package topic17.wholesale;

public class CarPart {
	private static int nextIdNum = 1;
	
	private int idNum = 0;
	private String producerName = "empty";
	private String modelName = "";
	private int serialNum_OF_modelName = 0;
	
	public CarPart() {
		setIdNum();
	}
	
	public CarPart(String producerName, String modelName, int serialNum_OF_modelName) {
		setIdNum();
		this.producerName = producerName;
		this.modelName = modelName;
		this.serialNum_OF_modelName = serialNum_OF_modelName;
	}

	public static int getNextIdNum() {
		return nextIdNum;
	}
	
	public int getIdNum() {
		return idNum;
	}
	public void setIdNum() {
		idNum = nextIdNum;
		nextIdNum++;
	}
	public String getProducerName() {
		return producerName;
	}
	public void setProducerCarPartName(String producerCarPart) {
		this.producerName = producerCarPart;
	}
	public String getSerialAndModelCarPart() {
		String serialAndModel = modelName + serialNum_OF_modelName;
		return serialAndModel;
	}
	public void setSerialAndModelCarPart(String modelCarPart, int serialCarPart) {
		this.modelName = modelCarPart;
		this.serialNum_OF_modelName = serialCarPart;
	}

	@Override
	public String toString() {
		return "CarPart [getIdNum()=" + getIdNum() + ", getProducerName()=" + getProducerName()
				+ ", getSerialAndModelCarPart()=" + getSerialAndModelCarPart() + "]";
	}

	
	

	
	
	
	
}
