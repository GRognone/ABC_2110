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

		String motATrouver;
		String essaiUtilisateur;


		do {
			System.out.println("Veuillez saisir un mot a trouver de 5 caracteres minimum svp");
			motATrouver=sc.next();
			
			System.out.println(motATrouver);
		}
		while	(motATrouver.length()<5);

		/*
for (int i=1;i=motATrouver.length();i++) {
	for(int j=i;j=motATrouver.length();j++) {
		if (motATrouver[j] = motATrouver[i]) {

		}
	}
}*/




		sc.close();
	}
}