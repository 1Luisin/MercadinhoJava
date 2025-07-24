import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        
        int OpcaoUsuario = leitura.nextInt(); 
        
        do {
        ArrayList<Produto> produtos = new ArrayList<>();         
        System.out.println("\n ---MENU---");
        System.out.println("\n1 - Cadastrar produtos");
        System.out.println("\n2 - Listar produtos.");
        System.out.println("\n3 - Buscar por um produto.");
        System.out.println("\n4 - Encerrar programa.");
         
        
        switch (OpcaoUsuario){
            case 1:
            System.out.println("Digite o nome do produto:");
            String nome = leitura.next();
            System.out.println("Digite o preço do produto:");
            Float preco = leitura.nextFloat();
            System.out.println("Digite a(s) quantidade(s) de produto(s)");
            int quantidade = leitura.nextInt();
            leitura.nextLine();

            Produto novo = new Produto(nome, preco, quantidade);
            produtos.add(novo);
            System.out.println("Produto: " + novo + "Cadastrado com sucesso!");
            break;

            case 2: 
                System.out.println("\n ----Lista de Produtos----");
                for (Produto p : produtos) {
                    p.exibirDetalhes();
                    System.out.println("-----------------");
                }
                 break;
                
                 case 3:   
            
            System.out.print("Digite o nome do produto a buscar: ");
                    String busca = leitura.nextLine();
                    boolean encontrado = false;
                    for (Produto p : produtos) {
                        if (p.nome.equalsIgnoreCase(busca)) {
                            p.exibirDetalhes();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
        }
        
       } while (OpcaoUsuario != 4);
    }
}
