import java.util.Scanner;

public class Enonce2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARATION
		//Chaine beautemps
		String beautemps;
		//Chaine bicyclette fonctionne
		String bicyclettefonctionne;
		//Chaine reparation immediate
		String reparationimmediate;
		//Chaine bovarysalon
		String bovarysalon = "";
		//Chaine bovarymunicipale
		String bovarymunicipale = "";

		//SAISIE

		//ecrire "S'il fait beau demain, j'irai faire une balade � bicyclette."
		System.out.println("S'il fait beau demain, j'irai faire une balade � bicyclette.");
		//ecrire "Fera-t-il beau?"
		System.out.println("Fera-t-il beau? oui/non");
		Scanner sc = new Scanner (System.in);//creer un scanner
		beautemps = sc.next();
		
		//TRAITEMENT
/*
		//Si beautemps("oui")
		if (beautemps.equals("oui")) {
			//ecrire "Je n'ai pas utilis� ma bicyclette depuis plusieurs mois, peut-�tre n'est-elle plus en parfait �tat de fonctionnement."
			System.out.println("Je n'ai pas utilis� ma bicyclette depuis plusieurs mois, peut-�tre n'est-elle plus en parfait �tat de fonctionnement.");
			//ecrire "Ma bicyclette est-elle en parfait etat de fonctionnement?"
			System.out.println("Ma bicyclette est-elle en parfait etat de fonctionnement? oui/non");
			bicyclettefonctionne = sc.next();
			//Si bicyclettefonctionne ("non")
			if (bicyclettefonctionne.equals("non")) {
				//ecrire "Si c'est le cas, je passerai chez le garagiste avant la balade."
				System.out.println("Si c'est le cas, je passerai chez le garagiste avant la balade.");
				//ecrire "J'esp�re que les r�parations seront imm�diates sinon je devrai renoncer � la balade en bicyclette."
				System.out.println("J'esp�re que les r�parations seront imm�diates sinon je devrai renoncer � la balade en bicyclette.");
				//ecrire " Les reparations peuvent-elle etre immediates? oui/non"
				System.out.println(" Les reparations peuvent-elle etre immediates? oui/non");
				reparationimmediate = sc.next();
				//Si reparationimmediate ("non")
				if (reparationimmediate.equals("non")) {
					//ecrire "Comme je veux de toute fa�on profiter du beau temps, si mon v�lo n'est pas utilisable, j'irai � pied jusqu'� l'�tang pour cueillir les joncs.
					System.out.println("Comme je veux de toute fa�on profiter du beau temps, si mon v�lo n'est pas utilisable, j'irai � pied jusqu'� l'�tang pour cueillir les joncs."
										);		
				
					else  {
					//ecrire "J'irais faire de la bicyclette."
					System.out.println("J'irais faire de la bicyclette.");
					}
				//FinSi
				}
				else {
				//ecrire "J'irais faire de la bicyclette."
				System.out.println("J'irais faire de la bicyclette.");
				}
			//FinSi
			}
		}	
*/
		
			//Si beautemps("non")
			if (beautemps.equals("non")) {
			System.out.println("Il ne fait pas beau, je consacre ma journ�e � la lecture. J'aimerais relire Madame Bovary,  j'esp�re retrouver ce livre, il doit �tre dans la biblioth�que du salon.");
			//ecrire "Le livre Madame Bovary est-il dans le salon? oui/non"
			System.out.println("Le livre Madame Bovary est-il dans le salon? oui/non");
			//Si bovarysalon("non")
				bovarysalon = sc.next();
				if (bovarysalon.equals("non")) {
				//ecrire "Je ne le retrouve pas, je vais � la biblioth�que municipale pour le trouver."
				System.out.println("Je ne le retrouve pas, je vais � la biblioth�que municipale pour le trouver.");
				System.out.println("Le livre Madame Bovary est-il disponible � la bibliotheque municipale? oui/non");
				//Si bovarymunicipale("non")
					bovarymunicipale=sc.next();
					if  (bovarymunicipale.equals("non")) {
					//ecrire "Le livre Madame Bovary n'est pas disponible, j'emprunte un bouquin policier, je rentre ensuite directement � la maison."
					System.out.println("Le livre Madame Bovary n'est pas disponible,j'emprunte un bouquin policier, je rentre ensuite directement � la maison.");
					}
				}
		}
	
				// ecrire "D�s que j'aurai le livre qui me convient, je m'installerai confortablement dans un fauteuil et je me plongerai dans la lecture."
				System.out.println("D�s que j'aurai le livre qui me convient, je m'installerai confortablement dans un fauteuil et je me plongerai dans la lecture.");
	}
}

				
		
/*
  */
 
		
	



