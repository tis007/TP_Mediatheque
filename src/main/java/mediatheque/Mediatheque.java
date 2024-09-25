package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
    private final List<Item> items = new LinkedList<>();
    private final PrintCatalogVisitor printCatalogVisitor = new PrintCatalogVisitor();
    private final PrintOnlyBooksVisitor printOnlyBooksVisitor = new PrintOnlyBooksVisitor();
    private final PrintOnlyCDsVisitor printOnlyCDsVisitor = new PrintOnlyCDsVisitor();

    public void addItem(Item i) {
        items.add(i);
    }

    public void printCatalog() {
        useVisitor(printCatalogVisitor);
    }

    public void printOnlyBooks() {
        useVisitor(printOnlyBooksVisitor);
    }

    public void printOnlyCDs() {
        useVisitor(printOnlyCDsVisitor);
    }

    public void useVisitor(ItemVisitor v) {
        items.forEach(i -> i.accept(v));
    }

}
