
public class Chat extends Animal { //extends veut dire que la classe chat herite de la classe animal

	public Chat()
	{
		super("chat");
	}
	public void manger()
	{
		super.manger();
		System.out.println("le chat mange des taupes");
		
	}
}