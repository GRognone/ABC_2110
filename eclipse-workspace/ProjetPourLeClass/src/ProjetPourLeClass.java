//Le Class
public class ProjetPourLeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float nb1;
		double nb2;
		
		nb1=12F;
		nb2=14D;	
		
		nb2=(double)nb1;// transformer float en double
		
		nb1=(float)nb2; // transformer double en float

		//Math.PI etant un double on le transforme en float
//Solution 1
		nb1=(float)(nb1*Math.PI); 
//Solution 2
		nb1=nb1*(float)Math.PI;
		 
				
	}

}
