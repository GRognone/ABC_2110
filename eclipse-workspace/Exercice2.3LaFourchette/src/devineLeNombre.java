import java.util.Random;
import java.util.Scanner;

public class devineLeNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Random  random= new Random();

		int nombreUtilisateur=0;
		int nombreOrdinateur= random.nextInt(101);
		int fourchetteMin=0;
		int fourchetteMax=100;
		boolean trouve=false; 

		System.out.println(nombreOrdinateur);

		do { 
			System.out.println("Essayez de trouver le nombre choisi par l'ordinateur entre "+fourchetteMin+" et "+ fourchetteMax);
			nombreUtilisateur=sc.nextInt();

			// commande gestion valeur de la fourchette
			if (nombreUtilisateur<nombreOrdinateur){														
				fourchetteMin = nombreUtilisateur;
			}
			else if (nombreUtilisateur > nombreOrdinateur) {
				fourchetteMax=nombreUtilisateur;
			}
			else
			{
				System.out.println("Bravo vous avez trouv� le bon chiffre!!! C'�tait :"+nombreUtilisateur);
				trouve=true;
			}	
		}
		while
			(!trouve);
		System.out.println("Jeux termin�!");
		sc.close();
	}
}