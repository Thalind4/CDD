package Metodos;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o 1 numero:");
		int resp1=entrada.nextInt();
		
		
		System.out.println("Digite o 2 numero:");
		int resp2=entrada.nextInt();
		
		int cont= (resp1+resp2);
		
		System.out.println(cont);
	}
}
