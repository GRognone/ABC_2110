import java.util.Random;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_VALUE  = 200;
		final int MAX_ESSAIS = 10;
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int valeurATrouve = rnd.nextInt(MAX_VALUE+1); // genere un nb entre 0 et 100
		int saisieUtilisateur=0;
		int nbEssais = 0;
		
		int min, max;
		min = 0;
		max = MAX_VALUE;
		do {
			do {
				System.out.println("Veuillez entrer un nombre entre " + min + " et " + max + " compris (" + (MAX_ESSAIS-nbEssais) + " tentatives restantes)");
				saisieUtilisateur = sc.nextInt();
				if (saisieUtilisateur < min) {
					System.out.println("Veuillez saisir un nombre suppérieur à " + min);
				} else if (saisieUtilisateur > max) {
					System.out.println("Veuillez saisir un nombre inférieur à " + max);
				}
			} while (saisieUtilisateur < min || saisieUtilisateur > max);
			nbEssais++;
			if (saisieUtilisateur < valeurATrouve) {
				min = saisieUtilisateur;
			} else if (saisieUtilisateur > valeurATrouve) {
				max = saisieUtilisateur;
			}
		} while (saisieUtilisateur != valeurATrouve && nbEssais < MAX_ESSAIS);
		if (saisieUtilisateur == valeurATrouve) {
			System.out.println("Bravo, vous avez trouve le nombre: " + valeurATrouve + " en " + nbEssais + " tentatives.");
		} else {
			System.out.println("Vous avez dépensé tout vos essais en vain, le nombre était : " + valeurATrouve + ".");
		}
		sc.close();
	}

}
