import java.util.Scanner;

public class rechercheDichotomie {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String saisieUtilisateur;
		String[ ]monTableau;
		boolean prenomAbsent = true;
		
		monTableau=new String[8];
		monTableau[0]= "Zero";
		monTableau[1]="Agathe";
		monTableau[2]="Berthe";
		monTableau[3]="Cloe";
		monTableau[4]="Cunegonde";
		monTableau[5]="Olga";
		monTableau[6]="Raymonde";
		monTableau[7]="Sidonie";

		System.out.println("Veuillez saisir un prenom à rechercher svp en commençant par une majuscule svp.");
		saisieUtilisateur = sc.nextLine();
		
		System.out.println(saisieUtilisateur);

		if (saisieUtilisateur.compareTo(monTableau[4])>0) {
			for (int i=4; i<monTableau.length;i++) {
				if (saisieUtilisateur.compareTo(monTableau[i])==0) {
					System.out.println("Le prenom "+saisieUtilisateur+" se trouve à l'indice "+i+" du tableau");
					prenomAbsent = false;
				}
			}
		}
		else if (saisieUtilisateur.compareTo( monTableau[4])<0) {
			for (int i=1; i<monTableau.length/2;i++) {
				if ( saisieUtilisateur.compareTo(monTableau[i])==0) {
					System.out.println("Le prenom "+saisieUtilisateur+" se trouve à l'indice  "+i+" du tableau");
					prenomAbsent = false;
				}
			}
		}
		else if (saisieUtilisateur.compareTo(monTableau[4])==0) {
			System.out.println("Le prenom "+saisieUtilisateur+" se trouve à l'indice "+monTableau.length/2+" du tableau");
			prenomAbsent = false;
		}
		if (prenomAbsent) {
			System.out.println("Le prenom n'existe pas dans le tableau. ");
		}
		sc.close();
	}
}