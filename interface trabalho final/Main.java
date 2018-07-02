import javax.swing.*;
import java.util.*;
class Main{
	public static void main(String[] args) {
		Cadastro cadastro = new Cadastro();
		Cliente cliente[] = new Cliente[3];
		Carro carro[] = new Carro[3];
		Locacao locacao[] = new Locacao[3];
		Funcionario funcionario[] = new Funcionario[3];
		int n,i=0,j,k=0,l=0,m=0;;
		Scanner sc = new Scanner(System.in);
		System.out.println("1- Acessar o menu cliente\n2- Acessar o menu funcionario\n3- Cadastrados\n4- Cadastrar carro\n5- Locação\n0- sair");
		n = sc.nextInt();
		do{
			switch(n){
				case 1:
					cliente[i] = new Cliente();
	    			cliente[i].cliente();	    			
	    			i++;
					break;
				case 2:
					funcionario[k] = new Funcionario();
					funcionario[k].funcionario();
					k++;
					break;
				case 3:
					int sub;
					System.out.println("1- Clientes Cadastrados\n2- Funcionarios Cadastrados\n ");
					try{
						sub = sc.nextInt();
						switch(sub){
							case 1:
								for (j=0;j<i;j++) {
									System.out.println("Nome"+cliente[j].nome);
								}
								break;
							case 2:
								for (j=0;j<k;j++) {
									System.out.println("Nome"+funcionario[j].nome+funcionario[j].getLogin());
								}
								break;
						}
					}catch(java.lang.NullPointerException erro){
							System.out.println("Erro ao imprimir sem cadastrar\n");
					}
					break;
					
				case 4:
					carro[l] = new Carro();
					carro[l].cadastro();
					l++;
					break;
				case 5:
					locacao[m] = new Locacao();
					locacao[m].locar(funcionario,k,cliente,i);
					m++;
					break;
			}
			System.out.println("1- Acessar o menu cliente\n2- Acessar o menu funcionario\n3- Cadastrados\n4- Cadastrar carro\n5- Locação\n0- sair");
			n = sc.nextInt();
			
		}while(n!=0);	
	}
}