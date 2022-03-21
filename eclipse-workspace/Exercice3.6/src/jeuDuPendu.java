import java.util.Scanner;

public class jeuDuPendu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*L'algorithme lit un mot propos� par un premier joueur. 
		Ce mot a une longueur minimum de 5 caract�res (� contr�ler). 
		L'algorithme affiche ensuite le mot o� toutes les lettres sauf la premi�re et la derni�re sont remplac�es par un tiret. 
		Un deuxi�me joueur propose des lettres une � une. 
		Chaque fois que la lettre se trouve dans le mot, l'algorithme remplace les tirets qui rempla�aient cette lettre et 
		r�affiche le mot. Le second joueur a droit � un maximum de 6 essais pour retrouver toutes les lettres.*/

		Scanner sc = new Scanner(System.in);

		String motCache;
		String motATrouver;
		String essaiUtilisateur;
		int nombreDeTentatives =6;
		boolean lettreATrouver;

		// verification mot a trouver > 5 caracteres.
		do {
			System.out.println("Veuillez saisir un mot a trouver de 5 caracteres minimum svp");
			motATrouver=sc.next();
			System.out.println(motATrouver);
		}
		while	(motATrouver.length()<5);

		motCache=motATrouver;

		for (int i=1; i<motATrouver.length()-1;i++) {
			motATrouver = motATrouver.replace(motATrouver.charAt(i),'-') ;
		}
		for (int i=0; i<motATrouver.length();i++) {
			System.out.print(motATrouver.charAt(i));
		}

		// debut du jeu
		while (nombreDeTentatives>0) {
			System.out.println("\nVeuillez saisir une lettre vous avez 6 essais");
			essaiUtilisateur= sc.next();

			for (int i=1; i<motATrouver.length()-1;i++) {
				if (essaiUtilisateur.equals(motATrouver.charAt(i))){
					System.out.print(motATrouver.charAt(i));
				}
			}
			nombreDeTentatives--;
			System.out.print("Il vous reste "+nombreDeTentatives+" tentatives.");
			sc.close();
		}
	}
}