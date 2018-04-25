package andym;

import java.util.Comparator;

public class ComparatorPrice implements Comparator<PrintedEdition> {

    public int compare(PrintedEdition o1, PrintedEdition o2) {
        double price = o1.getPrice();
        double price1 = o2.getPrice();
        if (price < price1) {
            return -1;
        } else if (price == price1) {
            return 0;
        } else {
            return 1;
        }
    }

}