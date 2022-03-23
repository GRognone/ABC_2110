import java.util.Scanner;

public class rechercheDichotomie {
/*Recherche par dichotomie d'un élément dans une table classée

Nous désirons chercher l'indice de la case de la table où se trouve le prénom, si il s'y trouve.
Pour cela, nous utiliserons la méthode de dichotomie (voir ci-dessous la méthode)
Donnez l'algorithme de la procédure qui recherche, par dichotomie le numéro du prénom recherché ou zéro s'il n'y 
est pas.

Algorithme:
On partitionne la table en 2 sous-tables et un élément médian, et, suivant le résultat de la comparaison de l'élément 
médian et du prénom recherché (plus grand, plus petit ou égal) on recommence la recherche sur une des 2 soustables, jusqu'à avoir trouvé ou obtenir une sous-table vide (le prénom est alors absent de la table).
On cherche 'olga' dans la table:
Milieu: élément 4
'olga'>'cunégonde' -> 'olga' est entre 4 et 7
milieu: élément 6
'olga' < 'raymonde' -> 'olga' est entre 4 et 6
mileu: élément 5
'olga' trouvé en 5

*/
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

		String[ ]monTableau;
		monTableau=new String[8];
		monTableau[0]= null;
		monTableau[1]="Agathe";
		monTableau[2]="Berthe";
		monTableau[3]="Cloé";
		monTableau[4]="Cunégonde";
		monTableau[5]="Olga";
		monTableau[6]="Raymonde";
		monTableau[7]="Sidonie";

		for (int i=0; i<monTableau.length;i++) {

		}
		sc.close();
	}
}