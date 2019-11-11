package practica1x;

import java.util.ArrayList;
import java.util.ResourceBundle;


/*
 * Lirary2 class
 * class that defines its attributes and methods
 */
public class Library2 {

	ArrayList<User2> users = new ArrayList<User2>(); // array that contains the users of the library
	ArrayList<Book2> books = new ArrayList<Book2>(); // array that contains the books of the library
	
	
	
	/*
	 * constructor of the class Libray2
	 * @return User2 
	 */
	public Library2() {
		this.users.clear();;
		this.books.clear();
	}
	
	
	/*
	 * getter of the attribute users
	 * @return users
	 */
	public ArrayList<User2> getUsers() {
		return users;
	}


	/*
	 * setter of the attribute users
	 */
	public void setUsers(ArrayList<User2> users) {
		this.users = users;
	}


	/*
	 * getter of the attribute books
	 * @return books
	 */
	public ArrayList<Book2> getBooks() {
		return books;
	}


	/*
	 * setter of the attribute books
	 */
	public void setBooks(ArrayList<Book2> books) {
		this.books = books;
	}



	/*
	 * this method creates an account for a new user
	 * @param id 
	 * @param firstName
	 * @param lastName
	 */
	public void RegisterUser(int id, String firstName, String lastName, double money){	
		
		User2 newUser = new User2(id,firstName, lastName, money);
		this.users.add(newUser);
		
	}
	
	/*
	 * this method adds a book to the library
	 * @param book
	 */
	public void addBook(Book2 book) {
		
		this.books.add(book);
		
	}
	/*
	public User searchUserByName(String firstName, String lastName) {
		
		
		
	}
	
	public User searchUserByID(int id) {
		
		
		
	}
	*/
	
	
	/*
	 * this method searches if there is a book with the name of the parameter
	 * @param name
	 * @return Book2 
	 */
	public Book2 searchBookByName(String name) {
		
		for(Book2 b: this.books) 
			if(b.getTitle().equals(name))
				return b;
		
		
		return null;
		
	}
	
	/*
	 * this method searches if there is a book with the isbn of the parameter
	 * @param isbn
	 * @return Book2 
	 */
	public Book2 searchBookByISBN(int isbn) {
		
		for(Book2 b: this.books) 
			if(b.getIsbn() == isbn)
				return b;
		
		
		return null;
		
	}
	
	
	/*
	 * this method lends a book to the user defined in the parameter
	 * @param book
	 * @param user 
	 */
	public void lendBook(User2 user, Book2 book) {
		
		user.addBook(book);
		
		this.books.remove(book);
		
		
		
	}
	
	
	public void buyBook(User2 user, SaleBook book, ResourceBundle messages) throws NoMoney{
		
		if(user.getMoney() < book.getPrice()) {
			throw new NoMoney(messages);
		}
			
		user.addBook(book);
		
		this.books.remove(book);
		
		double money = user.getMoney() - book.getPrice();
		user.setMoney(money);
		System.out.println(messages.getString("succesfullybought"));	

		
	}
	
	
	/*
	 * this method gives back a book from the user defined in the parameter
	 * @param user
	 * @param book 
	 */
	public void returnBook(User2 user, Book2 book) {
		
		this.books.add(book);
		
		user.removeBook(book);
		
	}
	
	/*
	 * this method prints the information of the library´s books
	 */
	public void printBooks(ResourceBundle messages) {
		
		System.out.println(messages.getString("libbooks"));
		
		if(this.books.isEmpty()==true)
			System.out.println(messages.getString("noavailable"));
		else
			for(Book2 b: this.books) 
				b.printBook(messages);
		
		
	}
	
	
	
}
