package topic17.wholesale;

public class ExhaustPart extends CarPart {
	private boolean IsEuropeanStandart = false;

	public ExhaustPart() {
		super();
	}

	public ExhaustPart(String producerName, String modelName, int serialNum_OF_modelName, boolean IsEuropeanStandart) {
		super(producerName, modelName, serialNum_OF_modelName);
		this.IsEuropeanStandart = IsEuropeanStandart;
	}

	public boolean isIsEuropeanStandart() {
		return IsEuropeanStandart;
	}

	public void setIsEuropeanStandart(boolean isEuropeanStandart) {
		IsEuropeanStandart = isEuropeanStandart;
	}

	@Override
	public String toString() {
		return "ExhaustPart [isIsEuropeanStandart()=" + isIsEuropeanStandart() + ", getIdNum()=" + getIdNum()
				+ ", getProducerName()=" + getProducerName() + ", getSerialAndModelCarPart()="
				+ getSerialAndModelCarPart() + "]";
	}
	
	
}
