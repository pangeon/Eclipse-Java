package student;

public class SchoolTest {
	public static void main(String[] args) {
		School school = new School(3);
		try {
			school.add(new Student(1, "Kamil", "Cecherz"));
			school.add(new Student(2, "Łukasz", "Bednarski"));
			school.add(new Student(3, "Dominik", "Gawrych"));
			school.add(new Student(4, "Julita", "Sobieraj"));
		} catch (NoMoreSpaceException e) {
			System.err.println("Nie można dodać tylu studentów do tej szkoły.");
			System.err.println(e.getMessage());
		}
		try {
			System.out.println(school.find("Dominik", "Gawrych"));
			System.out.println(school.find("Łukasz", "Cecherz"));
		} catch (NoElementFoundException e) {
			System.err.println("Nie znaleziono takiej osoby!");
			System.err.println(e.getMessage());
		}
	}

}
