package mediatheque;

public class PrintOnlyCDsVisitor implements ItemVisitor {

    @Override
    public void visit(Book book) {
        return;
    }

    @Override
    public void visit(CD cd) {
        cd.print();
    }
}
