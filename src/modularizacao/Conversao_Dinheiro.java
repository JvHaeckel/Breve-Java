package modularizacao;

import java.util.Scanner;

/*1ª) Implemente um programa para fazer conversão de dólar-real e real-dólar. O  programa deverá ter os seguintes subprogramas:
(a) Função para converter reais em dólar. Esta função receberá como parâmetro de  entrada o valor em real a ser convertido e deverá 
calcular e retornar para o programa o valor correspondente em dólar. O programa se encarrega de exibir o resultado ao  usuário.  

(b) Função para converter dólar em real. Esta função receberá como parâmetro de  entrada o valor em dólar a ser convertido e deverá 
calcular e retornar para o programa o valor correspondente em real. O programa se encarrega de exibir o resultado ao usuário. 

OBS1: O programa deverá permitir que o usuário faça quantas conversões desejar e só  deverá terminar sua execução se o usuário solicitar. 
 
OBS2: Toda entrada e saída de dados deve ser feita pelo programa principal.*/

public class Conversao_Dinheiro {

	public static double realDolar(double real) {

		double resultado = real / 5;
		return resultado;

	}

	public static double DolarReal(double dolar) {

		double resultado = dolar * 5;
		return resultado;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double real, dolar, resultado;
		char resp = 'S';
		int option;

		while (resp == 'S') {

			System.out.println("Para converter de real para dolar digite 1, para a outra digite 2: ");
			option = in.nextInt();
			in.nextLine(); /* Limpar o Bufffer */

			while (option != 1 && option != 2) {
				System.out.println("ERROR, Para converter de real para dolar digite 1, para a outra digite 2: ");
				option = in.nextInt();
				in.nextLine(); /* Limpar o Bufffer */

			}

			switch (option) {

			case 1:
				System.out.println("Digite o valor em real que será convertido em dolar: ");
				real = in.nextDouble();
				in.nextLine();

				resultado = realDolar(real);

				System.out.println("Na cotação atual o valor foi de: " + resultado);

				break;
			case 2:
				System.out.println("Digite o valor que será convertido em real: ");
				dolar = in.nextDouble();   in.nextLine();
				resultado = DolarReal(dolar);

				System.out.println("Na cotação atual o valor foi de: " + resultado);

				break;

			default:
				System.out.println("Error");
			}

			System.out.println("Deseja continuar? Digite S para sim e N para não");
			resp = in.next().charAt(0); /* Aceitar a resp */
			resp = Character.toUpperCase(resp); /* Colocar a resp em letra minùscula */

			while (resp != 'S' && resp != 'N') {
				System.out.println("ERROR,Deseja continuar? Digite S para sim e N para não");
				resp = in.next().charAt(0); /* Aceitar a resp */
				resp = Character.toUpperCase(resp); /* Colocar a resp em letra minùscula */
				in.nextLine();
			}

		}

	}

}
