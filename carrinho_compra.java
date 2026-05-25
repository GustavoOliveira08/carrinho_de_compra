import static java.lang.IO.println;
import static java.lang.IO.readln;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ArrayList<Double> preco = new ArrayList<>();
    LinkedList<String> produto = new LinkedList<>();
    double soma = 0;
    String sair = "fim";
    String nome = "";
    double maior = Double.MIN_VALUE;
    double menor = Double.MAX_VALUE;

    int i = 0;
    while(true){
        produto.add(nome);
        nome = readln("Qual é o produto cadastrado: ");
        if(nome.equalsIgnoreCase(sair)){
            break;
        }
        double valor = Double.parseDouble(readln("Qual é o Valor deste produto: "));
        preco.add(valor);
        println("produto cadastrado...");
        if(preco > maior){

        }
        soma += valor;
        i++;
    }
    println("Produtos cadastrados: " + produto.toString());
    println("Valor total: R$" + soma);
}
