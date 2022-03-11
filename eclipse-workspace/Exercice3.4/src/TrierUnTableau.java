import java.util.Scanner;

public class TrierUnTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
int nombre;
int tableauDeNombreEntier[ ]= new int[10];

System.out.println("Veuillez saisir 10 nombres séparés par un espace svp");
for (int i=0; i<tableauDeNombreEntier.length;i++) {
	nombre=sc.nextInt();
	tableauDeNombreEntier[i] = nombre ;
}

sc.close();
	}
}