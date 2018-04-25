package andym;

import java.util.List;


public class PrintAsTable implements Printable {

	//@Override
	public void print(List<PrintedEdition> units) {
		// TODO Auto-generated method stub
		System.out.println("Name       |   Price   |    Author  |     Year     |   Title  ");
		for (PrintedEdition listedBook : units) {
			/*System.out.println(listedBook.getClass().getSimpleName() + " : " +"|"
					+ listedBook.getPrice() + "$,   |" 
					+ listedBook.getAuthor() + " | "
					+ listedBook.getYear() + " | " + listedBook.getTitle());*/
			if (listedBook.getClass().getSimpleName().equals("Book") ){
				System.out.println("Book" + " : " +"|"
						+ listedBook.getPrice() + "$,   |" 
						+ listedBook.getAuthor() + "|"
						+ listedBook.getYear() + "|" + listedBook.getTitle());
			} else {
				System.out.println("Magazine" + " : " +"|"
						+ listedBook.getPrice() + "$,    |" 
						+ listedBook.getAuthor() + "     | "
						+ listedBook.getYear() + "          | " + listedBook.getTitle());
			}

			}
		
		
		}
	}

