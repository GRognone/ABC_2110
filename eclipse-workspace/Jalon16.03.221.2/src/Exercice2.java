import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creer le programme suivant
		// l'utilisateur est invité à saisir un nombre, le programme affiche le nombre et les 10 suivants.

		Scanner sc= new Scanner ( System.in);

		int saisieUtilisateur;

		System.out.println(" Veuillez saisir un nombre svp");
		saisieUtilisateur = sc.nextInt();

		System.out.println("Voici la liste des 10 nombres: ");
		for ( int i=0; i<11;i++) { // pour ne pas afficher le nombre utilisateur initialiser i à 1
			//for (indice; conditiond'arret;incrementation)
			System.out.print( saisieUtilisateur + i + " ");
		}

		/* autre alternative pour l'affichage

		 for ( int i=saisieUtilisateur; i<saisieUtilisateur+10;i++) {

			System.out.print(  i + " ");
		}
		 */

		sc.close();
	}
}