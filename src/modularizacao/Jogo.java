package modularizacao;

import java.util.Scanner;

/* Imagine que para as semifinais da Copa do Mundo Fifa 2020 irão as  seguintes seleções: A- Brasil, B- França, C – Uruguai e D – Japão.
 *Nos jogos das  semifinais, Brasil jogaria com Japão, e França jogaria com Uruguai. Implemente um  programa para, dado o placar dos
 *dois jogos das semifinais, informar quais seleções irão disputar a grande final e quais seleções irão disputar o 3º lugar. Para 
 *tal, o  programa deverá ter os seguintes subprograma: 
 
(a) O main irá solicitar ao usuário que informe o placar dos dois jogos, ou seja,  quantos gols cada time fez. O programa deverá forçar
 que sejam informadas  quantidades de gols maiores ou iguais a zero. Lembre-se que não é possível ter empate nas semifinais. De posse 
 do placar validado dos dois jogos, o programa  deverá chamar o procedimento definido no item (b) para informar o nome das seleções 
 que irão disputar a grande final e o nome das seleções que irão disputar o  3º lugar.

(b) Um procedimento que receba, como parâmetro, o placar dos dois jogos das semifinais e irá informar ao usuário o nome das seleções
 que irão disputar a  grande final e o nome das seleções que irão disputar o 3º lugar. Para saber quem  ganhou um jogo, o procedimento
  deverá fazer uso, OBRIGATORIAMENTE, da  função definida no item (c). 

(c) Uma função que recebe como parâmetro o placar de um jogo e retorna 1, se o primeiro time tiver ganhado o jogo, ou 2, se o segundo
 time tiver ganhado o jogo. 

OBS: O programador é livre para definir outros procedimentos ou funções, caso  julgue necessário. */

public class Jogo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int brGoal, frGoal, uruGoal, jaGoal, receba;

		System.out.println("Digite quantos gols o Brasil fez: ");
		brGoal = in.nextInt();
		in.nextLine();
		while (brGoal < 0 || brGoal > 20) {
			System.out.println("ERROR, Digite quantos gols o Brasil fez: ");
			brGoal = in.nextInt();
			in.nextLine();
		}

		System.out.println("Digite quantos gols França fez: ");
		frGoal = in.nextInt();
		in.nextLine();
		while (frGoal < 0 || frGoal > 20) {
			System.out.println("ERROR, Digite quantos gols  França fez: ");
			frGoal = in.nextInt();
			in.nextLine();
		}

		System.out.println("Digite quantos gols o Urugai fez: ");
		uruGoal = in.nextInt();
		in.nextLine();
		while (uruGoal < 0 || uruGoal > 20) {
			System.out.println("ERROR, Digite quantos gols o Urugai fez: ");
			uruGoal = in.nextInt();
			in.nextLine();
		}

		System.out.println("Digite quantos gols o Japão fez: ");
		jaGoal = in.nextInt();
		in.nextLine();
		while (jaGoal < 0 || jaGoal > 20) {
			System.out.println("ERROR, Digite quantos gols o Japão fez: ");
			jaGoal = in.nextInt();
			in.nextLine();
		}
	Informa(brGoal, frGoal, jaGoal, uruGoal );
	

	}

	public static int Placar(int x, int y ) {
		
		if (x > y) {
			return 1;
		} else { return 2;  }

	}

	public static void Informa(int brGoal,int frGoal,int jaGoal,int uruGoal) {

		if (Placar(brGoal, jaGoal) == 1) {
			System.out.println("Brasil ganhou vai na final");
			System.out.println("Japão perdeu ");
		} else {
			System.out.println("Japão ganhou vai na final");
		}
		
		if (Placar(frGoal, uruGoal) == 1) {
			System.out.println("França ganhou vai na final");
			System.out.println("Urugai perdeu");
		} else {
			System.out.println("Urugai ganhou vai na final");
		}
		
	}

}
