package intro;

import java.util.Scanner;

/*1. A nota de um aluno em uma disciplina é a média aritmética das notas de suas duas avaliações. Se a média do 
 * aluno for maior ou igual a sete, o aluno está  aprovado. Se a média do aluno for menor que três, o aluno está 
 * reprovado. Se a média  do aluno for menor que sete é maior ou igual a três, o aluno irá para a recuperação.  
 * Implemente um programa para solicitar ao usuário as notas das duas avaliações parciais  e calcular a média de 
 * um aluno de uma determinada disciplina e informar sua situação  final. O programa deverá exibir a seguinte frase:
 *  “O aluno obteve média _________ e  está ______________.” OBS: Faça a validação dos dados informados pelo usuário
 *   de forma que o programa force a digitação de notas no intervalo de 0 a 10. 
 *   
 *   2. Refaça o programa da questão anterior de forma que seja calculada e exibida a média e a situação dos 30 alunos 
 *   de uma determinada turma. 
 *   
 *   3. Refaça de forma que o programa exiba, ao final,  quantos alunos foram aprovados, quantos foram reprovados e 
 *   quantos estão na recuperação.  

 *   4. Refaça de forma que o programa exiba, ao final, o  percentual de alunos que foram aprovados, o percentual que 
 *   foram reprovados e o percentual que estão na recuperação. 

 *   5. Refaça de forma que o programa exiba, ao final, a  média da turma. */

public class ListaRepeticao1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int turma = 3, cont = 0, reprovado = 0, aprovado = 0, contfinal = 0;
		double nota1, nota2, media = 0, soma = 0, mediaTurma;

		while (cont < turma) {
			
			cont ++;  /* Fazer a contagem dos alunos */
			System.out.print("Digite a 1 nota do " + cont + " aluno:");
			nota1 = in.nextDouble();
			in.nextLine(); /* Limpar o Buffer */
			
			while(nota1 < 0 || nota1 > 10) {
				System.out.print("Digite novamente a 1 nota do " + cont + " aluno:");
				nota1 = in.nextDouble();
				in.nextLine(); /* Limpar o Buffer */
			}
			
			System.out.print("Digite a 2 nota do " + cont + " aluno:");
			nota2 = in.nextDouble();
			in.nextLine(); /* Limpar o Buffer */
			
			while(nota2 < 0 || nota2 > 10) {
				System.out.print("Digite novamente a 2 nota do " + cont + " aluno:");
				nota2 = in.nextDouble();
				in.nextLine(); /* Limpar o Buffer */
			}
			
			media = (nota1 + nota2) / 2;
			
			if(media >= 7) {
				System.out.println("O aluno " + cont + " obteve média " + media + " foi aprovado");
				aprovado ++;
			} else if (media >= 3 && media < 7 ) {
				contfinal ++;
				System.out.println("O aluno " + cont + " obteve média " + media + " vai na recuperação");
			} else {
				reprovado ++;
				System.out.println("O Aluno obteve média " + media + " foi reprovado");
			}
			
			soma = soma + media;  /* Somou a média e guardou*/
			
		}
		
		mediaTurma = soma / turma;
		System.out.println("Foram reprovados: " + reprovado + " alunos");
		System.out.println("Foram aprovados: " + aprovado + " alunos");
		System.out.println("Foram para a final: " + contfinal + " alunos");
		
		System.out.println("A média da turma foi de: " + mediaTurma);
	}

}
