package lista_ligada_simples;

public class List {
    private Node first;
    // por clareza de código:
    public List() {
        first = null;
    }
    public Node getFirst() {
        return first;
    }
    public void setFirst(Node first) {
        this.first = first;
    }
    public boolean isEmpty() {
        return first == null;
    }
    public void insertBegin(int i) {
        Node newNode = new Node(i);
        if (!isEmpty()) {
            newNode.setNext(first);
        }
        first = newNode;
    }
    @Override
    public String toString() {
        String s = "Lista: ";
        if(isEmpty()) {
            s += "vazia";
        }
        else {
            Node aux = first;
            while (aux != null) {
                s += aux;
                aux = aux.getNext();
            }
            s += "\\";
        }
        return s;
    }

    public void insertEnd (int i) {
        Node born = new Node(i);
        if (isEmpty()) {
            first = born;
        }
        else {
            Node aux = first;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(born);
        }
    }
    public int removeBegin () {
        int i = first.getInfo();
        first = first.getNext();
        return i;
    }

    public int removeEnd () {
        int i;
        if (first.getNext() == null) {
            i = first.getInfo();
            first = null;
        }
        else {
            Node aux = first;
            while (aux.getNext().getNext() != null) {
                aux = aux.getNext();
            }
            i = aux.getNext().getInfo();
            aux.setNext(null);
        }
        return i;
    }
}
