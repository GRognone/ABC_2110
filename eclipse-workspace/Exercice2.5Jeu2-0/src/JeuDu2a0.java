import java.util.Random;
import java.util.Scanner;

public class JeuDu2a0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner( System.in);
		Random rnd = new Random();

		int ai;
		int player;
		int result;
		int playerPoint=0;
		int aiPoint=0;
		boolean recommencer=true;

		while(recommencer){
			ai= rnd.nextInt(3);
			System.out.println("Joueur saisissez un nombre entier compris entre 0 et 2 svp.");
			player=sc.nextInt();

			if (player<0){
				recommencer =false;
				System.out.println("Partie termine");
			}
			else if (player>2) {
				System.out.println("Nombre saisi trop grand.\n");
			}
			
			//debut comparaisons
			else {

				if ((player<ai)&&((ai-player)>1)){
					aiPoint++;
					System.out.println("L'ordinateur marque 1 point\n");
				}
				else if ((player<ai)&&((ai-player)==1)){
					playerPoint++;
					System.out.println("Le joueur marque 1point\n");
				}
				else if ((player>ai)&&((player-ai)>1)){
					playerPoint++;
					System.out.println("Le joueur marque 1 point\n");
				}
				else if ((player>ai)&&((player-ai)==1)){
					aiPoint++;
					System.out.println("L'ordinateur marque 1 point\n");
				}
				else {
					System.out.println("Egalite personne ne marque le point.\n");
				}
				System.out.println("L'ordinateur a "+aiPoint+ " points, le joueur a "+playerPoint+" points\n");

				if (aiPoint==10) {
					recommencer = false;
					System.out.println("l'ordinateur gagne, fin de partie.");	
				}
				else if (playerPoint==10){
					recommencer = false;
					System.out.println("Le joueur gagne, fin de partie.");	
				}
			}
		}
		sc.close();
	}
}