import java.util.Scanner;

public class Enonce1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Enonce1

		//DECLARATION

		//Chaine compris
		String compris;
		

		//Saisie

		//ecrire"Effectuez une lecture attentive de l'enonce"
		System.out.println("Effectuez une lecture attentive de l'enonce");
		//ecrire"Avez-vous compris l'enonce"
		System.out.println("Avez-vous compris l'enonce? oui/non ");
		//lire compris
		Scanner sc = new Scanner (System.in);//creer un scanner
		compris = sc.next();



		//TRAITEMENT


		//Si			(compris == "non")
		if (compris.equals("non")) {


			//ecrire" Relisez l'enonce de nouveau"
			System.out.println("Effectuez une relecture de l'enonce");
			//ecrire"Avez-vous compris l'enonce"
			System.out.println("Avez-vous compris l'enonce cette fois ci ? oui/non ");
			
			//Chaine compris2
			String compris2;
			//lire compris2
			compris2 = sc.next();

			//Si		(compris2 == "non")
			if(compris2.equals("non")) {

				//ecrire" Demandez des renseignements au formateur"
				System.out.println("Demandez des renseignements au formateur");
			}
			//FinSi

		}
		//FinSi

		// ecrire " Effectuez le travail demande"
		System.out.println("Effectuez le travail demande");
		sc.close(); // fermeture du scanner
	}

}
