package practica1x;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

class SaleBookTest {

	@Test
	void testTimeLapse() {
		
		Locale currentLocale;
        ResourceBundle messages;
        String language;
        String country;
        language = new String("es");
        country = new String("ES");

		currentLocale = new Locale(language, country);
        messages = ResourceBundle.getBundle("practica1x/MessagesBundle", currentLocale);
		
		SaleBook b2 =  new SaleBook("harry potter", 345, 298, "tapa blanda",LocalDate.of(2014, 2, 13), 40.00);
		b2.timeLapse(messages);
		
		assertEquals(32,b2.getPrice());
		

	}

}
