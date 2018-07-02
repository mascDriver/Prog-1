import javax.swing.*;
import java.util.*;

class Locacao {
	Scanner sc = new Scanner(System.in);
	String login,senha;
	int tent=3,j;
	void locar(Funcionario[] funcionario, int k,Cliente[] cliente, int i){
		System.out.println("Digite seu login");
		login = sc.next();
		for(j=0;j<k;j++){	
			if(funcionario[j].getLogin().equals(login)){
				System.out.println("Digite sua senha");
				senha = sc.next();
				if(tent <= 0){
					System.out.println("Excedeu numero de tentativas");
					return;
				}
				if(funcionario[j].getSenha().equals(senha)){
					System.out.println("Bem vindo"+funcionario[j].getLogin());
					alugar(cliente,i);
				}
				else{
					System.out.println("Senha incorreta");
					tent--;
				}
			}
		}
	}

	void alugar(Cliente[] cliente, int i){
		int op,op1;
		System.out.println("Qual cliente deseja alugar(Digite o id)?");
		for(j=0;j<i;j++){
			System.out.println("Id"+i+"Nome"+cliente[i].nome);
		}
		op = sc.nextInt();
		System.out.println("Qual carro o"+cliente[op]+"deseja alugar(Digite o id)?");
		
	}
}