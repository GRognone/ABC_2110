import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creer l'algorithme suivant
		// L'utilisateur est invité à saisir un nombre entre 5 et 10.
		//Afficher " trop grand", "trop petit" , ou "ok" selon le cas
		// par exemple, si l'utilisateur saisi le nombre 15, le programme affiche " trop grand".
		
		Scanner sc= new Scanner(System.in);
		int saisieUtilisateur;

		System.out.println(" Veuillez saisir un nombre entre 5 et 10 svp.");
		saisieUtilisateur = sc.nextInt();

		if (saisieUtilisateur<5) {
			System.out.println("trop petit");
		}
		else if (saisieUtilisateur>10) {
			System.out.println("trop grand");
		}
		else {
			System.out.println("OK");
		}		
		sc.close();
	}
}