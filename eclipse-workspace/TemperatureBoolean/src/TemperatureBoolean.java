import java.util.Scanner;

public class TemperatureBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float temps;
		boolean aDejaEteMalade =false; // signifie n'a jamais ete malade

		for (int i=0; i<5 ;i++) { // Compteur du nombre de boucles à effectuer
			System.out.println("Saisissez votre temperature");
			
			temps = sc.nextFloat();
			boolean macondition =(temps>36.4) && (temps<37.6);// Indication condition boleenne vrai la temperature doit être comprise entre 36,4 et 37,6 pour ne pas etre madade
			if (macondition) {
				System.out.println("Youpi vous n'êtres pas malade");
			}
			else {
				aDejaEteMalade=true;
				System.out.println("Vite allez coinsulter!!!");
			}			
		}
		if (!aDejaEteMalade) { // signifie n'a jamais ete malade 
			System.out.println("Vous etes chanceux avec tous les cas contacts autours de vous vous etes un rescape !!!!");	
		}
		else { // signifie sinon vous n'avez jamais ete malade
			System.out.println("Vous etes vraiment un nid a infection, isolez vous !!!");
		}		
		sc.close();
	}
}