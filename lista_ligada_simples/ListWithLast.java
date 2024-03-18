package lista_ligada_simples;

public class ListWithLast extends List {
    private Node last;
    // default constructor
    public Node getLast() {
        return last;
    }
    @Override
    public void insertEnd(int i) {
        Node born = new Node(i);
        if (isEmpty()) {
            setFirst(born);
        }
        else {
            last.setNext(born);
        }
        last = born;
    }
}
