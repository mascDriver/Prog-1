import javax.swing.*;
import java.util.*;
class  Cadastro{
	int data_de_nascimento;
    String cpf,nome,telefone,email,sexo,endereco,estado;
    Cadastro(String nome, String cpf, String nasc, String cargo, double salario){
		
		this.cpf = cpf;
		this.data_de_nascimento = data_de_nascimento;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.sexo = sexo;
		this.endereco = endereco;
		this.estado = estado;
	}	
	Cadastro(){
		
	} 
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
    }
}