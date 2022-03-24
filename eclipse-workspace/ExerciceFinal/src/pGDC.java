import java.util.Scanner;

public class pGDC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*En arithmétique élémentaire, le plus grand commun diviseur ou PGCD de deux nombres entiers non nuls est le plus 
grand entier qui les divise simultanément. 
Par exemple, le PGCD de 20 et de 30 est 10, puisque leurs diviseurs communs sont 1, 2, 5 et 10.

Voici une spécification de l'algorithme de calcul du PGCD de deux nombres (entiers strictement positifs) p et q, selon 
cette méthode : 
Lire (p, q )
 TantQue p ≠ q 
 Faire 
 Si p > q Alors
 p ← p – q 
 Sinon 
 q ← q – p 
 FinSi 
 Fin TantQue
Ecrire( " PGCD = " , p ) 
Version 1 :

« Calcul_PGCD » qui accepte 2 nombres entiers en paramètres et retourne le PGCD calculé au format nombre entier.
La signature de la méthode Calcul_PGCD est : Calcul_PGCD ( int a , int b ) : int.

Exemple d’affichage en mode Console :
Programme de calcul du PGCD de 2 nombres entiers positifs
Saisir le 1er nombre : 
176
Saisir le 2nd nombre : 
892
Le PGCD de 176 et 892 est égal à 4.
Version 2 :
En vous inspirant des exercices précédents, proposez une version améliorée et intuitive du programme.
	}

}*/

		Scanner sc= new Scanner(System.in);
		int a;
		int b;
		int pGDC = Calcul_PGCD(sc.nextInt(),sc.nextInt());

		do {
			System.out.println("Veuillez saisir un 1er nombre entier superieur à 0 svp.");
			a = sc.nextInt();
		}
		while
			(a<1);
		do {
			System.out.println("Veuillez saisir un second nombre entier superieur à 0 svp.");
			b = sc.nextInt();
		}
		while
			(b<1);

		System.out.println("Le PGDC de " +a+ " et de "+b+ " est "+pGDC);
		sc.close();
	}

	public static int Calcul_PGCD (int a, int b){
;

		while   (a!=b){

			if (a>b) {
				a = b-a;
			}
				else if (a<b){
					b = b-a;
				}
			}
			return a;
			
		}
	}






