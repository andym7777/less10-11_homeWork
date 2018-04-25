package andym;

import java.util.Comparator;

public class ComparatorYear implements Comparator<PrintedEdition> {

    public int compare(PrintedEdition o1, PrintedEdition o2) {
        double year = o1.getYear();
        double year1 = o2.getYear();
        if (year < year1) {
            return -1;
        } else if (year == year1) {
            return 0;
        } else {
            return 1;
        }
    }

}