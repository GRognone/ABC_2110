import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class rechercherUnNombreDansUnTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);

		int tableauDeNombreEntier [ ]= new int [10];

		int number;
		int temp=0;
		int valeurRecherchee;
		int compteur=0;
		int index=-1;

		// Tableau Saisie des nombres 

		for (int i=0;i<tableauDeNombreEntier.length;i++){								 
			System.out.println("Veuillez saisir un nombre entier svp");
			number=sc.nextInt();
			tableauDeNombreEntier [ i ]=number;
		}

	/*	//Tableau tri croissant des nombres simplifié
		Arrays.sort(tableauDeNombreEntier); 
		for (int i=0;i<tableauDeNombreEntier.length;i++){	
			System.out.print(tableauDeNombreEntier[ i ] +" \t");  // pour afficher en ligne surtout ne pa metre le ln apres print
		}
*/
			//Tableau de tri des nombres version algorithme

		for (int i=0;i<tableauDeNombreEntier.length;i++)
		{									
			for(int j=i;j<tableauDeNombreEntier.length;j++) // a partir de ce point le programme compare les données
			{ 						
				if(tableauDeNombreEntier[ i ] >tableauDeNombreEntier[ j ])
				{
					temp = tableauDeNombreEntier [ i ];
					tableauDeNombreEntier [ i ] = tableauDeNombreEntier[ j ];
					tableauDeNombreEntier[ j ] = temp;
					j--; //  sert à reverifier que le nombre qui a été echangé est quand même plus petit que les suivants.
				}	
			}
			System.out.println(tableauDeNombreEntier[i]);
		}
		 

	/*	// Chercher combien de fois la même valeur est dans le tableau

		System.out.println("\n\nSaisissez le nombre a rechercher svp;");
		valeurRecherchee=sc.nextInt();
		for (int i=0;i<tableauDeNombreEntier.length;i++){
			if ( valeurRecherchee==tableauDeNombreEntier [ i ]) {
				compteur++;
			}
		}
		if (compteur==0) {
			System.out.println("Le nombre recherche n'existe pas!!");
		}
		else {
			System.out.println("Le nombre " + valeurRecherchee +" est entre fois "+compteur+ " dans le tableau java \n");
		}

		// trouver emplacement du tableau où se trouve le nombre recherche

		System.out.println("Saisissez le nombre a rechercher à rechercher svp;");
		valeurRecherchee=sc.nextInt();
		for (int i = 0; i < tableauDeNombreEntier.length; i++) {
			if ( valeurRecherchee==tableauDeNombreEntier [ i ]) {
				index=i;
				System.out.println("Le nombre recherche se trouve a l'emplacement "+ i );
			}
		}
		if (index<0) {
			System.out.println("Le nombre n'existe pas");
		}*/
		sc.close();
	}
}