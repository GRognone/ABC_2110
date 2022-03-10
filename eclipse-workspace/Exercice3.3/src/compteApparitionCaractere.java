import java.util.Scanner;

public class compteApparitionCaractere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		char[ ] alphabet=new char [ ] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','\'','.',' '};
		String texte;
		int compteur;
		do {
			System.out.println(" Veuillez saisir un texte de 120 caracteres svp");
			//Je suis venu pour faire la preparatoire en abc developpement. J'aime vraiment ce que je fais. Vivement la qualifiante...
			texte=sc.nextLine().toLowerCase();
			System.out.println(texte.length());
		}
		while (texte.length()<120);
		for (int i=0; i<alphabet.length;i++){
			compteur=0;
			for(int j=0;j<texte.length();j++) {
				if (texte.charAt(j) == (alphabet[ i ])) {
					compteur++;
				}
			}
			if (compteur>=1) {
				System.out.println("Voici le les lettres de l'alphabet contenues dans le texte "+alphabet[i]+" et elles sont utilisées "+compteur+ " fois dans le texte");
			}
		}
		sc.close();
	}
}