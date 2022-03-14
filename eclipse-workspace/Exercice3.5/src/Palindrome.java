import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*Un palindrome est une chaîne de caractères que l'on peut lire identiquement de droite à gauche, et gauche à droite.
		Par exemple:
			AA. 38783. LAVAL. LAVAL A ETE A LAVAL. ET LA MARINE VA VENIR A MALTE
			Soit une chaîne de caractères terminée par un point. 
			Ecrivez l'algorithme d'un programme permettant d'affirmer si cette phrase est ou non un palindrome.

			Proposez un jeu d'essai prévoyant les 3 cas suivants :

			▪ la chaîne de caractères n'est pas un palindrome
			▪ la chaîne de caractères est un palindrome
		 */
		Scanner sc = new Scanner(System.in);
		boolean estUnPalindrome=false;
		String phrase;

		System.out.println(" Veuillez saisir une chaine de caratère svp et terminez la par un point.");
		phrase = sc.nextLine();
		String phrase1[]= phrase.split(" ");
		
		for (int i = 0; i<phrase1.length; i++)
		{
		System.out.println(phrase1[i]);
		}
		if (phrase.equals (".")) {
			System.out.println("LA CHAINE EST VIDE");
		}

		sc.close();
	}

}
