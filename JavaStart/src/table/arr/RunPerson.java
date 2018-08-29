package table.arr;

public class RunPerson {
	public static void main(String[] args) {
		PersonDatabase pdb = new PersonDatabase();
		pdb.add(new Person("Ania", "Malinka", "123456789"));
		pdb.add(new Person("Karol", "Ogórek", "987654321"));
		pdb.add(new Person("Basia", "Kalafiorek", "132435465"));
		
		System.out.println(pdb);
		
		pdb.remove(new Person("Ania", "Malinka", "123456789"));
		System.out.println(pdb);
	}
}
