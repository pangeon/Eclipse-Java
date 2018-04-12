package topic15.unisys;

/**
Student - pozwala przechowywa� informacj� o imieniu, nazwisku i numerze indeksu studenta

W klasie Student zdefiniuj zmienn� statyczn�, kt�ra wraz z tworzeniem nowego obiektu tej klasy 
b�dzie zwi�kszana, a tym samym pozwoli �ledzi� ilo�� student�w na uczelni.
 */

class Student {
	private String firstName = "undefinited";
	private String secondName = "undefinited";
	private int nrIndex = 00000;
	
	
	private int id = 0;
	private static int nextId = 1;
	
	{
		id = nextId;
		nextId++;
	}
	Student() {
		
	}
	Student(String firstName, String secondName, int nrIndex) {
		this.firstName = firstName;
		this.secondName = secondName;
		if (nrIndex <= 99999 && nrIndex >= 00000) {
		this.nrIndex = nrIndex;
		} else {
			System.out.println("Numer jest za du�y.");
		}
	}	
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public int getNrIndex() {
		return nrIndex;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public void setNrIndex(int nrIndex) {
		if (nrIndex <= 99999 && nrIndex >= 00000) {
			this.nrIndex = nrIndex;
		} else {
			System.out.println("Numer jest za du�y.");
		}
	}
	public void printAll() {
		System.out.println("imi�: " + getFirstName()  + " nazwisko: " + getSecondName() 
		+ " numer indeksu: " + getNrIndex() + " id: " + getId());
	}
	
	

	
	
	
}
