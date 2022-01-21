import java.util.Scanner;

public class Listerlesnombresparfait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);

		int combien;
		long nombreParfaitTrouve=0;
		long nombre=1;//*Valeur minimum du nombre
		long diviseur;
		long sommediviseurs = 0;

		System.out.println("Combien souhaitez-vous afficher de nombre parfait?");
		combien = sc.nextInt();
		System.out.println("Les nombres parfaits sont les suivants");

		while (nombreParfaitTrouve<combien) {

			for (diviseur = 1;diviseur<(nombre-1);diviseur++) {
				if (nombre%diviseur==0){
					sommediviseurs += diviseur;
				}	
			}
			if  (sommediviseurs==nombre){
				nombreParfaitTrouve++;
				System.out.println (nombre +" ");//*valeur du nombre parfait trouve (Anciennement System.out.println (nombreParfaitTrouve +" ")
			}
			sommediviseurs = 0;//** rajouter pour reinitialiser somme diviseurs
			nombre++;
		}
		sc.close();
	}
}