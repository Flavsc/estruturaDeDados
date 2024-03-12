package lista_ligada_simples;

public class NodeTest {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        System.out.println("Node 1:" + node1);
        System.out.println("Node 2:" + node2);

        node1.setNext(node2);

        System.out.println("E agora? " + node1.getNext());
        System.out.println("E agora? " + node2.getNext());
    }
}
