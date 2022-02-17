import java.util.Random;
import java.util.Scanner;

public class JeuDu2a0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner( System.in);
		Random rnd = new Random();


		int nombreOrdinateur;
		int nombreJoueur;
		int pointMarque;
		nombreOrdinateur= rnd.nextInt(3);
		System.out.println(nombreOrdinateur);

		System.out.println("Joueur saisissez un nombre entier compris entre 0 et 2 svp.");
		nombreJoueur=sc.nextInt();

		if (nombreJoueur<nombreOrdinateur){
			pointMarque= ((nombreOrdinateur-nombreJoueur)=2);
			System.out.println("Ordinateur Gagne "+pointMarque+" points");
		}
		else if ((nombreJoueur < nombreOrdinateur) && ((nombreJoueur-nombreOrdinateur)=<1)) {
			pointMarque= (nombreOrdinateur-nombreJoueur-1);
			System.out.println("Ordinateur Gagne "+pointMarque+" points");
		}
			
			sc.close();
	}
	}

	

	


