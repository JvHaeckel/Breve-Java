package modularizacao;

import java.util.Scanner;

/*1ª) Faça um programa para fazer a conversão de um tempo expresso em horas e minutos  para um tempo expresso apenas em minutos e 
vice-versa. O programa deverá apresentar  os seguintes subprogramas: 

(a) Função para converter um tempo expresso em horas e minutos para um tempo expresso apenas em minutos. Esta função receberá como 
parâmetro o tempo  expresso em horas e minutos a ser convertido e deverá calcular e retornar para o  programa o valor correspondente 
do tempo em minutos. O programa se encarrega  de exibir o resultado ao usuário.  

(b) Procedimento para converter um tempo expresso em minutos para um tempo  expresso em horas e minutos. Este procedimento receberá 
como parâmetro, passado  por valor, o tempo expresso em minutos a ser convertido, deverá calcular e exibir o  tempo correspondente 
expresso em horas e minutos.
 
OBS1: Toda entrada de dados deve ser feita pelo programa principal.
OBS2: O programa deverá ter um menu principal que permita ao usuário executar os  sub-programas quantas vezes desejar e só deverá 
terminar sua execução se o usuário solicitar.  
 */

public class ConverterTime {

	public static void menu() {

		System.out.println("Digite 1 para converter as horas em minutos ");
		System.out.println("Digite 2 para converter os minutos em horas ");
		System.out.print("Sua opção: ");
	}

	public static double convertMinutos(double horas, double minutos) {

		horas = horas * 60;
		return horas + minutos;

	}
	
	public static void horasMinutos (int horas) {
		 int h,m;
	        h = horas/ 60;
	        m = horas % 60;
	        System.out.println(horas +" Vale a "+ h +"horas e "+ m + " minutos");
	        }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int option, minutos;
		double horas, horasConvertidas;
		char resp = 'S';

		do {
			menu();
			option = in.nextInt();
			in.nextLine();

			while (option != 1 && option != 2) {
				System.out.println("ERROR , sua opção: ");
				option = in.nextInt();
				in.nextLine();
			}

			switch (option) {

			case 1:
				System.out.println(
						"Optou por converter um tempo expresso em horas e minutos para um tempo expresso apenas em minutos: ");
				System.out.println("Digite as horas: ");

				horas = in.nextInt();
				in.nextLine();

				while (horas < 0) {
					System.out.println("ERROR, Digite as horas:");
					horas = in.nextInt();
					in.nextLine();
				}
				System.out.println("Digite os minutos: ");
				minutos = in.nextInt();
				in.nextLine();

				while (minutos < 0) {
					System.out.println("ERROR, Digite os minutos:");
					minutos = in.nextInt();
					in.nextLine();
				}

				horasConvertidas = convertMinutos(horas, minutos); // Por ser função vamos atribuir uma variável e
																	// chamar a função passando os inputs
				System.out.println("Deu tudo: " + horasConvertidas);

				break;

			case 2:
				System.out.println(
						"Optou por converter um tempo expresso em minutos para um tempo expresso em horas e minutos: ");
				System.out.println("Digite os minutos: ");
				minutos = in.nextInt();
				in.nextLine();
				
				horasMinutos(minutos);
				
				
				
				
				break;
			case 0:
				System.out.println("Acabou");
				break;

			default:
				System.out.println("Error");
			}
			System.out.println("Deseja continuar? Digite s para sim e N para não: ");
			resp = in.next().charAt(0);
			resp = Character.toUpperCase(resp);
			in.nextLine();

			while (resp != 'S' && resp != 'N') {
				System.out.println("ERROR, Deseja continuar? Digite s para sim e N para não: ");
				resp = in.next().charAt(0);
				resp = Character.toUpperCase(resp);
				in.nextLine();
			}

		} while (resp == 'S');

	}

}
