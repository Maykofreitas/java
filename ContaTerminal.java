import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

             System.out.println("Digite o numero da Agencia :");
             Integer agencia = scanner.nextInt();

             System.out.println("Digite o numero da conta:");
             Integer conta = scanner.nextInt();             

             System.out.println("Qual Seu Nome?");
             String Nome = scanner.next();

             System.out.println("Qual valor deseja depositar?");
             double valor = scanner.nextDouble();

             System.out.println("Ola "+ Nome + ",Obrigado por criar uma conta em nosso banco, sua agencia "+agencia+", conta"+conta+"e seu saldo de:"+ valor+ "ja esta disponivel para saque");
    }

}