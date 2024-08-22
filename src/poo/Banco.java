package poo;

import java.util.Scanner;

/*Faça um caixa eletrônico no qual, o usuário precise digitar o número da conta para verificar saldo depositar e sacar */

public class Banco {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String nome;

		System.out.print("Bem vindo ao Banco Pix, digite seu nome: ");
		nome = in.nextLine(); /* next line - pega até o enter */
		nome = nome.toUpperCase(); /* Deixa maiúsculo */

		/* Validar da forma mais simples sem precisar de Criar uma Function */
		while (!nome.matches("[a-zA-Z]+")) {
			System.out.print("Apenas letras, digite novamente: ");
			nome = in.nextLine(); /* next line - pega até o enter */
			nome = nome.toUpperCase(); /* Deixa maiúsculo */
		}

	}

}
