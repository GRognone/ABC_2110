import java.util.Scanner;

public class Exercice212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double distanceAConvertir;
		double distanceConvertieEnKm;
		double distanceConvertieEnMiles;
		String uniteDeMesure;

		System.out.println("Veuillez saisir la distance et son unite de mesure à convertir mi pour Miles ou km pour Kilometres svp");
		distanceAConvertir = sc.nextDouble();
		uniteDeMesure = sc.next().toLowerCase();
		do
		{
			System.out.println("Veuillez saisir uniquement l'unité de mesure d'origine svp");
			uniteDeMesure = sc.next().toLowerCase();
		} while (!uniteDeMesure.equals("mi") && !uniteDeMesure.equals("km"));
		
		if (uniteDeMesure.equals("mi")){
			distanceConvertieEnKm = distanceAConvertir * 1.609;
			System.out.println("La distance "+distanceAConvertir+" miles convertie est de" +distanceConvertieEnKm+" Km");
		}
		else if ((uniteDeMesure.equals("km"))) {
			distanceConvertieEnMiles = distanceAConvertir / 1.609;
			System.out.println("La distance "+distanceAConvertir+" Km convertie est de" +distanceConvertieEnMiles+" Miles");
		}
		else  {
			distanceConvertieEnMiles = distanceAConvertir / 1.609;
			System.out.println("La distance "+distanceAConvertir+" Km convertie est de" +distanceConvertieEnMiles+" Miles");
		}
		sc.close();
	}
}