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