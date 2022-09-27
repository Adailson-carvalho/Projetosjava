package Operadores;

public class OperadoresIgualdadeNegacao {
	public static void main(String[] args) {
		//boolean numerosIguais = 10 == 10;
		//boolean numerosIguais = (10 + 6) == (5 *2);
		
		int numero1 = 10;
		int numero2 = 11;
		//boolean numerosIguais = numero1 == 10;
		boolean numerosIguas = numero1 == numero2;
		
		//boolean numerosDiferentes = !numerosIguais;
		//boolean numerosDiferentes = !numero1 == numero2;
		boolean numerosDiferentes = numero1 !=numero2;
		
		System.out.printf("Números iguais: %b%n", numerosIguas);
		//System.out.printf("Números iguais: %b%n", numero1 == numero2);
		
		System.out.printf("Números iguais: %b%n", numerosDiferentes);
		
		String nome1 = "Adailson";
		String nome2 = "Adailson";
		
		boolean nomesIguais = nome1 == nome2;
		
		
		System.out.printf("Números iguais: %b%n", nomesIguais);
	}

}
