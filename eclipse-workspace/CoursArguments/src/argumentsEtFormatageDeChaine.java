
public class argumentsEtFormatageDeChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//possibilité de code n°1(non securise)
		for (int i=0;i<args.length;i++) {
			System.out.println("L'argument n° "+ i +" vaut "+args [i]); // les args sont entrés via la commande run; run configuration, onglet argument et au dessu de variable rentrer tous les arguments
		}

		//possibilité de code n°2 (securise)
		for (int i=0;i<args.length;i++) {
			String sentence = String.format("L'argument n° %d vaut %s.", i,  args[i]);
			System.out.println(sentence);
		}

	}
}