public class Animal implements IAnimal{

	static final public int AFFAME =0;
	static final public int KITKAT= 1;
	static final public int RASSASIE=2;

	private String espece; // attribut
	private int satiete;

	public Animal()// constructeur ne renvois rien( et est appele avec le meme  nom que la classe et donne une valeur par defaut de la classe
	{
		this.satiete = Animal.KITKAT;
	}
	public Animal(String _espece)//idem mais avec un parametre 

	{
		this.setEspece (_espece);
	}
	public void manger()
	{
		System.out.println("l'animal mange");
	}
	public String getEspece() // lire attributs
	{//fonction ( donne la possibilité de modifier la fonction) lire attributs
		return this .espece.toUpperCase();//this est une variable qui veut dire l'objet actuel
	}
	public void setEspece(String nouvelleEspece) //donne la possibilité de modifier la valeur de l'attribut
	{
		this.espece = nouvelleEspece;
	}
}