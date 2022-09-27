package classe;

import java.util.Scanner;

public class TabuadaCondicao {
	
public static void main(String[] args) {
		
		System.out.println("Digite um Numero: ");
		 Scanner sc = new Scanner(System.in);
		 
			 int N = sc .nextInt();
		 
		 for (int i=1; i<=10; i++) {
			 int conta = i * N;
			 System.out.println(N + " x " + i + " = " + conta);
		 }
		 
		 char resp;
		 do {
			 System.out.println("Deseja Ver Outra Tabuada (s/n)");
			 resp = sc.next().charAt(0);
		    } while (resp != 'n');
	
		 sc.close();
	}


}
