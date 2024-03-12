package lista_ligada_simples;

public class Node {
    private int info;
    private Node nextNode;
    //construtor para armarzenar uma informação.
    public Node (int info) {
        this.info = info;
        setNext(null); //por clareza de código definimos null.
    }
    public int getInfo() {
        return info;
    }
    public Node getNext() {
        return nextNode;
    }
    public void serInfo(int info) {
        this.info = info;
    }
    public void setNext(Node nextNode) {
        this.nextNode = nextNode;
    }
    @Override
    public String toString() {
        return "|" + info + "|->";
    }
    
}
