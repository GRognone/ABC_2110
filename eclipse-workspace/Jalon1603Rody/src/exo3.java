import java.util.Scanner;

public class exo3 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String motDePasse = "";
		String reponseSecrete;
		int nombreDeSaisie=0;
		boolean reSaisissez=true;

		System.out.println("Veuillez saisir votre mot de passe svp, vous avez 3 essais");

		while (!motDePasse.equals("Bonjour") && nombreDeSaisie < 3){
			motDePasse=sc.next();

			if(motDePasse.equals("Bonjour")) {
				System.out.println(" Vous êtes connecté");
			}
			nombreDeSaisie++;
			
		}
		if ( !motDePasse.equals("Bonjour")){
			System.out.println("veuillez repondre à la question secrete: qu'avez vous fait d'important en 2021?");
			reponseSecrete=sc.next();
			if (!reponseSecrete.equals("formation")){
				System.out.println("compte bloqué");
			}
			else {
				System.out.println("Vous êtes connecté");
			}
		}
		sc.close();	
	}

}
