package string;
import java.util.Scanner;

/*2ª Questão: Implemente um programa para solicitar ao usuário que digite uma  frase e um caractere qualquer. O programa deve 
 * calcular e exibir a quantidade de  vezes que o caractere aparece na frase digitada.  */

public class SecondQuestion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String frase;
		char caracter , caractere;
		int tam, i, vezes = 0, space = 0;
		
		System.out.print("Digite uma frase: ");
		frase = in.nextLine();
		frase.toLowerCase();
		
		System.out.print("Digite um caracter: ");
		caracter = in.next().charAt(0);
		caracter = Character.toLowerCase(caracter);
		
		tam = frase.length();
		
		
		for(i = 0 ; i < tam; i ++) {
			

	/* charAt - função de String que retorna caractere em uma posição*/
			caractere = frase.charAt(i);
			caractere = Character.toLowerCase(caractere);
			
			if(caractere == caracter) {
				vezes ++;
			} else if(caractere == ' ') {
				space ++;
			}
			
		}
		System.out.print("O caractere " + caracter + " apareceu " + vezes + " veze(s)");
	}
}