package modularizacao;

/* 4ª) Implemente um programa para calcular o volume de sólidos geométricos. Os sólidos  cujas áreas poderemos calcular serão: cubo, 
 esfera, cilindro e paralelepípedo. O  programa deverá ter quatro funções: uma para o cálculo de cada tipo de volume. 
 
(a) Função para calcular o volume de um cubo. Esta função deverá receber como  parâmetro de entrada o valor do lado do cubo e deverá 
retornar o volume calculado.

(b) Função para calcular o volume de um paralelepípedo. Esta função deverá receber como parâmetros de entrada os valores da altura, 
largura e comprimento do  paralelepípedo e deverá retornar o volume calculado. 

(c) Função para calcular o volume de uma esfera. Esta função deverá receber como parâmetro de entrada o valor do raio da esfera e 
deverá retornar o volume calculado.

(d) Função para calcular o volume de um cilindro. Esta função deverá receber como  parâmetros de entrada os valores da altura e raio
da base do cilindro e deverá  retornar o volume calculado. 

OBS1: Toda entrada de dados deve ser feita pelo programa principal. 

OBS2: O programa deverá ter um menu principal que permita ao usuário executar os  sub-programas quantas vezes desejar e só deverá terminar
 sua execução se o usuário  solicitar.
 */

import java.util.Scanner;

public class Volume {

	public static double volCubo(double a) {
		double volume = Math.pow(a, 3);
		return volume;
	}

	public static double volParalelepipedo(double h, double l, double c) {
		double volume = h * l * c;
		return volume;
	}

	public static double volEsfera(double r) {
		double volume = 4.0 / 3 * Math.PI * Math.pow(r, 3);
		return volume;
	}

	public static double volCilindro(double r, double h) {
		double aBase = Math.PI * Math.pow(r, 2);
		double volume = aBase * h;
		return volume;
	}

	public static void exibeMenu() {
		System.out.println("Tecle 1 - Volume do Cubo");
		System.out.println("Tecle 2 - Volume do Paralelepípedo");
		System.out.println("Tecle 3 - Volume da Esfera");
		System.out.println("Tecle 4 - Volume do Cilindro");
		System.out.println("Tecle 0 - Encerrar o programa");
		System.out.print("Sua opção: ");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int option;
		double lado, volume, raio, altura, largura, compri;
		System.out.println("Cálculo dos volumes");
		do {
			exibeMenu();
			option = in.nextInt();
			in.nextLine();

			switch (option) {

			case 0:
				System.out.println("Programa encerrado.");
				break;

			case 1:
				System.out.print("Informe o lado do cubo: ");
				lado = in.nextDouble();
				in.nextLine();

				while (lado < 0) {
					System.out.print("Lado inválido. Informe um valor maior que zero: ");
					lado = in.nextDouble();
					in.nextLine();
				}
				volume = volCubo(lado);
				System.out.println("O volume do cubo é igual a " + volume + " cm³");

				break;

			case 2:
				System.out.print("Informe a altura do paralelepípedo: ");
				altura = in.nextDouble();
				in.nextLine();

				while (altura < 0) {
					System.out.print("Altura inválida. Informe um valor maior que zero: ");
					altura = in.nextDouble();
					in.nextLine();
				}

				System.out.print("Informe a largura do paralelepípedo: ");
				largura = in.nextDouble();
				in.nextLine();

				while (largura < 0) {
					System.out.print("Largura inválida. Informe um valor maior que zero: ");
					largura = in.nextDouble();
					in.nextLine();
				}

				System.out.print("Informe o comprimento do paralelepípedo: ");
				compri = in.nextDouble();
			
				while (compri < 0) {
					System.out.print("Comprimento inválido. Informe um valor maior que zero: ");
					compri = in.nextDouble();
					in.nextLine();
				}

				volume = volParalelepipedo(altura, largura, compri);

				System.out.println("O volume do paralelepípedo é igual a " + volume + " m³");
				break;

			case 3:
				System.out.print("Informe o raio da esfera: ");
				raio = in.nextDouble();
				in.nextLine();

				while (raio < 0) {
					System.out.print("Raio inválido. Informe um valor maior que zero: ");
					raio = in.nextDouble();
					in.nextLine();
				}
				volume = volEsfera(raio);
				
				System.out.printf("O volume da esfera é igual a %.2f cm³ \n ", volume);
				break;

			case 4:
				System.out.print("Informe o raio da base do cilindro: ");
				raio = in.nextDouble();
				in.nextLine();

				System.out.print("Informe a altura do cilindro: ");
				altura = in.nextDouble();
				in.nextLine();

				while (raio < 0) {
					System.out.print("Raio inválido. Informe um valor maior que zero: ");
					raio = in.nextDouble();
				}
				volume = volCilindro(raio, altura);
				System.out.printf("O volume do cilindro é igual a %.2f \n", volume);
				break;

			default:
				System.out.println("Opção inválida.");
			}
		} while (option != 0);
	}
}
