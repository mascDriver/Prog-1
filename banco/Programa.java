import java.util.Scanner;
class Programa{
	public static void main(String[] args){
		Conta minhaConta;
		minhaConta = new Conta();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do titular");
		minhaConta.dono = sc.nextLine();

		System.out.println("Digite o saldo da Conta");
		minhaConta.saldo = sc.nextInt();

		System.out.println("Conta da: "+minhaConta.dono);

		System.out.println(minhaConta.dono+" seu saldo é de:" +minhaConta.saldo);
		System.out.println("Deseja sacar?");
		char opcao = sc.next().charAt(s);;
		if(opcao == 's'){
			double saque = sc.nextDoubel();
			minhaConta.saldo-=saque;
			System.out.println("Saldo atual"+minhaConta.saldo);
		}
		
	}
}