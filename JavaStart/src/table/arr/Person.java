package table.arr;

public class Person {
	private String name;
	private String surname;
	private String PESEL;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPESEL() {
		return PESEL;
	}
	public void setPESEL(String PESEL) {
		this.PESEL = PESEL;
	}
	public Person(String name, String surname, String PESEL) {
		setName(name);
		setSurname(surname);
		setPESEL(PESEL);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (PESEL == null) {
			if (other.PESEL != null)
				return false;
		} else if (!PESEL.equals(other.PESEL))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return  name + ", " + surname + ", " + PESEL;
	}
	
	
	
	
}
