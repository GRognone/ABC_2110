import java.util.Scanner;

public class Jalon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// DECLARATION
		String prenom;
		String nom;
		String departement;
		String adressemail1;
		String adressemail2;
		
		//SAISIE
		//ecrire " Veuillez-saisir votre prenom"
		System.out.println("Veuillez-saisir votre prenom");
		Scanner sc = new Scanner(System.in);//cree un outil scanner
		prenom = sc.next();
		//ecrire " veuillez-saisir votre nom"
		System.out.println("Veuillez-saisir votre nom");
		nom = sc.next();
		//ecrire "Veuillez saisir le numero de votre departement"
		System.out.println("Veuillez-saisir le numero de votre departement");
		departement = sc.next();
		
		//Traitement
		adressemail1 = (prenom+"."+nom+departement+"@afrp.asso.fr");
		adressemail2 = (nom+departement+prenom+"@arfp.asso.fr");
		
		//AFFICHAGE
		//ecrire adressemail1
		System.out.println(adressemail1);
		//ecrire adressemail2
		System.out.println(adressemail2);
	}
	
}
