package practica1x;

import java.time.LocalDate;
import java.util.ResourceBundle;

public class SaleBook extends Book2 implements BookInterface{
	
	private double price;

	public SaleBook(String title, int isbn, int pages, String type, LocalDate date, double price) {
		super(title, isbn, pages, type, date);
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void printBook(ResourceBundle messages) {
		
		System.out.println(messages.getString("sale"));
		System.out.println(messages.getString("printtitle") + super.getTitle() + "\n" + messages.getString("printisbn") + super.getIsbn() +  "\n" + messages.getString("printpages") + super.getPages() + "\n" + messages.getString("printtype") + super.getType() + "\n" + messages.getString("printdate") + super.getDate() + "\n" + messages.getString("printprice")  + this.price + "\n");
		
	}

	public void timeLapse(ResourceBundle messages) {
		
		if(LocalDate.now().getYear() - super.getDate().getYear() > 2) {
			this.price = this.price - (this.price * 0.2);
			System.out.println(messages.getString("oldbuy"));
		}
			
	}
	

}
