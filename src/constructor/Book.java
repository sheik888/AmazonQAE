package constructor;

public class Book {
	String title;
	String author;
	 
	
	//constructor
	public Book (String title, String author) {
		this.title = title;
		this.author = author;
		
		
	}

	public static void main(String[] args) {
		Book book1 = new Book(" java programming ", "john doe ");
		Book book2 = new Book(" python basic ", " jane smith ");
		
		
		
		System.out.println("Book 1:" + book1.title + " by " + book1.author);
		System.out.println("Book 2:" + book2.title + " by " + book1.author);
		
	

	}

}
