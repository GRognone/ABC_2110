import java.util.Scanner;

public class rechercheDichotomie {
/*Recherche par dichotomie d'un �l�ment dans une table class�e

Nous d�sirons chercher l'indice de la case de la table o� se trouve le pr�nom, si il s'y trouve.
Pour cela, nous utiliserons la m�thode de dichotomie (voir ci-dessous la m�thode)
Donnez l'algorithme de la proc�dure qui recherche, par dichotomie le num�ro du pr�nom recherch� ou z�ro s'il n'y 
est pas.

Algorithme:
On partitionne la table en 2 sous-tables et un �l�ment m�dian, et, suivant le r�sultat de la comparaison de l'�l�ment 
m�dian et du pr�nom recherch� (plus grand, plus petit ou �gal) on recommence la recherche sur une des 2 soustables, jusqu'� avoir trouv� ou obtenir une sous-table vide (le pr�nom est alors absent de la table).
On cherche 'olga' dans la table:
Milieu: �l�ment 4
'olga'>'cun�gonde' -> 'olga' est entre 4 et 7
milieu: �l�ment 6
'olga' < 'raymonde' -> 'olga' est entre 4 et 6
mileu: �l�ment 5
'olga' trouv� en 5

*/
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

		String[ ]monTableau;
		monTableau=new String[8];
		monTableau[0]= null;
		monTableau[1]="Agathe";
		monTableau[2]="Berthe";
		monTableau[3]="Clo�";
		monTableau[4]="Cun�gonde";
		monTableau[5]="Olga";
		monTableau[6]="Raymonde";
		monTableau[7]="Sidonie";

		for (int i=0; i<monTableau.length;i++) {

		}
		sc.close();
	}
}