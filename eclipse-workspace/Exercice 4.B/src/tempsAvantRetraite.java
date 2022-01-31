import java.util.Scanner;

public class tempsAvantRetraite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yearsOld;
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez votre age svp");
		yearsOld = sc.nextInt();
		String result = getRetired(yearsOld);
		System.out.println( result);


	}//Fin Main
	
	
	public static String getRetired (int age) {

		if (age>60) {
			int differenceAge = (age -60);
			return " Vous etes à la retraite depuis " + differenceAge + " annee";
		}
		if (age==60) {
			return " Vous etes a la retraite ";		
		}
		if (age<0) {
			return " Vous n'etes pas encore né !!!";
		}
		else {
			int resteATravailler = (60 - age);
			
			String sOrNot = (resteATravailler > 1) ? "s" : ""; // Si el chiffre >1 annee prendra un S
			
			return " Vous devez encore travailler " + resteATravailler + " annee"+ sOrNot;
		}
	}
}// Fin Class