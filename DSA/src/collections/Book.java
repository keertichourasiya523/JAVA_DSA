package collections;

import java.util.ArrayList;

public class Book {

	private int bookId;
    private String bookName;
    private String authorName;

    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

	  public static void main(String[] args) {
	        ArrayList<Book> books = new ArrayList<>();

	        books.add(new Book(1, "Book 1", "Author 1"));
	        books.add(new Book(2, "Book 2", "Author 2"));
	        books.add(new Book(3, "Book 3", "Author 3"));

	        for (Book book : books) {
	            System.out.println("Book ID: " + book.getBookId());
	            System.out.println("Book Name: " + book.getBookName());
	            System.out.println("Author Name: " + book.getAuthorName());
	            System.out.println();
	        }
	    }
}

