package lista_ligada_simples;

public class ListTest {
    public static void main(String[] args) {
        List lista = new List();
        System.out.println("Lista foi Construida: \n" + lista);
        for (int i=1; i<6; i++) {
            lista.insertBegin(i*10);
            System.out.println(lista);
        }
        for (int i=1; i<6; i++) {
            lista.insertEnd(i*10+5);
            System.out.println(lista);
        }
        if (lista.isEmpty()) {
            System.out.println("Lista Vazia");
        }
        else {
            System.out.println(lista.removeBegin() + " foi removido do inicio");
            System.out.println(lista);
        }
        if (lista.isEmpty()) {
            System.out.println("Lista Vazia");
        }
        else {
            System.out.println(lista.removeEnd() + " foi removido do final");
            System.out.println(lista);
        }
    }
}
