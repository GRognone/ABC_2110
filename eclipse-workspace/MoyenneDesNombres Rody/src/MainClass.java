import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] split;
		
		System.out.println("entrez les nombres séparés par un \';\'");
		split = sc.nextLine().split(";");
		
		double sommeDesNombres=0;
		int saisieCorrectes = 0;
		for (int i = 0; i < split.length; i++) {
			try {
				sommeDesNombres+= 
					Float.parseFloat(split[i].trim());
				saisieCorrectes++;
			} catch (NumberFormatException e) {}
		}
		if (saisieCorrectes > 0) {
			sommeDesNombres/= saisieCorrectes;
		}
		// -- 
		System.out.println("La moyenne est de " + sommeDesNombres);
		
		sc.close();
	}

}
