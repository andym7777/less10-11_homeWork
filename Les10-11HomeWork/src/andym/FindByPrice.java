package andym;

import java.util.ArrayList;
import java.util.List;

public class FindByPrice implements Findable{
	private double price;
	
	public FindByPrice(double price) {
		this.price = price;
	}

	//@Override
	public List<PrintedEdition> find(List<PrintedEdition> units) {
		List<PrintedEdition> resultUnits = new ArrayList<PrintedEdition>();
		
		for(int i=0; i<units.size(); i++) {
			PrintedEdition obj = units.get(i);
			if(price == obj.getPrice()) {
				resultUnits.add(obj);
			}			
		}
		
		return resultUnits;
	}

		

}
