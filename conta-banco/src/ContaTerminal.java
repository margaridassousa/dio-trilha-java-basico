import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //TODO1: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        //TODO2: Exibir as mensagens para o usuário
        //TODO3: Obter pela classe Scanner os valores digitados no terminal
        System.out.print("Digite o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.print("Informe a agência: ");
        String agencia = sc.nextLine();

        System.out.print("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe o saldo: ");
        double saldo = sc.nextDouble();
        sc.nextLine();

        //TODO4: Exibir a mensagem final/conta criada
        System.out.printf("Olá %s, obrigada por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nome, agencia, numeroConta, saldo);

        sc.close();
    }
}
