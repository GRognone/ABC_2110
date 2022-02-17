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
		
		System.out.println(nombreOrdinateur);

		do { 
			do {
				System.out.println("Essayez de trouver le nombre choisi par l'ordinateur entre "+fourchetteMin+" et "+ fourchetteMax);
				nombreUtilisateur=sc.nextInt();
			}
				while 
					(nombreUtilisateur < fourchetteMin || nombreUtilisateur > fourchetteMax); // commande gestion valeur de la fourchette
				if (nombreUtilisateur<nombreOrdinateur){														
					fourchetteMin = nombreUtilisateur;
				}
				else if (nombreUtilisateur > nombreOrdinateur) {
					fourchetteMax=nombreUtilisateur;
				}
				if (nombreUtilisateur<nombreOrdinateur){ 
					System.out.println("Le chiffre que vous rechercher est compris entre "+fourchetteMin+" et  "+fourchetteMax);
				}
				else if (nombreUtilisateur > nombreOrdinateur){
					System.out.println("Le chiffre que vous rechercher est compris entre "+fourchetteMin+" et  "+fourchetteMax);
				}
		}
		while
			(nombreUtilisateur != nombreOrdinateur);
		System.out.println("Bravo vous avez trouvé le bon chiffre!!!");
		System.out.println("Partie termine");
		sc.close();
	}
}