import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String saisieUtilisateur;
		int nombreDeSaisie=0;
		boolean reSaisissez=true;

		while ( reSaisissez){
			System.out.println("Veuillez saisir votre mot de passe svp, vous avez 3 essais? vous �tes � "+nombreDeSaisie+ " saisies");
			saisieUtilisateur=sc.next();
			nombreDeSaisie++;
			
			if(saisieUtilisateur.equals("Bonjour")) {
				reSaisissez=false;
				System.out.println("Vous �tes connect�");
			}
			else if  (!saisieUtilisateur.equals("Bonjour")){
				reSaisissez=true;
				
				if ( nombreDeSaisie>=3){
					reSaisissez=false;
					System.out.println("veuillez repondre � la question secrete: qu'avez vous fait d'important en 2021?");
					
					saisieUtilisateur=sc.next();
					saisieUtilisateur=String.format("toto %s ",saisieUtilisateur);
					System.out.println(saisieUtilisateur);
					
					if (!saisieUtilisateur.equals("formation")){
						System.out.println("compte bloqu�");
					}
					else {
						System.out.println("Vous �tes connect�");
					}
				}
			}
		}
		System.out.println(String.format("%.2s","HELLO"));
		
		sc.close();	
	}
}