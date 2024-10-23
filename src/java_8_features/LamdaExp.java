package java_8_features;

public class LamdaExp{

	public static void main(String []arg) {
		
		Functional sum = (a, b)->(a+b);
		
		Functional sub = (a, b)->(a-b);
		
		System.out.println((sum.mathOperation(1, 2)));
		
		System.out.println((sub.mathOperation(20, 10)));
		
		
	}
	
	

}
