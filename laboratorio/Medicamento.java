import java.util.Scanner;
class Medicamento{
	Scanner sc = new Scanner(System.in);
	Laboratorio laboratorio = new Laboratorio();
	String nome, nomelaboratorio;
	double precoVenda;
	int qtdEstoque;
	boolean receitaOrigatoria=true,opcao1;
	Medicamento(){
		this.nome="Paraceamol";
		this.nomelaboratorio=laboratorio.nomeFantasia;
		this.precoVenda= 2.50;
		this.qtdEstoque = 10;
	}
	void reajustarPreco(double percentual){
		System.out.println("digite a porcentagem de alteração do valor do produto, 10 para 10%");
		percentual = sc.nextDouble();
		precoVenda=(percentual/100)*precoVenda;
		System.out.println("Novo valor"+precoVenda);

	}
	void vender(int quantidade){
		if(receitaOrigatoria == true){
			System.out.println("Medicamento vendido apenas com receita, o comprador possue? true ou false");
			opcao1 = sc.nextBoolean();
		}
		else{

		}
		if(opcao1 == receitaOrigatoria){
			System.out.println("Digite a quantidade desejada");
			quantidade = sc.nextInt();
			if(quantidade>qtdEstoque){
				System.out.println("Nao foi possivel fetuar a venda por fala de estoque");
			}
			else{
				qtdEstoque-=quantidade;
				precoVenda = quantidade*precoVenda;
				System.out.println("Total da compra:"+precoVenda);
			}
		}
		else{
			System.out.println("Receita obrigatoria");
		}

	}
	void comprar(int quantidade){
		quantidade = sc.nextInt();
		qtdEstoque+=quantidade;
		System.out.println("Estoque atual "+qtdEstoque);
	}
	void mostra(){
		System.out.println("\nNome: "+nome+"\nData de validade: "+dataValidade+"\nNome do laboratorio: "+nomelaboratorio+"\nquantidade disponivel: "+qtdEstoque+"\npreco de venda: "+precoVenda);
	}
}