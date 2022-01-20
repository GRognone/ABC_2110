 import java.util.Scanner;

public class NombrePremier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARATION
		int nombreN;
		//boolean estPremier = false;
		int diviseurTeste;
		boolean estPremier =  false;

		Scanner sc = new Scanner(System.in);//creation d'un scanner
		//SAISIE
		//ecrire "veuillez-sasir ne nombre entier";
		System.out.println("Veuillez-saisir le nombre");
		//lire nombreN
		nombreN = sc.nextInt();
		// TRAITEMENT
		if (nombreN>1){ // LE NOMNRE EST SUPPERIEUR A 1
			estPremier = true;
			if (nombreN%2 == 0) { // LE NOMBRE EST PAIR
				if (nombreN != 2) { // LE NOMBRE EST DIFFERENT DE 2
					estPremier = false;
				}

			} else { // LE NOMBRE N SERA IMPAIRE
				// JE TESTE MES DIVISEUR DU NOMBRE
				diviseurTeste = 3;
				while(nombreN%diviseurTeste!=0 && diviseurTeste < nombreN) {
					diviseurTeste+=2;
					
				}
				if (diviseurTeste != nombreN) {
					estPremier = false;
				}
					
			}
		}
		if (estPremier ) {
			System.out.println(nombreN + " est un nombre premier");
		} else {
			System.out.println(nombreN + " n'est pas un nombre permier");
		}
		sc.close();
	}

}
