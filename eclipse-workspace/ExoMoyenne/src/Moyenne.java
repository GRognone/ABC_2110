import java.util.Scanner;

public class Moyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Traduction du pseudo code Java
		
		// DECLARATION DES VARIABLES
		
		//Réel nombre1
		float nombre1;
		//Réel nombre2
		float nombre2;
		//Réel moyenne
		float moyenne;
		
		//SAISIE
		//ecrire "Veuillez-saisir le 1er nombre:"
		System.out.println("Veuillez-saisir le 1er nombre:");
		//lire nombre1
		Scanner sc = new Scanner(System.in);//creer un outil scanner
		nombre1 = sc.nextFloat();
		System.out.println("Vous avez saisie nombre 1 : "+nombre1);
		//ecrire "Veuillez-saisir le 2ème nombre:"
		System.out.println("Veuillez-saisir le 2ème nombre:");
		//lire nombre2
		nombre2 = sc.nextFloat();
		System.out.println("Vous avez saisie nombre 2 : "+nombre2);
		
		//Traitement
		//moyenne <-- (nombre1+nombre2)/2
		moyenne = (nombre1+nombre2)/2;
		
		//AFFICHAGE
		//ecrire " La moyenne des 2 nombres est de :",moyenne
		System.out.println("La moyenne des 2 nombres est de :"+moyenne);
		
		
		
		
	}

}
