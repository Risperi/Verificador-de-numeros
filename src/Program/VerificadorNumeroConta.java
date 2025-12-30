package Program;
import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Digite o numero da conta: ");
                String numeroConta = scanner.nextLine();

                // chama a classe externa
                ValidadorNumeroConta.verificarNumeroConta(numeroConta);

                System.out.println("Numero de conta valido. \nPrograma finalizado!");
                break;

            } 
            
            catch (NumeroContaInvalidoException erro) {
                System.out.println("Erro: " + erro.getMessage());
                System.out.println("Tente novamente.\n");
            }
        }

        scanner.close();
    }
}
