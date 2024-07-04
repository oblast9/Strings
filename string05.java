package Strings_Cdd;
import java.util.Scanner;

public class string05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite uma palavra: ");
		String palavra = entrada.next();
		String resultado = palavra.toUpperCase();
		System.out.println(resultado);
	}

}
