
public class coderUneClasse {

	public static void main(String[] args) {

		Animal monAnimal; // appel de la classe
		Animal monAnimal2;
		
		monAnimal = new Animal ("taupe"); // initialise nouvel objet
		monAnimal2 = new Animal();
		
		//monAnimal.setEspece("chat");// donne une valeur à l'attribut ( n'est plus indispensable si cree dans classe chat
		
		System.out.println("Mon animal est  une " +monAnimal.getEspece());//affiche l'attribut
		monAnimal.manger();
		Chat garfield = new Chat();//valeur de chat
		garfield.manger();
		monAnimal2 = new Chien();
		Chien zeus = new Chien();
		
		//garfield.setEspece("claude");n'est plus indispensable car cree dan classe chat 
		
		System.out.println("Mon animal est une "+monAnimal.getEspece()+ " et s'appel "+garfield.getEspece()+" et "+zeus.getEspece());
	}
}