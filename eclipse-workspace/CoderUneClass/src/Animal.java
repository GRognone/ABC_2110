
public class Animal {

	private String espece; // attribut

	public String getEspece() // lire attributs
	{//fonction ( donne la possibilité de modifier la fonction) lire attributs
		return this .espece.toUpperCase();//this est une variable qui veut dire l'objet actuel
	}
	public void setEspece(String nouvelleEspece) //donne la possibilité de modifier la valeur de l'attribut
	{
		this.espece = nouvelleEspece;
	}
}