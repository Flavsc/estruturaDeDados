package lista_ligada_simples;

public class Lista {
    private Node first;
    // por clareza de código:
    public Lista() {
        first = null;
    }
    public Node getFirst() {
        return first;
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
}
