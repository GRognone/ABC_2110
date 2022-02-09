import java.util.Scanner;

public class RodySoluce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String temperatureAConvertir;
		String [ ] tableauDeConversion;
		float valeur;
		String uniteDeMesure;
		double conversion;
		String reponse = "o";

		while (reponse.equals("o")) {
			do {
				System.out.println("Entrez une valeur a convertir suivi d'un espace puis saisir l'unite de mesure  à convertir C pour convertir degres en Fahrenheight et  F pour l'inverse.");
				temperatureAConvertir = sc.nextLine().toUpperCase();

				tableauDeConversion = temperatureAConvertir.split (" ");

				valeur = Integer.valueOf(tableauDeConversion[0]); // transformation et recuperation valeur texte  "12 " en int

				if (tableauDeConversion.length > 1) { //  "length > 1 " case du chiffre saisi soit 0
					uniteDeMesure = tableauDeConversion[1];
				}
				else {
					uniteDeMesure = "C";
				}
			}
			while(!uniteDeMesure.equals("C") && !uniteDeMesure.equals("F"));

			convertir(tableauDeConversion);
			reponse = "";
			while(!reponse.equals( "o") && !reponse.equals("n"))
			{
				System.out.println("Souhaitez-vous effectuer une autre conversion? O / N ");
				reponse = sc.nextLine().toLowerCase();
			}
		}
		System.out.println(" Au revoir");
		sc.close();
	}
	
	public static float convertir(String[] split) {
		String uniteDeMesure;
		if (split.length > 1) { //  "length > 1 " case du chiffre saisi soit 0
			uniteDeMesure = split[1];
		}
		else {
			uniteDeMesure = "C";
		}
		int valeur = Integer.valueOf(split[0]);
		float conversion;
		
		if (uniteDeMesure.equals("F")){
			conversion = ((valeur -32)*5/9);
			System.out.println("La temperature " +valeur+ " F = "+conversion+" C ");
		}
		else {
			conversion = ((valeur*9/5)+32); 
			System.out.println("La temperature "+valeur+" C =  "+conversion+" F ");
		}
		return conversion;
	}
}