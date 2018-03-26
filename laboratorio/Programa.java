import java.util.Scanner;
class Programa{
	public static void main(String args[]){
		int opcao,quantidade=0;
		double percentual = 0;
		Scanner sc =  new Scanner(System.in);
		Medicamento medicamento = new Medicamento();
		Laboratorio laboratorio = new Laboratorio();
		do{
			System.out.println("1-Comprar\n2-Vender\n3-Reajustar Preço\n4-Mostrar medicamento\n0-Sair\n");	
			System.out.println("Digite o numero para acesso ao sistema");
			opcao = sc.nextInt();
			switch(opcao){
				case 1:
					medicamento.comprar(quantidade);				
					break;
				case 2:
					medicamento.vender(quantidade);
					break;
				case 3:
					medicamento.reajustarPreco(percentual);
					break;
				case 4:
					medicamento.mostra();
					break; 
				default:
					break;


			}
		}while(opcao!=0);
	}
}