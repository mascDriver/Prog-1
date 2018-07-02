import javax.swing.*;
import java.util.*;
class Cliente extends Cadastro{
	void cliente(){
	Scanner sc = new Scanner(System.in);
	System.out.println("1- Cadastrar cliente\n2- ");
    int n = sc.nextInt();
	    do{
	    	switch(n){
		    	case 1:
		    		cadastrar();
		    		break;
		    	}
			System.out.println("1- Cadastrar cliente\n2- \n0- sair");
		    n = sc.nextInt();
		}while(n!=0);
	}
	
}