package classe;

import java.util.Scanner;

public class Tabuada2 {
	
	public static void main(String[] args) {
		
		int i = 1;
		
		System.out.println("=== Taboada Usando laço While ==");
		
		 System.out.println("Digite um numero: ");
		 Scanner teclado = new Scanner(System.in);
		
		while (i <=10) {
			System.out.println("9 X "+i+ " = " +9*i);
			i++;
		}
		
		i =1;
		
		System.out.println("== Taboada Usando laço Do While ==");
		
		do {
			System.out.println("9 X "+i+ " = "+9*i);
			i++;
		}while (i<=10);
	}

}
