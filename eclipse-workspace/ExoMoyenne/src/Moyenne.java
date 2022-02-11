import java.util.Scanner;

public class Moyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Traduction du pseudo code Java
		
		// DECLARATION DES VARIABLES
		
		//Reel nombre1
		float nombre1;
		//Reel nombre2
		float nombre2;
		//Reel moyenne
		float moyenne;
		
		//SAISIE
		
		//ecrire "Veuillez-saisir le 1er nombre:"
		System.out.println("Veuillez-saisir le 1er nombre:");
		//lire nombre1
		Scanner sc = new Scanner(System.in);//creer un outil scanner
		nombre1 = sc.nextFloat();
		System.out.println("Vous avez saisie nombre 1 : "+nombre1);
		//ecrire "Veuillez-saisir le 2eme nombre:"
		System.out.println("Veuillez-saisir le 2 eme nombre:");
		//lire nombre2
		nombre2 = sc.nextFloat();
		System.out.println("Vous avez saisie nombre 2 : "+nombre2);
		
		//TRAITEMENT
		
		//moyenne <-- (nombre1+nombre2)/2
		moyenne = (nombre1+nombre2)/2;
		
		/*
		//Si (moyenne >=10) Alors
		if (moyenne>=10) {
			//
		}
		//Sinon
		else {
		//	moyenne < - - +1
			moyenne=moyenne+1;
		//FinSi
		 	}
		 */
	
		//Si (moyenne <10) Alors
		if (moyenne < 10) {
			
		//moyenne<- -moyenne + 1
			moyenne = moyenne + 1;
			
			//FinSi
		}
		
		//AFFICHAGE
		
		//ecrire " La moyenne des 2 nombres est de :",moyenne
		System.out.println("La moyenne des 2 nombres est de :"+moyenne);
	sc.close();
	}

}
