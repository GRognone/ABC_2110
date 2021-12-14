import java.util.Scanner;

public class Enonce1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Enonce1
		
		//DECLARATION
		
		//Chaine compris
		String compris;
		//Chaine compris2
		String compris2;
		
		//Saisie
		//ecrire"Effectuez une lecture attentive de l'enonce"
		System.out.println("Effectuez une lecture attentive de l'enonce");
		//ecrire"Avez-vous compris l'enonce"
		System.out.println("Avez-vous compris l'enonce? oui/non ");
		//lire compris
		Scanner sc = new Scanner (System.in);//creer un scanner
		compris = sc.next();
		compris2 = sc.next();
		
		//TRAITEMENT
		compris = "oui";
		
		//Si	(compris = ="oui")
				if (compris == "oui") {
				
			//FinSi
			//Si			(compris = = "non")
						if (compris == "non") {
						}		
						
							//ecrire" Relisez l'enonce de nouveau"
							System.out.println("Effectuez une relecture de l'enonce");
							//ecrire"Avez-vous compris l'enonce"
							System.out.println("Avez-vous compris l'enonce cette fois ci ? oui/non ");
							//lire compris2
							//FinSi
							
							
							
						 		//Si		(compris2 = = "non")
										if (compris2 =="non"){
										}
										
												//ecrire" Demandez des renseignements au formateur"
												System.out.println("Demandez des renseignements au formateur");
												//FinSi
									
	// ecrire " Effectuez le travail demandé"
	System.out.println("Effectuez le travail demande");									
	}
}
}
										
							
	


