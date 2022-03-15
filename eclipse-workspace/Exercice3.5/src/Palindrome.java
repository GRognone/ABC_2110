import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String phrase;
		boolean palindrome = true;
		boolean itsOk=true;
		System.out.println("Veuillez saisir une chaine de caratère svp et terminez la par un point.");
		phrase = sc.nextLine();
		String result = phrase.replaceAll("\s",""); // pour supprimer les espaces
		System.out.println(result);
		
		if (result.equals (".")) { // si il n'y a qu'un point je sors
			itsOk=false;
			palindrome = false;
			System.out.println("LA CHAINE EST VIDE");
		}
		if (result.charAt(result.length()-1)=='.') { // pour retirer le point si c'est le dernier caractere.
			result = result.substring(0,result.length()-1);
		}
		for (int i=0; i< result.length();i++) { // algo comparatif
			if ( result.charAt(i) != (result.charAt(result.length()-1-i))){
				palindrome = false;
			}
		}
		if(itsOk) {
			if ( palindrome == false) {
				System.out.println(phrase+ " n'est un pas palindrome.");
			}
			else {
				System.out.println(phrase+ " est un palindrome.");
			}
		}
		sc.close();
	}
}