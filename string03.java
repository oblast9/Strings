package Strings_Cdd;
import java.util.Scanner;
import java.util.StringTokenizer;

public class string03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um texto: ");
		String texto = entrada.nextLine();
		
		StringTokenizer tokenizer = new StringTokenizer(texto);
		System.out.println(tokenizer.countTokens());
	}

}
