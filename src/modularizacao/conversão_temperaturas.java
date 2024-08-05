package modularizacao;

import java.util.Scanner;

/*
2ª) Implemente um programa para fazer conversão de temperaturas em graus Fahrenheit para graus Celsius e vice-versa. 
O programa deverá apresentar os seguintes  subprogramas: 

(a) Função para converter temperaturas em graus Fahrenheit para graus Celsius. Esta  função receberá como parâmetro 
de entrada o valor da temperatura em graus Fahrenheit a ser convertido e deverá calcular e retornar para o programa o 
valor  correspondente em graus Celsius. O programa se encarrega de exibir o resultado  ao usuário.  

(b) Função para converter temperaturas em graus Celsius para graus Fahrenheit. Esta  função receberá como parâmetro de
 entrada o valor da temperatura em graus Celsius  a ser convertido e deverá calcular e retornar para o programa o valor 
 correspondente  em graus Fahrenheit.

 O programa se encarrega de exibir o resultado ao usuário. 
OBS1: O programa deverá permitir que o usuário faça quantas conversões desejar e só  deverá terminar sua execução se o 
usuário solicitar.  

OBS2: Toda entrada e saída de dados deve ser feita pelo programa principal. 

OBS3: Para as conversões, utilize as fórmulas abaixo: 

F = C * 1.8 + 32 
C = (fahr - 32) / 1.8;

 */

public class conversão_temperaturas {

	
	public static void menu() {

		System.out.println("Para converter de Celsius para Fah digite 1");
		System.out.println("Para converter de Fah para Celsius digite 2");
		System.out.println("Finalizar digite 0");
		System.out.print("Digite sua opção: ");

	}
	
	public static double farToCelsius(double temp) {

		double result = (temp - 32) / 1.8;
		return result;
	}

	public static double celsiusToFar(double temp) {

		double result = (temp * 1.8) + 32;
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int option;
		double celsius, fah;

		do {
			menu();
			option = in.nextInt();

			switch (option) {

			case 1:
				System.out.println("Digite a temperatura em Celsius: ");
				celsius = in.nextDouble();
				in.nextLine();
				while (celsius < -273) {
					System.out.println("Error digite novamente: ");
					celsius = in.nextDouble();
					in.nextLine();
				}
				
				fah = celsiusToFar(celsius);
				System.out.println("O valor foi de: " + fah);

				break;

			case 2:
				System.out.println("Digite a temperatura em Fah: ");
				fah = in.nextDouble();
				in.nextLine();
				while (fah < -459) {
					System.out.println("Error digite novamente: ");
					fah = in.nextDouble();
					in.nextLine();
				}
		
				celsius = farToCelsius(fah);
				System.out.println("O valor foi de: " + celsius);
				
				break;

			case 0:
				System.out.println("Fim");
				break;

			default:
				System.out.println("Error ");

			}

		} while (option != 0);

	}
}