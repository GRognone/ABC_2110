import java.util.Scanner;

public class Exercice212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String distanceAConvertir;
		double distanceConvertieEnKm;
		double distanceConvertieEnMiles;
		

		System.out.println("Veuillez saisir la distance et son unite de mesure à convertir mi pour Miles ou km pour Kilometres svp");
		distanceAConvertir = sc.next();
		
		String [ ] tableau = distanceAConvertir.split(" ");
		int valeur= Integer.v
		
		/*if (uniteDeMesure.equals("mi")){
			distanceConvertieEnKm = distanceAConvertir * 1.609;
			System.out.println("La distance "+distanceAConvertir+" miles convertie est de " +distanceConvertieEnKm+" Km");
		
		}
		else  {
			uniteDeMesure.equals(null);
			distanceConvertieEnMiles = distanceAConvertir / 1.609;
			System.out.println("La distance "+distanceAConvertir+" Km convertie est de" +distanceConvertieEnMiles+" Miles");
		}*/
		sc.close();
	}
}