import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String saisie;
		String uniteMesure;
		double val;
		Scanner sc = new Scanner(System.in);
		saisie = sc.nextLine();
		uniteMesure = saisie.substring(saisie.length()-2, saisie.length());
		val = Double.parseDouble(saisie.substring(0, saisie.length()-3));
		if (uniteMesure.equals("mi")) {
			val++;
		} else if (uniteMesure.equals("km")) {
			val--;
		}
		System.out.println(val);
		//System.out.println(saisie.substring(0,1)+saisie.substring(2,3));
		sc.close();
	}

}
