import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		float saldo = 0f;
		int numeroConta;
		String nome;
		String agencia;
		
		System.out.println("Bem-vindo ao banco");
		System.out.println();
		System.out.println("Por favor, digite o número da agência: ");
		agencia = sc.next();
		System.out.println("Por favor, digite o número da conta: ");
		numeroConta = sc.nextInt();
		System.out.println("Por favor, digite seu nome: ");
		nome = sc.next();
		System.out.println("Por favor, qual o valor de saldo da conta: ");
		saldo = sc.nextFloat();
			
		System.out.println("Olá "+ nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+" conta "+ numeroConta+" e seu saldo "+saldo+" já está disponível para saque.");
	}
}