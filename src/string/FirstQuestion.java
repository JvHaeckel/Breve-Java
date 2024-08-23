package string;

import java.util.Scanner;

/*1ª Questão: Implemente um programa para solicitar ao usuário que digite uma frase. O programa deverá calcular e exibir a 
 * quantidade de vogais da frase digitada. */

public class FirstQuestion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String frase;
		int tam, vogais = 0, consoantes = 0, espacos = 0, digito = 0;
		char caractere;

		System.out.print("Digite uma frase: ");
		frase = in.nextLine(); /* Pega até o enter */
		frase.toLowerCase();

		tam = frase.length();

		for (int i = 0; i < tam; i++) {
			caractere = frase.charAt(i);
			caractere = Character.toLowerCase(caractere);

			if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
				vogais++;
			} else if (caractere == ' ') {
				espacos++;
			} else if (Character.isDigit(caractere) == true) {
				digito++;
			} else {
				consoantes ++;
			}
		}

		/* Podemos fazer mais resumido: 
		 
		  if (Character.isLetter(caractere) == true) {
			vogais++;
		} else if (Character.isSpace(caractere) == true) {
			espacos++;
		} else if (Character.isDigit(caractere) == true) {
			digito++;
		} else {
			consoantes++;
		}
		*/

		System.out.println("Apareceram " + vogais + " vogais, " + consoantes + " consoantes, " + espacos + " espaços e "
				+ digito + " digitos");
	}
}
