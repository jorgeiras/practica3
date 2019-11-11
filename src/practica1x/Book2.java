package practica1x;

import java.time.LocalDate;
import java.util.ResourceBundle;


/*
 * Book2 class
 * class that defines its attributes and methods
 */
public class Book2 {

	
	private String title;
	private int isbn;
	private int pages;
	private String type;
	private LocalDate date;
	
	/*
	 * constructor of the class Book2
	 * @param title
	 * @param isbn
	 * @param pages
	 * @param type
	 * @param date
	 * @return Book2
	 */
	public Book2(String title, int isbn, int pages, String type, LocalDate date) {
		this.title = title;
		this.isbn = isbn;
		this.pages = pages;
		this.type = type;
		this.date = date;
	}

	/*
	 * getter of the attribute title
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/*
	 * setter of the attribute title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/*
	 * getter of the attribute isbn
	 * @return isbn
	 */
	public int getIsbn() {
		return isbn;
	}

	/*
	 * setter of the attribute isbn
	 */
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	/*
	 * getter of the attribute pages
	 * @return pages
	 */
	public int getPages() {
		return pages;
	}

	/*
	 * setter of the attribute pages
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}

	/*
	 * getter of the attribute type
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/*
	 * setter of the attribute type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/*
	 * getter of the attribute date
	 * @return date
	 */
	public LocalDate getDate() {
		return date;
	}

	/*
	 * setter of the attribute date
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	} 
	
	
	
	/*
	 * this method prints the information of the book
	 */
	public void printBook(ResourceBundle messages) {
		
		System.out.println("\ntitle: " + this.title + "\nisbn: " + this.isbn +  "\npages: " + this.pages + "\ntipe: " + this.type + "\ndate: " + this.date + "\n");
		
	}
	
	
	
}
