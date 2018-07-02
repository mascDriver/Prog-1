import javax.swing.*;
import java.util.*;
class Funcionario  extends Cadastro{	
	private String login,senha,senha1;
	void funcionario(){
		Scanner sc = new Scanner(System.in);
    	System.out.println("1- Cadastrar Funcionario\n2- ");
		int n = sc.nextInt();	
	    do{
    		switch(n){
		    	case 1:
		    		cadastrar();
		    		break;
		    	case 2:
		    		break;		
			}
			System.out.println("1- Cadastrar Funcionario\n2- ");
			n = sc.nextInt();
		    
		}while(n!=0);	
	}
	@Override
	void cadastrar(){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Insira o CPF");
    	cpf = sc.next();
    	System.out.println("Insira data_de_nascimento");
    	data_de_nascimento = sc.nextInt();
    	System.out.println("Insira o nome");
    	nome = sc.next();
    	System.out.println("Insira o telefone");
    	telefone= sc.next();
    	System.out.println("Insira o email");
    	email= sc.next();
    	System.out.println("Insira o sexo");
    	sexo= sc.next();
    	System.out.println("Insira o endereço");
    	endereco= sc.next();
    	System.out.println("Insira o estado");
    	estado= sc.next();
    	System.out.println("Insira o login");
    	login = sc.next();
    	System.out.println("Insira a senha");
    	senha = sc.next();
	    do{
	    	if(senha != senha1){
	    		System.out.println("Confirme a senha");
	    		senha1 = sc.next();
	    	}
	    	else{
	    		break;
	    	}
	    }while(false);
    	
    }
    void setSenha(String senha){
    	this.senha = senha;
    }
    String getSenha(){
    	return senha;
    } 
    void setLogin(String login){
    	this.login = login;
    }
    String getLogin(){
    	return login;
    }
}