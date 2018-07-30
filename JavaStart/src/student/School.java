package student;

public class School {
	private Student[] students;
	private int studentsNumber;
	
	public School(int studentsNumber) {
		students = new Student[studentsNumber];
		this.studentsNumber = 0;
	}
	public void add(Student student) throws NoMoreSpaceException {
		if (studentsNumber >= students.length) {
			throw new NoMoreSpaceException("Brak miejsca w szkole " + students.length);
		} else {
			students[studentsNumber] = student;
			studentsNumber++;			
		}
	}
	public Student find(String firstName, String lastName) throws NoElementFoundException {
		boolean found_flag = false;
		Student foundElement = null;
		int index = 0;
		while (!found_flag && index < students.length) {
			if (students[index].getFirstName().equals(firstName) && 
			students[index].getLastName().equals(lastName)) {
					foundElement = students[index];
					found_flag = true;
			} else {
				index++;
			}
		}
		if (foundElement == null) {
			throw new NoElementFoundException("Nie znaleziono elementu" + firstName + " " + lastName);
		}
		return foundElement;
	}
}
