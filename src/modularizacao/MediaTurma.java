package modularizacao;

import java.util.Scanner;

/* 1ª Questão: Implemente um programa para determinar e exibir o conceito de cada um dos 60 alunos de uma turma em uma determinada
 *  disciplina. Para cada aluno da turma, o programa deverá solicitar a nota da primeira e a da segunda avaliação,  calcular a média
 *  e determinar o conceito. Para tal, o programa deverá ser composto  pelos seguintes subprogramas: 
(a) Uma função que recebe a média de um aluno como parâmetro e retorna o seu  conceito, conforme a tabela abaixo: 

      Média           Conceito
0,0 ≤ média < 5,0        D
5,0 ≤ média < 7,0        C
7,0 ≤ média < 9,0        B
9,0 ≤ média ≤ 10,0       A

(b) Um procedimento que receba a nota da primeira e a nota da segunda avaliação,  passadas como parâmetro, calcule a média do aluno 
(média aritmética simples) e  determine o seu conceito (utilizado a função definida no item (a)). Ao final, o  procedimento deverá 
exibir a média e o conceito do aluno. 
(c) O método main deverá, para cada aluno da turma, solicitar que seja digitada a nota da primeira e a da segunda avaliação e, 
utilizando o procedimento definido no item  (b), calcular e exibir a média e o conceito do referido aluno. Lembre-se que a turma possui
 60 alunos. 
OBS1: O programa deverá forçar a digitação de notas no intervalo fechado de 0,0  (zero) a 10,0 (dez). 
OBS2: O programador é livre para definir outros procedimentos ou funções, caso  julgue necessário. 

*/

public class MediaTurma {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double nota1, nota2;
		int  cont = 0;
		char resp = 'S';
		
		do {
			cont ++;
			System.out.println("Digite a nota 1 do " + cont + " aluno: ");
			nota1 = in.nextDouble(); in.nextLine();
			
			System.out.println("Digite a nota 2 do " + cont + " aluno: ");
			nota2 = in.nextDouble(); in.nextLine();
			
			CalculaMedia(nota1, nota2);
			
			System.out.println("Deseja continuar ? Digite S para sim e N para Não: ");
			resp = in.next().charAt(0);
			resp = Character.toUpperCase(resp);
			
			
		}while (resp == 'S' && cont < 3);

	}

	public static char Conceito(double media) {
		char conceito = 0;

		if (media < 5) {
			conceito = 'D';
		} else if (media < 7) {
			conceito = 'C';
		} else if (media < 9) {
			conceito = 'B';
		} else { conceito = 'A'; }
		
		return conceito;

	}

public static void CalculaMedia(double nota1, double nota2) {
	double media;
	char conceito;
	
	media = (nota1 + nota2)/2;
	conceito = Conceito(media);
	
	System.out.println("A média foi de " + media);
	System.out.println("O conceito foi: " + conceito);
	
}
	
}
