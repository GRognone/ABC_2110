import java.util.Scanner;

public class Enonce1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Enonce1
		//DECLARATION
		
		//Chaine compris
		String compris;
		//Chaine compris 2
		String compris2;
		
		//Saisie
		//ecrire"Effectuez une lecture attentive de l'enonce"
		System.out.println("Effectuez une lecture attentive de l'enonce");
		//ecrire"Avez-vous compris l'enonce"
		System.out.println("Avez-vous compris l'enonce? oui/non ");
		//lire compris
		Scanner sc = new Scanner (System.in);//creer un scanner
			compris = sc.next();
			//Si			(compris = = " non ")
						if (compris =="non") {
						}
						else {
						//ecrire" Relisez l'enonce à nouveau"
						System.out.println("Effectuez une relecture de l'enonce");
						//ecrire"Avez-vous compris l'enonce"
						System.out.println("Avez-vous compris l'enonce cette fois ci ? oui/non ");
						//lire compris				
						compris2 = sc.next();
						//FinSi
						}
						 //Si			(compris2 = = " non ")
						if (compris =="non") {
						}
						else {
						//ecrire" Relisez l'enonce à nouveau"
						System.out.println("Demandez des renseignements au formateur");
						//FinSi
	}
	}
}