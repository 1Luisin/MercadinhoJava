import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<>();
        int OpcaoUsuario = leitura.nextInt();           
        System.out.println("\n ---MENU---");
        System.out.println("\n1 - Cadastrar produtos");
        System.out.println("\n2 - Listar produtos.");
        System.out.println("\n3 - Buscar por um produto.");
        System.out.println("\n4 - Encerrar programa.");

        switch (OpcaoUsuario){
            case 1:
            System.out.println("");

        }
        

    }
}
