import java.util.Scanner;

public class jeuDuPendu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		while (nombreDeTentatives>0) {
			System.out.println("\nVeuillez saisir une lettre vous avez 6 essais");
			essaiUtilisateur = sc.next().charAt(0);

			for (int i=1; i<motATrouver.length()-1;i++) {
				if (motATrouver.charAt(i) == essaiUtilisateur){
					motCache[i] = motATrouver.charAt(i);
				}
			}
			System.out.print(motCache);
			nombreDeTentatives--;
			System.out.print(" Il vous reste "+nombreDeTentatives+" tentatives.");
		}
		sc.close();
	}
}