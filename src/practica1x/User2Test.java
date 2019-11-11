package practica1x;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class User2Test {

	@Test
	void testAddBook() {
		User2 us = new User2(5, "Jorge", "Alonso",100.00);
		Book2 b1 =  new Book2("harry potter", 345, 298, "tapa blanda",LocalDate.of(2014, 2, 13));
		us.addBook(b1);
		
		assertTrue(us.getMyBooks().contains(b1));
	}

	@Test
	void testRemoveBook() {
		User2 us = new User2(5, "Jorge", "Alonso",100.00);
		Book2 b1 =  new Book2("harry potter", 345, 298, "tapa blanda",LocalDate.of(2014, 2, 13));
		us.addBook(b1);
		us.removeBook(b1);
		
		assertFalse(us.getMyBooks().contains(b1));
		
	}

	@Test
	void testSearchBookByName() {
		User2 us = new User2(5, "Jorge", "Alonso",100.00);
		Book2 b1 =  new Book2("harry potter", 345, 298, "tapa blanda",LocalDate.of(2014, 2, 13));
		us.addBook(b1);
		
		assertNotNull(us.searchBookByName("harry potter"));
		
	}

	@Test
	void testSearchBookByISBN() {
		User2 us = new User2(5, "Jorge", "Alonso",100.00);
		Book2 b1 =  new Book2("harry potter", 345, 298, "tapa blanda",LocalDate.of(2014, 2, 13));
		us.addBook(b1);
		
		assertNotNull(us.searchBookByISBN(345));
	}

}
