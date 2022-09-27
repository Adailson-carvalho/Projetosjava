package classe;

import java.util.Scanner;

public class Teste_Tabuada {
	
	 public static void main(String[] args) {
		 
		 System.out.println("Digite um numero: ");
		 Scanner teclado = new Scanner(System.in); 
		
		 
		 //declarar variavel int
		 int valor;
		 
		valor = teclado.nextInt();
		
		for (int i =0; i<=10; i++) {
		System.out.println(valor + " X " + i + " = " + (valor*i));
		
		}
	 }

}
