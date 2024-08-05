package modularizacao;

import java.util.Scanner;

/*1ª) Implemente um programa para fazer conversão de dólar-real e real-dólar. O  programa deverá ter os seguintes subprogramas:
(a) Função para converter reais em dólar. Esta função receberá como parâmetro de  entrada o valor em real a ser convertido e deverá 
calcular e retornar para o programa o valor correspondente em dólar. O programa se encarrega de exibir o resultado ao  usuário.  

(b) Função para converter dólar em real. Esta função receberá como parâmetro de  entrada o valor em dólar a ser convertido e deverá 
calcular e retornar para o programa o valor correspondente em real. O programa se encarrega de exibir o resultado ao usuário. 

OBS1: O programa deverá permitir que o usuário faça quantas conversões desejar e só  deverá terminar sua execução se o usuário solicitar. 
 
OBS2: Toda entrada e saída de dados deve ser feita pelo programa principal.*/

public class Conversao_Dinheiro2 {

	public static double realDolar(double real) {

		double resultado = real / 5;
		return resultado;
	}

	public static double DolarReal(double dolar) {

		double resultado = dolar * 5;
		return resultado;
	}

	public static void menu() {

		System.out.println("Digite 1 para converter de real para dolar");
		System.out.println("Digite 2 para converter de dolar para real");
		System.out.println("Digite 0 para finalizar");
		System.out.print("Sua opção: ");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double real, dolar, resultado;
		char resp = 'S';
		int option = 0;

		do {
			menu();
			option = in.nextInt();

			switch (option) {

			case 1:
				System.out.println("Digite o valor em real que será convertido em dolar: ");
				real = in.nextDouble();
				in.nextLine();

				resultado = realDolar(real);

				System.out.println("Na cotação atual o valor foi de: $" + resultado);
				break;
				
			case 2:
				System.out.println("Digite o valor que será convertido em real: ");
				dolar = in.nextDouble();
				in.nextLine();
			
				resultado = DolarReal(dolar);

				System.out.println("Na cotação atual o valor foi de: R$" + resultado);
				break;
				
			case 0:
				System.out.println("FIM");
				break;

			default:
				System.out.println("Error");
			}

		} while (option != 0);
	}
}
