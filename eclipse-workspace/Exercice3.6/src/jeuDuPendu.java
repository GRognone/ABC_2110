
import java.util.Scanner;

public class jeuDuPendu {

	public static void main(String[] args) {	

		/*L'algorithme lit un mot proposé par un premier joueur. 
		Ce mot a une longueur minimum de 5 caractères (à contrôler). 
		L'algorithme affiche ensuite le mot où toutes les lettres sauf la première et la dernière sont remplacées par un tiret. 
		Un deuxième joueur propose des lettres une à une. 
		Chaque fois que la lettre se trouve dans le mot, l'algorithme remplace les tirets qui remplaçaient cette lettre et 
		réaffiche le mot. Le second joueur a droit à un maximum de 6 essais pour retrouver toutes les lettres.*/


		Scanner sc = new Scanner(System.in);

		char motCache[];
		String motATrouver;
		char essaiUtilisateur;
		int nombreDeTentatives =6;
		boolean victoire=true;

		// verification mot a trouver > 5 caracteres.
		do {
			System.out.println("Veuillez saisir un mot a trouver de 5 caracteres minimum svp");
			motATrouver=sc.next();
			//System.out.println(motATrouver);// a supprimer quand programme fini
		}
		while	(motATrouver.length()<5);
		motCache=motATrouver.toCharArray();

		for (int i=1; i<motATrouver.length()-1;i++) { 
			motCache[i] = '-' ;
		}
		for (int i=0; i<motCache.length;i++) {
			System.out.print(motCache[i]);
		}

		// debut du jeu
		System.out.println("\nDevinez le mot vous avez droit à  6 erreurs");
		while (victoire==true) {
			System.out.println("Veuillez saisir une lettre svp.");
			essaiUtilisateur = sc.next().charAt(0);
			boolean reponseCorrecte=false;

			for (int i=1; i<motATrouver.length()-1;i++) {
				if (motATrouver.charAt(i) == essaiUtilisateur){
					motCache[i] = motATrouver.charAt(i);
					reponseCorrecte=true;
				}
			}
			System.out.print(motCache);
			if (reponseCorrecte==false){
				nombreDeTentatives--;
				System.out.println(" Il vous reste "+nombreDeTentatives+" tentatives.");
			}
			if (nombreDeTentatives<1) {
				victoire=false;
				System.out.println("\nPendu vous avez perdu!!!!");
			}
			if (String.copyValueOf(motCache).equals(motATrouver)) { // transformer tableau char en string
				victoire=false;
				System.out.println("\nVous avez gagné !!!");
			}
		}
		sc.close();
	}
}