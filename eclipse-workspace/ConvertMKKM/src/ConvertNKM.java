import java.util.Scanner;

public class ConvertNKM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String distanceAConvertir;
		String [ ] tableauDeConversion;
		int valeur;
		String uniteDeMesure;
		double conversion;

		do {
			System.out.println("Entrez une valeur a convertir suivi d'un espace puis saisir l'unite de mesure  à convertir mi pour convertir miles en km et inversement.\nSi aucune unite saisie la valeur par defaut est km.");
			distanceAConvertir = sc.nextLine().toLowerCase(); // "12 mi"


			tableauDeConversion = distanceAConvertir.split (" ");

			valeur = Integer.valueOf(tableauDeConversion[0]); // transformation et recuperation valeur texte  "12 " en int

			if (tableauDeConversion.length > 1) { //  "length > 1 " case du chiffre saisi soit 0
				uniteDeMesure = tableauDeConversion[1];
			}
			else {
				uniteDeMesure = "km";
			}

			uniteDeMesure = uniteDeMesure.toLowerCase();
		}
		while(!uniteDeMesure.equals("mi") && !uniteDeMesure.equals("km"));

		if (uniteDeMesure.equals("km")){
			conversion = ((valeur *9/5)+32);
			System.out.println("La distance " +valeur+ " en Km vaut "+conversion+" Miles");
		}
		else {
			conversion = (valeur *1.609); 
			System.out.println("La distance "+valeur+" en Miles vaut "+conversion+" Km");
		}
		sc.close();
	}
}