
public class LesTableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaration di tableau
		int a;
		String [ ] monTableau;

		// instancier ( initialiser) affecter valeu tableau

		a=3;
		monTableau=new String[6];
		monTableau[0]="riri";
		monTableau[1]="fifi";
		monTableau[2]="loulou";
		monTableau[3]="picsou";
		monTableau[4]="donald";
		monTableau[5]="daisy";

		for (int i=0; i<monTableau.length ; i++) {
			
			monTableau[ i ] =monTableau [ i ] + "s";// rajout de la lettre s à tous les elements du tableau
			System.out.println(monTableau[ i ]+ " nbCaracter " +monTableau[ i ].length()); // " nbCaracter " +monTableau[ i ].length()  Affiche le nombre de caractere contenu dans  1 case 
		}
	}

}
