import java.util.Scanner;

public class Enonce2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DECLARATION
		// Chaine beautemps
		String beautemps;
		// Chaine bicyclette fonctionne
		String bicyclettefonctionne;
		// Chaine reparation immediate
		String reparationimmediate;
		// Chaine bovarysalon
		String bovarysalon;
		// Chaine bovarymunicipale
		String bovarymunicipale;

		// SAISIE

		// ecrire "S'il fait beau demain, j'irai faire une balade a bicyclette."
		System.out.println("S'il fait beau demain, j'irai faire une balade a bicyclette.");
		// ecrire "Fera-t-il beau?"

		Scanner sc = new Scanner(System.in);// creer un scanner
		
		do
		{
			System.out.println("Fera-t-il beau? oui/non");
			beautemps = sc.next().toLowerCase();
		} while (!beautemps.equals("oui") && !beautemps.equals("non"));

		// TRAITEMENT

		// Si beautemps("oui")
		if (beautemps.equals("oui")) {
			// ecrire "Je n'ai pas utilise ma bicyclette depuis plusieurs mois, peut-etre
			// n'est-elle plus en parfait etat de fonctionnement."
			System.out.println("Je n'ai pas utilise ma bicyclette depuis plusieurs mois, peut-etre n'est-elle plus en parfait etat de fonctionnement.");
			// ecrire "Ma bicyclette est-elle en parfait etat de fonctionnement?"

			do
			{
				System.out.println("Ma bicyclette est-elle en parfait etat de fonctionnement? oui/non");
				bicyclettefonctionne = sc.next();
			} while (!bicyclettefonctionne.equals("oui") && !bicyclettefonctionne.equals("non"));

			// Si bicyclettefonctionne ("non")
			if (bicyclettefonctionne.equals("non")) {
				// ecrire "Si c'est le cas, je passerai chez le garagiste avant la balade."
				System.out.println("Si c'est le cas, je passerai chez le garagiste avant la balade.");
				// ecrire "J'espere que les reparations seront immediates sinon je devrai
				// renoncer a la balade en bicyclette."
				System.out.println(
						"J'espere que les reparations seront immediates sinon je devrai renoncer a la balade en bicyclette.");
				// ecrire " Les reparations peuvent-elle etre immediates? oui/non"

				do
				{
					System.out.println(" Les reparations peuvent-elle etre immediates? oui/non");
					reparationimmediate = sc.next();
				} while (!reparationimmediate.equals("oui") && !reparationimmediate.equals("non"));

				// Si reparationimmediate ("non")
				if (reparationimmediate.equals("non")) {
					// ecrire "Comme je veux de toute facon profiter du beau temps, si mon velo
					// n'est pas utilisable, j'irai a pied jusqu'a l'etang pour cueillir les joncs.
					System.out.println(
							"Comme je veux de toute facon profiter du beau temps, si mon velo n'est pas utilisable, j'irai a pied jusqu'a l'etang pour cueillir les joncs.");
				}
				else {
					// ecrire "J'irais faire de la bicyclette."
					System.out.println("J'irais faire de la bicyclette.");
				}
			}
			else {
				// ecrire "J'irais faire de la bicyclette."
				System.out.println("J'irais faire de la bicyclette.");
			}

			// FinSi	
		}
		//FinSi

		else {

			System.out.println(
					"Il ne fait pas beau, je consacre ma journee a la lecture. J'aimerais relire Madame Bovary,  j'espere retrouver ce livre, il doit etre dans la bibliotheque du salon.");

			// ecrire "Le livre Madame Bovary est-il dans le salon? oui/non"
			do
			{
				System.out.println("Le livre Madame Bovary est-il dans le salon? oui/non");
				bovarysalon = sc.next();
			} while (!bovarysalon.equals("oui") && !bovarysalon.equals("non"));



			// Si Bovarysalon("non")
			if (bovarysalon.equals("non")) {
				// ecrire "Je ne le retrouve pas, je vais a la bibliotheque municipale pour le
				// trouver."
				System.out.println("Je ne le retrouve pas, je vais a la bibliotheque municipale pour le trouver.");
				do
				{
					System.out.println("Le livre Madame Bovary est-il disponible a la bibliotheque municipale? oui/non");
					bovarymunicipale = sc.next();
				} while (!bovarymunicipale.equals("oui") && !bovarymunicipale.equals("non"));

				// Si bovarymunicipale("non")
				if (bovarymunicipale.equals("non")) {
					// ecrire "Le livre Madame Bovary n'est pas disponible, j'emprunte un bouquin
					// policier, je rentre ensuite directement a la maison."
					System.out.println("Le livre Madame Bovary n'est pas disponible,j'emprunte un bouquin policier, je rentre ensuite directement a la maison.");

				}
				// FinSi

			}
			// FinSI
			System.out.println("Je m'installe confortablement dans un fauteuil et je me plonge dans la lecture.");

		}
		//FinSi
		sc.close(); // fermeture du scanner
	}
}



