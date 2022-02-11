import java.util.Scanner;

public class Exercice212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String distanceAConvertir;
		double distanceConvertieEnKm;
		double distanceConvertieEnMiles;
		float valeur;
		String [ ] uniteDeMesure = new String[3];
		
		System.out.println("Veuillez saisir la distance svp");

		distanceAConvertir = sc.next();
		
		uniteDeMesure[0]  = distanceAConvertir;
		uniteDeMesure[1] = "km";
		uniteDeMesure[2] = "mile";
		
		valeur = Float.parseFloat(uniteDeMesure[0]);


		/*if(distanceAConvertirEnKm > 1) {//equivalence au ternaire sOrNot par un if else
			String sOrNot1 = "s";
		} else {
			String sOrNot1 = "";
		}
		if(distanceAConvertirEnMiles > 1) {//equivalence au ternaire sOrNot par un if else
			String sOrNot1 = "s";
		} else {
			String sOrNot1 = "";
		}
		*/
		distanceConvertieEnKm = valeur * 1.609;
		String sOrNot= (distanceConvertieEnKm>1) ? "s" : "";
		System.out.println("La distance "+distanceAConvertir+" mile convertie est de " +distanceConvertieEnKm+" "+uniteDeMesure[1]+sOrNot);


		distanceConvertieEnMiles = valeur / 1.609;
		sOrNot= (distanceConvertieEnMiles>1) ? "s" : "";
		System.out.println("La distance "+distanceAConvertir+" Km convertie est de" +distanceConvertieEnMiles+ " "+uniteDeMesure [2] +sOrNot);

		sc.close();
	}
}