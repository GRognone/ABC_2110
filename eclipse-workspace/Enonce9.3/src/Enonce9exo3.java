import java.util.Scanner;

public class Enonce9exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARATION

		int anneeA;

		Scanner sc = new Scanner( System.in);//creation d'un scanner

		// SAISIE
		//ecrire (" Veuillez-saisir l'annee")
		System.out.println("Veuillez-saisir l'annee");

		//TRAITEMENT

		anneeA = sc.nextInt();
		if ((anneeA%4==0) && ((anneeA%100!=0) || (anneeA%400==0))){
			System.out.println("Bissextile");
		}
		else  {
			System.out.println("Non bissextile");
		}
		sc.close();
	}

}