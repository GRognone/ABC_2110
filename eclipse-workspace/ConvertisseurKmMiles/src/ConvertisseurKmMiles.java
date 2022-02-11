import java.util.Scanner;

public class ConvertisseurKmMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double kilometres=0;
		double miles;
		String saisieUtilisateur;
		boolean veutQuitter = false;
		Scanner sc = new Scanner( System.in);

		do{
			System.out.println("Veuillez-saisir la distance en Km à convertir svp:");
			saisieUtilisateur = sc.next().toLowerCase();
			if (saisieUtilisateur.equals("q")) {
				veutQuitter = true;
				System.out.println("Au revoir");
			} else {
				kilometres = Double.parseDouble(saisieUtilisateur);
			}			 
		}
		while ((kilometres <0.01 || kilometres>1000000 )&& !veutQuitter) ;
		if (!veutQuitter) {
			if (kilometres>0) {
				miles = kilometres/1.609;
				System.out.println(" La distance  "+kilometres+" km en miles est de: "+miles+ "  miles.");
			}
		}
		sc.close();
	}
}