package andym;

import java.util.List;

public class PrintAsList implements Printable {

	// @Override
	public void print(List<PrintedEdition> units) {

		for (PrintedEdition listedBook : units) {

			System.out.println(listedBook.getClass().getSimpleName() + " : "
					+ " Cost is  " + listedBook.getPrice() + "$," + " Author: "
					+ listedBook.getAuthor() + ", Year: "
					+ listedBook.getYear() + ", Title: " + listedBook.getTitle());

		}
	}

}
