
public class ObjetCoursTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ageATester =99;
		String resultat = estIlMajeur (ageATester);
		System.out.println(resultat);
	}// Fin Main

	// creation de fonction qui renvois une valeur ( methode de classe)
	public static String estIlMajeur(int n) {
		return (n>=18 ? "Majeur":"Mineur");
	}
//	public static String estIlMajeur (int age) {
//
//		if (age>=18){
//			return "Majeur!";
//		}
//		else {
//			return "Mineur!";
//		}
//	}// Fin fonction

}//Fin Class
