package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
    private final List<Item> items = new LinkedList<>();

    public void addItem(Item i) {
        items.add(i);
    }

    public void printCatalog() {
        PrintCatalogVisitor v = new PrintCatalogVisitor();
        for (Item i : items)
            i.accept(v);
    }

    public void printOnlyBooks() {
	    PrintOnlyBooksVisitor v = new PrintOnlyBooksVisitor();

        for (Item i : items)
            i.accept(v);
    }

    public void printOnlyCDs() {
        PrintOnlyCDsVisitor v = new PrintOnlyCDsVisitor();

        for (Item i : items)
            i.accept(v);
    }

}
