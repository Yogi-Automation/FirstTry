
public class Polymorphism {

	public static void main(String[] args) {
		Male oMale = new Male();				// Overriding
		oMale.properties();
		Women oWomen = new Women();
		oWomen.properties();
		Kids oKid = new Kids();
		oKid.properties();
		
		
		SizeSelection oSize = new SizeSelection();
		oSize.size(32);							//Overloading
		oSize.size("xxl");
	}
}
