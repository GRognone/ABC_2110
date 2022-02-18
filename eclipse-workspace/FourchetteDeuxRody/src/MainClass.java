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
		boolean minFinded, maxFinded;
		boolean saisieCorrecte;
		minFinded = maxFinded = false;
		min = 0;
		max = MAX_VALUE;
		do {
			do {
				saisieCorrecte = true;
				System.out.println("Veuillez entrer un nombre entre " + min + 
						(minFinded ? "(exclus)":"(compris)")+ " et " + max + (maxFinded ? "(exclus)":"(compris)") + 
						(MAX_ESSAIS-nbEssais) + " tentatives restantes)");
				saisieUtilisateur = sc.nextInt();
				if (saisieUtilisateur < min 	&& !minFinded) {
					System.out.println("Veuillez saisir un nombre suppérieur ou égal à " + min);
					saisieCorrecte = false;
				} else if (saisieUtilisateur <= min && minFinded) {
					System.out.println("Veuillez saisir un nombre suppérieur à " + min);
					saisieCorrecte = false;
				} else if (saisieUtilisateur > max && !maxFinded) {
					System.out.println("Veuillez saisir un nombre inférieur ou égal à " + max);
					saisieCorrecte = false;
				} else if (saisieUtilisateur >= max && maxFinded) {
					System.out.println("Veuillez saisir un nombre inférieur à " + max);
					saisieCorrecte = false;
				}
			} while (!saisieCorrecte);
			nbEssais++;
			if (saisieUtilisateur < valeurATrouve) {
				min = saisieUtilisateur;
				minFinded = true;
			} else if (saisieUtilisateur > valeurATrouve) {
				max = saisieUtilisateur;
				maxFinded = true;
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
