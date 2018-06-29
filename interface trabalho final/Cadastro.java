import java.util.*;
class Cadastro{
	int data_de_nascimento;
    String cpf,nome,telefone,email,sexo,endereco,estado; 
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