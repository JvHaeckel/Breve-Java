package intro;

import java.util.Scanner;

/* Exercícios de While */

public class While4 {

	/*
	 * 4 – Faça um programa que receba a idade (1 a 120), o peso (3 a 300), a altura
	 * (0.5 a 2.5), a cor dos olhos (A - azul, P - preto, V- verde e C - castanho) e
	 * a cor dos cabelos (P - preto, C - Castanho, L - Louro e R - ruivo). A
	 * quantidade de pessoas do grupo deve ser informada pelo usuário no início do
	 * programa e deve ser, no mínimo, 1. O programa deve calcular e exibir:
	 * 
	 * •Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60Kg;
	 * •A média das idades das pessoas com altura inferior a 1,50; •A percentagem de
	 * pessoas com olhos azuis entre todas as pessoas; •A quantidade de pessoas
	 * ruivas e que não possuem olhos azuis.
	 * 
	 * OBS: Para todas as entradas, o programa deve forçar valores válidos.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int idade;
		double peso, altura;
		char resp = 'S', olhos, cabelo;

		while (resp == 'S') {
			
			System.out.print("Digite a idade: ");
			idade = input.nextInt();
			input.nextLine();/* limpar o buffer */	

			while (idade > 120) {
				System.out.println("Error, digite a idade novamente: ");
				idade = input.nextInt();
				input.nextLine();/* limpar o buffer */	
			}

			System.out.print("Digite o peso: ");
			peso = input.nextDouble();
			input.nextLine();/* limpar o buffer */	
			
			while (peso < 10 || peso > 300) {
				System.out.print("Error, digite o peso novamente: ");
				peso = input.nextDouble();
				input.nextLine();/* limpar o buffer */	
			}

			System.out.print("Digite o altura: ");
			altura = input.nextDouble();
			input.nextLine();/* limpar o buffer */	
			
			while (altura < 0.5 || altura > 3) {
				System.out.print("Error, digite a altura novamente: ");
				altura = input.nextDouble();
				input.nextLine();/* limpar o buffer */	
			}

			System.out.print("Digite a cor dos olhos A - azul, P - preto, V-  verde e C - castanho: ");
			olhos = input.next().charAt(0);
			olhos = Character.toUpperCase(olhos);  /* Coloquei no print maisculo logo obriguei a ficar em caixa alta */
			input.nextLine();/* limpar o buffer */	


			while (olhos != 'A' && olhos != 'P' &&  olhos != 'V' &&  olhos != 'C') {
				System.out.print("Digite a cor dos olhos novamente: " );
				olhos = input.next().charAt(0);
				olhos = Character.toUpperCase(olhos);  
				input.nextLine();/* limpar o buffer */
			}


			System.out.print("Digite a cor dos cabelos P - preto, C - Castanho, L - Louro e R - ruivo: ");
			cabelo = input.next().charAt(0);
			cabelo = Character.toUpperCase(cabelo);
			input.nextLine();/* limpar o buffer */

			while (cabelo != 'A' && cabelo != 'P' && cabelo != 'V' && cabelo != 'C') {
				System.out.print("Digite a cor dos cabelos novamente: ");
				cabelo = input.next().charAt(0);
				cabelo = Character.toUpperCase(cabelo);
				input.nextLine();/* limpar o buffer */
			}
			
			System.out.print("Deseja continuar digite S para sim e N para não: ");
			resp = input.next().charAt(0);
			resp = Character.toUpperCase(resp);  /* Coloca-se para deixar a letra maiúscula*/

		}

	}

}
