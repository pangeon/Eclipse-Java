package topic20.presto;

public enum Pizza {
	MARGHERITA(true, true, false, false), 
	CAPRICIOSA(true, true, true, false), 
	PROSCIUTTO(true, true, true, true);
	
	private boolean IsTomatoSauce;
	private boolean IsChesse;
	private boolean IsMushrooms;
	private boolean IsHam;
	
	public boolean getIsTomatoSauce() {
		return IsTomatoSauce;
	}
	public boolean getIsChesse() {
		return IsChesse;
	}
	public boolean getIsMushrooms() {
		return IsMushrooms;
	}
	public boolean getIsHam() {
		return IsHam;
	}
	private Pizza(boolean IsTomatoSauce, boolean IsChesse, boolean IsMushrooms, boolean IsHam) {
		this.IsTomatoSauce = IsTomatoSauce;
		this.IsChesse = IsChesse;
		this.IsMushrooms = IsMushrooms;
		this.IsHam = IsHam;
	}
	@Override
	public String toString() {
		//przypisanie nazwy pizzy
		String result = this.name() +"(";
		//informacje o sk³adnikach
		if (IsTomatoSauce) result += "sos pomidorowy";
		if (IsChesse) result += ", ser";
		if (IsMushrooms) result += ", pieczarki";
		if (IsHam) result += ", szynka";
		result += ")";
		
		return result;
	}	
}
