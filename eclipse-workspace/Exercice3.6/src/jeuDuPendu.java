
import java.util.Scanner;

public class jeuDuPendu {

	public static void main(String[] args) {	

		/*L'algorithme lit un mot propos� par un premier joueur. 
		Ce mot a une longueur minimum de 5 caract�res (� contr�ler). 
		L'algorithme affiche ensuite le mot o� toutes les lettres sauf la premi�re et la derni�re sont remplac�es par un tiret. 
		Un deuxi�me joueur propose des lettres une � une. 
		Chaque fois que la lettre se trouve dans le mot, l'algorithme remplace les tirets qui rempla�aient cette lettre et 
		r�affiche le mot. Le second joueur a droit � un maximum de 6 essais pour retrouver toutes les lettres.*/


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
		System.out.println("\nDevinez le mot vous avez droit �  6 erreurs");
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
				System.out.println("\nVous avez gagn� !!!");
			}
		}
		sc.close();
	}
}