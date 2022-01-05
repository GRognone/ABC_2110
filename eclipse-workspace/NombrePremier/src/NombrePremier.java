import java.util.Scanner;

public class NombrePremier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARATION
		int nombreN;
		 
				Scanner sc = new Scanner(System.in);//creation d'un scanner
		//SAISIE
		//ecrire "veuillez-sasir ne nombre entier";
		System.out.println("Veuillez-saisir le nombre");
		//lire nombreN
		nombreN = sc.nextInt();
		// TRAITEMENT
		if (nombreN%nombreN==0){
			System.out.println("c'est un nombre premier");
		}
		
		sc.close();
	}

}
