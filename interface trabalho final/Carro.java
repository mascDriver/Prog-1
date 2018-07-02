import javax.swing.*;
import java.util.*;

class Carro{  
    String placa,modelo,fabricante,potencia;
    int capacidade_de_passageiros;
 	
 	void cadastro(){
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Digite a placa do carro");
 		placa = sc.next();
 		System.out.println("Digite o modelo do carro");
 		modelo= sc.next();
 		System.out.println("Digite o fabricante do carro");
 		fabricante = sc.next();
 		System.out.println("Digite a potencia do carro");
 		potencia = sc.next();
 		System.out.println("Digite a capacidade de passageiros do carro");
 		capacidade_de_passageiros = sc.nextInt();
 	}   
}