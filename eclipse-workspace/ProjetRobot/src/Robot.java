import java.util.Scanner;
public class Robot { 		// Création des attributs de la classe

	private String numeroDeSerie;
	private boolean enMarche;
	private String typeDeDeplacement;
	private boolean aDesBras;
	private float positionX;
	private float positionY;
	private float positionZ;

	public Robot() { 		// Etat par défaut de l'objet appele "Constructeur"
		numeroDeSerie="0";
		enMarche= false;
		aDesBras= true;
		positionX=0;
		positionY=0;
		positionZ=0;
	}
	public Robot (String numeroDeSerie,
			boolean _enMarche,
			String _typeDeDeplacement,
			boolean _aDesBras,
			float _positionX,
			float _positionY,
			float _positionZ) {

		this .numeroDeSerie = numeroDeSerie;
			enMarche = _enMarche;
			aDesBras = _enMarche;
			positionX = _positionX;
			positionY = _positionY;
			positionZ = _positionZ;
		}
	

	// fonction : il renvois un boolean , ici la valeur du boolean est "true"
	public boolean caVa(boolean ilFaitBeau) {
		if ( ilFaitBeau){
			return true;
		}
		else {
			return false;
		}
	}
/*
	// procedure : ne renvois rien ( void = rien)
	public void caVa(){
	}
	// Opérations 

	public boolean demarrer(){
		return true;
	}
	public boolean arreter() {
		return false;
	}
	public boolean seDeplacer(float positionX, float positionY) {
		return true;
	}
	public boolean sauter(float hauteur) {
		return true;
	}
	public boolean attraperDesObjets() {
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
*/
	}


