package library.data;

public class Library {
	public final int limitBooks = 100;
	private Book[] books;
	private int booksNumber;
	
	public Library() {
		books = new Book[limitBooks];
	}

	public int getBookNumber() {
		return booksNumber;
	}

	public Book[] getBooks() {
		return books;
	}
	
	public void addBook(Book book) {
		if(booksNumber < limitBooks) {
			books[booksNumber] = book;
			booksNumber++;
		} else {
			System.out.println("Maxymalna liczba ksi¹¿ek zosta³a osi¹gniêta");
		}
	}
	public void printBooks() {
		if(booksNumber == 0) {
			System.out.println("Brak ksi¹¿ek w bibliotece");
		}
		for(int i=0; i<booksNumber; i++) {
			books[i].info();
		}
	}
}
