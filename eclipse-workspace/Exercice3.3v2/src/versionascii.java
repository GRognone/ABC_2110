import java.util.Scanner;

public class versionascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String texte;
		int compteur;
		do {
			System.out.println(" Veuillez saisir un texte de 120 caracteres svp");
			//Je suis venu pour faire la preparatoire en abc developpement. J'aime vraiment ce que je fais. Vivement la qualifiante...
			texte=sc.nextLine().toLowerCase();
			System.out.println(texte.length());
		}
		while (texte.length()<120);
		/*
		 ASCII -> INT =((int)'a')    transformer ascii en int
		 INT->ASCII = ((char)22) transformer int en ascii
		 */
		for (int i='a'; i<='z';i++){ // parcourir alphabet
			compteur=0;
			for(int j=0;j<texte.length();j++) { //comparer texte et compter presence de chaque lettres
				if (texte.charAt(j) == ((char)i)) {
					compteur++;
				}
			}
			if (compteur>=1) {
				System.out.println("Voici le les lettres de l'alphabet contenues dans le texte "+ ((char)i) +" et elles sont utilisées "+compteur+ " fois dans le texte");
			}
		}
		sc.close();
	}
}