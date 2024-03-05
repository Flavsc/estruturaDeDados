import java.util.Scanner;

public class OrdenaBusca {
    public static void main(String[] args) {
        MeuVetor v1 = new MeuVetor(10);
        Scanner sc = new Scanner(System.in);
        v1.preencheVetor();
        System.out.println("vetor gerado: " + v1);
        System.out.println("digite o valor para a busca: ");
        double x = sc.nextDouble();
        Retorno r = v1.buscaSimples(x);
        if (r.getAchou()) {
            System.out.println("Valor " + x + " encontrado no vetor.");
        }
        else{
            System.out.println("Valor " + x + " não encontrado no vetor.");
        }
        System.out.println("Foram realizadas " + r.getContador() + " buscas.");
        sc.close();
    }
}
