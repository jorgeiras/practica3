package practica1x;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;



/*
 * User2 class
 * class that defines its attributes and methods
 */
public class User2 {

	

	private int id;
	private String firstName;
	private String lastName;
	private LocalDate created_at;
	private ArrayList<Book2> myBooks = new ArrayList<Book2>(); // array that contains the books of the user
	private double money;
	/*
	 * constructor of the class User2
	 * @param id 
	 * @param firstname
	 * @param lastname
	 * @return User2 
	 */
	public User2(int id, String firstName, String lastName, double money) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.created_at = LocalDate.now();
		this.money = money;
	}

	/*
	 * getter of the attribute id
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/*
	 * setter of the attribute id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/*
	 * getter of the attribute firstName
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/*
	 * setter of the attribute firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/*
	 * getter of the attribute lastName
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/*
	 * setter of the attribute lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/*
	 * getter of the attribute created_at
	 * @return created_at
	 */
	public LocalDate getCreated_at() {
		return created_at;
	}

	/*
	 * setter of the attribute created_at 
	 */
	public void setCreated_at(LocalDate created_at) {
		this.created_at = created_at;
	}
	
	/*
	 * getter of the attribute myBooks
	 * @return myBooks
	 */
	public ArrayList<Book2> getMyBooks() {
		return myBooks;
	}

	/*
	 * setter of the attribute myBooks 
	 */
	public void setMyBooks(ArrayList<Book2> myBooks) {
		this.myBooks = myBooks;
	}
	
	
	
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	/*
	 * this method prints the information of the user큦 books
	 */
	public void printMyBooks(ResourceBundle messages) {
		
		System.out.println(messages.getString("mybooks"));
		
		if(this.myBooks.isEmpty()==true)
			System.out.println(messages.getString("nobooks"));
		else
			for(Book2 b: this.myBooks) 
				b.printBook(messages);
		
		
	}
	
	/*
	 * this method adds a book to the user큦 books array
	 * @param book
	 */
	public void addBook(Book2 book) {
		
		this.myBooks.add(book);
		
	}
	
	/*
	 * this method removes a book from the user큦 books array
	 * @param book
	 */
	public void removeBook(Book2 book) {
		
		this.myBooks.remove(book);
		
	}
	
	/*
	 * this method search a book from the user큦 books by name
	 * @param name
	 * @return Book2  
	 */
	public Book2 searchBookByName(String name) {
		
		for(Book2 b: this.myBooks) 
			if(b.getTitle().equals(name))
				return b;
		
		
		return null;
		
	}
	
	/*
	 * this method search a book from the user큦 books by isbn
	 * @param isn
	 * @return Book2  
	 */
	public Book2 searchBookByISBN(int isbn) {
		
		for(Book2 b: this.myBooks) 
			if(b.getIsbn() == isbn)
				return b;
		
		
		return null;
		
	}


	
	public void printUser(ResourceBundle messages) {
		
		System.out.println(messages.getString("printuser"));
		System.out.println(firstName + " " + lastName + "\n" + messages.getString("printmoneyuser") + " "+ money + "\n");
		
	}
	
}
