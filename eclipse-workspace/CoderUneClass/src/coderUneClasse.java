
public class coderUneClasse {

	public static void main(String[] args) {

		Animal monAnimal; // appel de la classe
		monAnimal = new Animal (); // initialise nouvel objet
		monAnimal.setEspece("chat");// donne une valeur à l'attribut
		System.out.println("Mon animal est  un " +monAnimal.getEspece());//affiche l'attribut
		Chat garfield = new Chat();//valeur de chat
		garfield.setEspece("claude");
		System.out.println("Mon animal est un "+monAnimal.getEspece()+ " et s'appel "+garfield.getEspece());
	}
}