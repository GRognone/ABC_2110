import java.util.Scanner;

public class JeuDesDoigts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLATATION

		int doigtsjoueura ;
		int doigtsjoueurb ;
		int somme;
		Scanner sc = new Scanner(System.in);//creer un outil scanner
		//Saisie

		//ecrire " Veuillez-saisir le nombre des doigts du joueur a : "
		
		
		//lire doigtsjoueura
		do {System.out.println( " Veuillez-saisir le nombre des doigts de la main droite du joueur a : ");
					doigtsjoueura = sc.nextInt();
		} while(doigtsjoueura <=0 || doigtsjoueura >5);


		//ecrire " Veuillez-saisir le nombre des doigts du joueur b : "
		
		//lire doigtsjoueurb
		do {
			System.out.println( " Veuillez-saisir le nombre des doigts de la main droite du joueur b : ");
			doigtsjoueurb = sc.nextInt();
		} while(doigtsjoueurb <=0 || doigtsjoueurb >5);

		//TRAITEMENT

		//<- - reste (doigtsjoueura + reste joueurb)(modulo2)>

		somme = ( doigtsjoueura + doigtsjoueurb) %2;

		//Si (somme == 0)Alors
		if (somme==0) {
			//Joueur a gagne
			System.out.println("Le vainqueur est le joueur a");

		}
		// Sinon
		else {
			//Joueur b gagne
			System.out.println("Le vainqueur est le joueur b");
			//FinSi
		}
		//AFFICHAGE
		System.out.println("Bravo au vainqueur");
		sc.close();
	}
}
