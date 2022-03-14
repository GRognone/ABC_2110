import java.util.Scanner;

public class TrierUnTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
int nombre;
int tableauDeNombreEntier[ ]= new int[10];
int temp=0;

System.out.println("Veuillez saisir 10 nombres séparés par un espace svp");// saisie des nombres dans le tableau
for (int i=0; i<tableauDeNombreEntier.length;i++) {
	nombre=sc.nextInt();
	tableauDeNombreEntier[i] = nombre ;
}
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
	System.out.print(tableauDeNombreEntier[i]+" ");// affichage de tous les resultats en sur 1 ligne
}
sc.close();
	}
}