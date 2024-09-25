package mediatheque;

public class PrintOnlyBooksVisitor implements ItemVisitor {

    @Override
    public void visit(Book book) {
        book.print();
    }

    @Override
    public void visit(CD cd) {
        return;
    }
}
