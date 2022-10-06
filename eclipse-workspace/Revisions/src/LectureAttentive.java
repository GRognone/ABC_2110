import java.util.Scanner;

public class LectureAttentive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Pour l’énoncé, vous ferez une lecture attentive. 
		//Si malgré tout, il vous semble ne pas l'avoir bien compris, vous le relirez;
		//si après cette relecture, le texte ne vous paraît pas clair, 
		//vous demanderez des renseignements complémentaires à l'un de vos formateurs. 
		//Vous pourrez alors commencer le travail demandé, écrire le pseudo-code, le vérifier, 
		//écrire le programme, constituer le jeu d'essai et tester le programme. 

		Scanner sc= new Scanner(System.in);

		String compris;
		String relecture;

		System.out.println("Effectuez une lecture attentive de l'enonce");
		do
		{
			System.out.println("Avez-vous compris l'énoncé? oui/non");
			compris = sc.next().toLowerCase();
		} while (!compris.equals("oui") && !compris.equals("non"));



		if	(compris.equals ("non")) {

			System.out.println("Relisez l'enonce");
			do
			{
				System.out.println("Avez-vous compris l'énoncé? oui/non");
				relecture = sc.next().toLowerCase();
			} while (!relecture.equals("oui") && !relecture.equals("non"));


			if(relecture.equals("non")){
				System.out.println("Demandez des renseignements complémentaire a votre formateur.");	
			}
		}

		System.out.println("Commencez le travail demandé, écrire le pseudo-code, le verifier, ecrire le programme,constituer le jeu d'essai et tester le programme."); 
		sc.close();
	}
}