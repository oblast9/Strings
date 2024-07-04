package Strings_Cdd;

public class string07 {
	public static void main(String[] args) {
		String array[] = {"a","vida","é","bela"};
		String copia = new String();
		for (int i = 0; i<array.length; i++) {
			copia = copia + " " + array[3-i];
		}
		String resul = copia.toUpperCase();
		System.out.println(resul);
	}

}
