package practica1x;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class main2 {
	

	
	/*
	 * main class with the menu of the program
	 */
	public static void main(String[] args) {
		
			
			User2 us = new User2(5, "Jorge", "Alonso", 50.00);
			Library2 lib = new Library2();
			
			
			Book2 b1 =  new RentalBook("el senor de los anillos", 543, 200, "tapa dura",LocalDate.of(2013, 4, 15), false, LocalDate.of(2013, 4, 15), 5);
			Book2 b2 =  new SaleBook("harry potter", 345, 298, "tapa blanda",LocalDate.of(2014, 2, 13), 41.67);
			Book2 b3 =  new SaleBook("los 3 cerditos", 111, 250, "tapa dura", LocalDate.of(2015, 1, 11), 56.99);
			Book2 b4 =  new RentalBook("los pilares de la tierra", 759, 400, "tapa dura", LocalDate.of(2016, 1, 20),  false, LocalDate.of(2013, 4, 15), 5);

			lib.addBook(b1);
			lib.addBook(b2);
			lib.addBook(b3);

			us.addBook(b4);
			
			Scanner sn = new Scanner(System.in);
			boolean salir = false;
			int option,lan; //Guardaremos la opcion del usuario
			String auxCase3;
			int auxCase4;
			String language;
	        String country;
	        Locale currentLocale;
            ResourceBundle messages;
			
			System.out.println("1. English");
			System.out.println("2. Spanish");
			System.out.println("Select the language:");
			lan = sn.nextInt(); 
			
			
			if(lan == 1) {
				language = new String("en");
	            country = new String("EN");
			}    
	        else {
				language = new String("es");
	            country = new String("ES");
	        }
	        

            currentLocale = new Locale(language, country);
            messages = ResourceBundle.getBundle("practica1x/MessagesBundle", currentLocale);
            
	        
			while(!salir){
	            
				
				
				System.out.println(messages.getString("intro"));
				System.out.println(messages.getString("show"));
				System.out.println(messages.getString("library"));
				System.out.println(messages.getString("title"));
				System.out.println(messages.getString("isbn"));
				System.out.println(messages.getString("borrow"));
				System.out.println(messages.getString("return"));
				System.out.println(messages.getString("buy"));
				System.out.println(messages.getString("infouser"));
				System.out.println(messages.getString("exit"));
	            
				System.out.println(messages.getString("write"));
				option = sn.nextInt();
				
				switch(option) {
				
					case 1:
						us.printMyBooks(messages);
						break;
					
					case 2:
						lib.printBooks(messages);
						break;
						
					case 3:
						System.out.println(messages.getString("name"));
						sn.nextLine();
						auxCase3 = sn.nextLine();
						Book2 b = lib.searchBookByName(auxCase3);
						if(b!=null) {
							System.out.println(messages.getString("found"));
							b.printBook(messages);
						}
						else
							System.out.println(messages.getString("notfound"));
						break;
							
						
					case 4:
						System.out.println(messages.getString("numisbn"));
						auxCase4 = sn.nextInt();
						b = lib.searchBookByISBN(auxCase4);
						if(b!=null) {
							System.out.println(messages.getString("found"));
							b.printBook(messages);
						}
						else
							System.out.println(messages.getString("notfound"));
						break;
						
						
					case 5:
						System.out.println(messages.getString("nameborrow"));
						sn.nextLine();
						auxCase3 = sn.nextLine();
						b = lib.searchBookByName(auxCase3);
						if(b==null) {
							System.out.println(messages.getString("notfound"));
						}
						else {
							if(b instanceof RentalBook) {
								lib.lendBook(us, b);
								((RentalBook)b).timeLapse(messages);
								System.out.println(messages.getString("succesfullyadd"));	
							}
							else
								System.out.println(messages.getString("onlybuy"));	

						}
						
						break;

					case 6:	
						System.out.println(messages.getString("writereturn"));
						sn.nextLine();
						auxCase3 = sn.nextLine();
						b = us.searchBookByName(auxCase3);
						if(b==null) {
							System.out.println(messages.getString("notfound"));
						}
						else {
							if(b instanceof RentalBook) {
								lib.returnBook(us, b);
								System.out.println(messages.getString("succesfullyreturn"));	
							}
							else
								System.out.println(messages.getString("yours"));
						}
						
						
						break;
					
					
					case 7:	
						System.out.println(messages.getString("writebuy"));
						sn.nextLine();
						auxCase3 = sn.nextLine();
						b = lib.searchBookByName(auxCase3);
						if(b==null) {
							System.out.println(messages.getString("notfound"));
						}
						else {
							if(b instanceof SaleBook) {
								try {
								((SaleBook)b).timeLapse(messages);
								lib.buyBook(us, (SaleBook)b, messages);
								}catch(NoMoney e) {
									System.out.println(e.getMessage());
								}
							}
							else
								System.out.println(messages.getString("cannotbuy"));
	
						}
						
						
						break;
					case 8:
						us.printUser(messages);
						break;
						
					case 9:
						salir = true;
						break;
						
						
				
				
				}
				
	            
			}

	}

}
