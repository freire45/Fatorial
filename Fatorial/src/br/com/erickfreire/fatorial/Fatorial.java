package br.com.erickfreire.fatorial;

import java.util.Scanner;

/**
 * Programa em Java que calcula um valor Fatorial
 * @author Erick Freire
 * @version 1 - Criado em 13-04-2021 as 14:01
 */

public class Fatorial {
	public static void main(String[] args) {
		int numero;
		int contador;
		int resultado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que calcula um Fatorial: ");
		
		System.out.print("Informe um valor: ");
		numero = entrada.nextInt();
		
		while(numero < 0) {
			System.out.print("O valor tem que ser positivo, digite novamente: ");
			numero = entrada.nextInt();
		}
		
		contador = numero;
		resultado = numero;
		

		if(numero == 0) {
			System.out.println("%nO fatorial é 1!");
		} 
		
		if(numero == 1) {
			resultado = 1;
		} 
		
		while(contador >= 1) {
			
			if(contador > 1)
			   resultado = resultado * (contador - 1);
			
			contador--;
			
		}
		
		if(numero > 0)
		   System.out.printf("%nO Fatorial é de: %d", resultado);
	}

}
