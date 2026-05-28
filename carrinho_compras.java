import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class carrinho_compras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> preco = new ArrayList<>();
        LinkedList<String> produto = new LinkedList<>();
        double soma = 0;
        String sair = "fim";
        String nome = "";
        double valor = 0;
        double maior = Double.MIN_VALUE;
        String itemCaro = "";
        int i = 0;
        while(true){
            System.out.print("Nome do produto: ");
            nome = entrada.nextLine();
            if(nome.equalsIgnoreCase(sair)){
                break;
            }
            produto.add(nome);

            System.out.print("valor do produto: ");
            valor = entrada.nextDouble();
            entrada.nextLine();
            preco.add(valor);
            soma += valor;
            if(valor > maior){
                maior = valor;
                itemCaro = nome;
            }
            System.out.println("produto cadastrado...");
            i++;
        }
        System.out.println("--- PRODUTO E VALORES ---");
        for( int x = 0; x < produto.size(); x++){
            System.out.printf( "Produto: %s | Preço: R$%.2f%n", produto.get(x), preco.get(x));
        }
        System.out.println("--- PRODUTO & TOTAL ---");
        System.out.println("Produtos cadastrados: " + produto.toString());
        System.out.printf("Valor total: R$%.2f%n", soma);
        System.out.println("--- PRODUTO EM DESTAQUE ---");
        System.out.printf("Nome: %s%nValor: %.2f", itemCaro, maior);
    }
}

