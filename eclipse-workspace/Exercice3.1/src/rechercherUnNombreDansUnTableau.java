import java.util.Scanner;

public class rechercherUnNombreDansUnTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);

		int tableauDeNombreEntier [ ]= new int [10];

		int number;
		int temp=0;



		for (int i=0;i<tableauDeNombreEntier.length;i++){								 // tableau saisie des nombres
			System.out.println("Veuillez saisir un nombre entier svp");
			number=sc.nextInt();
			tableauDeNombreEntier [ i ]=number;
		}
		for (int i=0;i<tableauDeNombreEntier.length;i++)
		{									// tableau tri des nombres
			for(int j=i;j<tableauDeNombreEntier.length;j++)
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
		sc.close();
	}
}