package practica1x;

import java.time.LocalDate;
import java.util.ResourceBundle;

public class RentalBook extends Book2 implements BookInterface {

	boolean rented;
	LocalDate dayOfRent;
	int days; //number of days you can rent the book;
	
	
	public RentalBook(String title, int isbn, int pages, String type, LocalDate date, boolean rented,
			LocalDate dayOfRent, int days) {
		super(title, isbn, pages, type, date);
		this.rented = rented;
		this.dayOfRent = dayOfRent;
		this.days = days;
	}


	public boolean isRented() {
		return rented;
	}


	public void setRented(boolean rented) {
		this.rented = rented;
	}


	public LocalDate getDayOfRent() {
		return dayOfRent;
	}


	public void setDayOfRent(LocalDate dayOfRent) {
		this.dayOfRent = dayOfRent;
	}


	public int getDays() {
		return days;
	}


	public void setDays(int days) {
		this.days = days;
	}
	
	
	public void printBook(ResourceBundle messages) {
		
		System.out.println(messages.getString("rental"));
		System.out.println(messages.getString("printtitle") + super.getTitle() + "\n" + messages.getString("printisbn") + super.getIsbn() +  "\n" + messages.getString("printpages") + super.getPages() + "\n" + messages.getString("printtype") + super.getType() + "\n" + messages.getString("printdate") + super.getDate() + "\n" + messages.getString("printdays")  + this.days + "\n");
		
	}
	
	public void timeLapse(ResourceBundle messages) {
		
		if(LocalDate.now().getYear() - super.getDate().getYear() > 2)
			System.out.println(messages.getString("old"));
		
	}
	
	
	
	
	
	
}
