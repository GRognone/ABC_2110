import java.util.Scanner;

public class CalculInteret {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float somme;
		float nombreAnnee;
		float interets;
		double valeurAcquiseSimple;
		double valeurAcquiseComposee;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Veuillez saisir la somme initiale");
		somme=sc.nextFloat();
		System.out.println("Veuillez saisir le nombre d'année");
		nombreAnnee=sc.nextFloat();
		System.out.println("Veuillez saisir le taux d'interets");
		interets=sc.nextFloat();
		
		valeurAcquiseSimple= (double)(somme*(1+nombreAnnee*interets/100));
		System.out.println("La valeur acquise simple est de "+valeurAcquiseSimple);
		valeurAcquiseComposee = (double)(somme*(Math.pow((1+interets/100),nombreAnnee)));	
		System.out.println("La valeur acquise composée est de "+valeurAcquiseComposee);
		sc.close();
	}

}
