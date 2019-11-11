package practica1x;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class Library2Test {



	@Test
	void testAddBook() {
		
		Library2 lib = new Library2();
		Book2 b1 =  new Book2("harry potter", 345, 298, "tapa blanda",LocalDate.of(2014, 2, 13));
		lib.addBook(b1);

		assertTrue(lib.getBooks().contains(b1));
		
	}

	@Test
	void testSearchBookByName() {
		Library2 lib = new Library2();
		Book2 b1 =  new Book2("harry potter", 345, 298, "tapa blanda",LocalDate.of(2014, 2, 13));
		lib.addBook(b1);

		assertNotNull(lib.searchBookByName("harry potter"));
	}

	@Test
	void testSearchBookByISBN() {
		Library2 lib = new Library2();
		Book2 b1 =  new Book2("harry potter", 345, 298, "tapa blanda",LocalDate.of(2014, 2, 13));
		lib.addBook(b1);

		assertNotNull(lib.searchBookByISBN(345));
	}

	@Test
	void testLendBook() {
		Library2 lib = new Library2();
		User2 us = new User2(5, "Jorge", "Alonso",100.00);
		Book2 b1 =  new Book2("harry potter", 345, 298, "tapa blanda",LocalDate.of(2014, 2, 13));
		lib.addBook(b1);
		lib.lendBook(us, b1);

		assertTrue(us.getMyBooks().contains(b1));
		assertFalse(lib.getBooks().contains(b1));
	}

	@Test
	void testReturnBook() {
		Library2 lib = new Library2();
		User2 us = new User2(5, "Jorge", "Alonso", 100.00);
		Book2 b1 =  new Book2("harry potter", 345, 298, "tapa blanda",LocalDate.of(2014, 2, 13));
		us.addBook(b1);
		lib.returnBook(us, b1);
		
		assertTrue(lib.getBooks().contains(b1));
		assertFalse(us.getMyBooks().contains(b1));
	}

}
