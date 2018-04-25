package andym;

import java.util.ArrayList;
import java.util.List;

public class FindByAuthor implements Findable{
	private String author;
	
	public FindByAuthor(String author) {
		this.author = author;
	}

	//@Override
		public List<PrintedEdition> find(List<PrintedEdition> units) {
			List<PrintedEdition> resultUnits = new ArrayList<PrintedEdition>();
			
			for(int i=0; i<units.size(); i++) {
				PrintedEdition obj = units.get(i);
				if(author == obj.getAuthor()) {
					resultUnits.add(obj);
				}			
			}
			
			return resultUnits;
		}

		
}
