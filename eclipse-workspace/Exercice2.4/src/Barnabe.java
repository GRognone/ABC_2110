import java.util.Scanner;

public class Barnabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		float sommeDeDepart;
		float sommeRestante;
		int nombreMagasinVisite=0;

		System.out.println("Veuillez-saisir le montant de départ svp.");
		sommeDeDepart = sc.nextFloat();
		sommeRestante = sommeDeDepart;

		do {
			sommeRestante = (sommeRestante/2)-1;
			System.out.println("Le montant restant est de " +sommeRestante+" suite achat magasin " +nombreMagasinVisite);
			nombreMagasinVisite ++;
		}
		while(sommeRestante>2);

		System.out.println("Vous avez visite " +nombreMagasinVisite+ " magasins");
		sc.close();
	}
}