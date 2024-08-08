package modularizacao;

import java.util.Scanner;

/*3ª) Um banco concederá um crédito pessoal aos seus clientes de acordo com seu saldo médio no último ano. Implemente uma função que 
 * receba como parâmetro o valor do  saldo médio do cliente no último ano, calcule e retorne o valor do crédito que será dado a ele. 
 * O cálculo deve ser feito de acordo com a tabela abaixo. Para cada cliente, o  programa principal deverá exibir a seguinte frase: 
 * “Para um saldo médio igual a  R$___, será dado um crédito de R$___.” 

Valor do Saldo Médio                        Valor do Crédito 

Até R$ 200,00                                10% do saldo médio 
Acima de R$ 200,00 até R$ 300,00             20% do saldo médio 
Acima de R$ 300,00 até R$ 400,00             25% do saldo médio 
Acima de R$ 400,00                           30% do saldo médio 

OBS1: Para o fornecimento do crédito, o saldo médio do cliente não pode ser negativo ou nulo. Caso seja, deve ser informado ao cliente
que ele não terá direito ao benefício; 

OBS2: A quantidade de clientes que utilizarão o programa para fazer o cálculo de seu crédito pessoal não é previamente conhecida. Desta 
forma, a cada cálculo realizado, deve-se perguntar ao usuário se ele deseja efetuar um novo cálculo. A esta pergunta o usuário deverá 
responder S ou N. O programa não deve aceitar nenhum outro valor de resposta. 
 */

public class Banco {

	
	public static double credito(double saldo) {

		double credito;

		if (saldo < 200) {
			credito = 0.1 * saldo;
		} else if (saldo <= 300) {
			credito = 0.25 * saldo;
		} else if (saldo <= 400) {
			credito = 0.25 * saldo;
		} else {
			credito = 0.30 * saldo;
		}
		return credito;
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double saldo, validaSaldo = 0,validaCredito;
		char resp = 'S';
		
		do {
			System.out.println("Digite seu saldo: ");
			saldo = in.nextDouble();
			in.nextLine();
			
			 
			System.out.println("Seu saldo foi de: " + saldo + " assim vamos avaliar seu credito");
			
			validaCredito = credito(saldo);
			
			System.out.println("Seu crédito foi de: R$" + validaCredito);
			
			
			System.out.println("Deseja continuar digite S para sim e N para nope: ");
			resp = in.next().charAt(0);
			resp = Character.toUpperCase(resp);
			
			while(resp != 'N' && resp != 'S') {
				System.out.println("ERROR digite S para sim e N para nope: ");
				resp = in.next().charAt(0);
				resp = Character.toUpperCase(resp);
			}
			
		} while (resp != 'N');
		
	}

}
